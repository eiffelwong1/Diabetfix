package com.example.diabetfix;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.lang.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

public class FoodFragment extends Fragment {

    private boolean isHighInCarbs = true;
    private String jsonStr;

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Boolean> carbBools = new ArrayList<>();
    private ArrayList<Integer> loggedTimes = new ArrayList<>();

    //Don't need to populate these ones
    private ArrayList<Integer> glucoseLevels = new ArrayList<>();
    private ArrayList<Integer> durations = new ArrayList<>();

    //Get current user
    private User user;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.food_fragment, container, false);
        user = SharedPrefManager.getInstance(getContext()).getUser();

        //Input here the number for recommended carbs intake
        jsonStr = user.getFood();

        ArrayList<Integer> tempGlucoseList = new ArrayList<>();
        parseGlucose(user.getGlucoseLevels(), tempGlucoseList);
        int averageGlucose;
        if (tempGlucoseList.size() == 0)
        {
            averageGlucose = 120;
        }
        else
        {
            averageGlucose = calculateAverage(tempGlucoseList);
        }

        ArrayList<Integer> tempActivityList = new ArrayList<>();
        parseActivity(user.getActivities(), tempActivityList);
        int recentActivityTime = 0;
        if (durations.size() > 0)
        {
            recentActivityTime = tempActivityList.get(tempActivityList.size() - 1);
        }

        int healthScore = Score.getOverallScore(0,user.getHeight(), user.getWeight(),user.getAge(), recentActivityTime, averageGlucose);
        boolean haveDiabetes = user.getDiabeticStatus();

        Vector<Map<String, Integer>> breakfast = Context.loadUserBreakfastPattern(jsonStr);
        Vector<Map<String, Integer>> lunch = Context.loadUserLunchPattern(jsonStr);
        Vector<Map<String, Integer>> dinner = Context.loadUserDinnerPattern(jsonStr);
        Vector<Map<String, Integer>> snack = Context.loadUserSnackPattern(jsonStr);

        TextView recommendText = view.findViewById(R.id.foodRecommendation);
        recommendText.setText(Context.makeFoodRecommendation(healthScore, haveDiabetes, breakfast, lunch, dinner, snack));

        Button btn = view.findViewById(R.id.addFoodLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddFood(v);
            }
        });

        parseFood(jsonStr);

        initRecyclerView(view);

        
        return view;
    }

    private void onAddFood(final View view)
    {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setCancelable(false);

        //Creates layout to add EditText to
        final LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        final TextView foodLabel = new TextView(getActivity());
        foodLabel.setText("Name:");
        foodLabel.setLayoutParams(lp);
        layout.addView(foodLabel);

        final EditText foodName = new EditText(getActivity());
        foodName.setHint("Broccoli");
        foodName.setLayoutParams(lp);
        layout.addView(foodName);

        final TextView timeLabel = new TextView(getActivity());
        timeLabel.setText("Hour eaten in military time (0-23):");
        timeLabel.setLayoutParams(lp);
        layout.addView(timeLabel);

        final EditText time = new EditText(getActivity());
        time.setHint("14 (for 2pm)");
        time.setInputType(InputType.TYPE_CLASS_NUMBER);
        time.setLayoutParams(lp);
        //Make input limited to two digits
        InputFilter[] FilterArray = new InputFilter[1];
        FilterArray[0] = new InputFilter.LengthFilter(2);
        time.setFilters(FilterArray);

        layout.addView(time);

        final TextView carbsLabel = new TextView(getActivity());
        carbsLabel.setText("Food high in carbs: ");
        carbsLabel.setLayoutParams(lp);
        layout.addView(carbsLabel);

        final RadioGroup rg = new RadioGroup(getActivity());
        rg.setOrientation(RadioGroup.HORIZONTAL);

        final RadioButton rb1 = new RadioButton(getActivity());
        rb1.setText("True");
        rb1.setId(view.getId());
        final RadioButton rb2 = new RadioButton(getActivity());
        rb2.setText("False");
        rb1.setId(view.getId());

        isHighInCarbs = true;

        rg.addView(rb1);
        rg.addView(rb2);
        rg.check(rb1.getId());
        layout.addView(rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                for (int i = 0; i < group.getChildCount(); i++)
                {
                    RadioButton btn = (RadioButton) group.getChildAt(i);
                    if (btn.getId() == checkedId)
                    {
                        isHighInCarbs = Boolean.parseBoolean(btn.getText().toString());
                    }
                }
            }
        });

        alertBuilder.setView(layout);

        alertBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = (foodName.getText().toString());
                if (time.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a time",
                            Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
                else
                {
                    int foodTime = Integer.parseInt(time.getText().toString());

                    if (foodTime < 0 || foodTime > 23)
                    {
                        Toast.makeText(getActivity(), foodTime + " is not valid. Please enter a number 0-23",
                                Toast.LENGTH_LONG).show();
                    }
                    else if (name.isEmpty())
                    {
                        Toast.makeText(getActivity(), "Please enter a name",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        //Use name, foodTime, isHighInCarbs and user to enter into database
                        names.add(name);
                        loggedTimes.add(foodTime);
                        carbBools.add(isHighInCarbs);

                        //Update food recommendation
                        jsonStr = user.getFood();

                        ArrayList<Integer> tempGlucoseList = new ArrayList<>();
                        parseGlucose(user.getGlucoseLevels(), tempGlucoseList);
                        int averageGlucose;
                        if (tempGlucoseList.size() == 0)
                        {
                            averageGlucose = 120;
                        }
                        else
                        {
                            averageGlucose = calculateAverage(tempGlucoseList);
                        }

                        ArrayList<Integer> tempActivityList = new ArrayList<>();
                        parseActivity(user.getActivities(), tempActivityList);
                        int recentActivityTime = 0;
                        if (durations.size() > 0)
                        {
                            recentActivityTime = tempActivityList.get(tempActivityList.size() - 1);
                        }

                        int healthScore = Score.getOverallScore(0,user.getHeight(), user.getWeight(),user.getAge(), recentActivityTime, averageGlucose);
                        boolean haveDiabetes = user.getDiabeticStatus();

                        Vector<Map<String, Integer>> breakfast = Context.loadUserBreakfastPattern(jsonStr);
                        Vector<Map<String, Integer>> lunch = Context.loadUserLunchPattern(jsonStr);
                        Vector<Map<String, Integer>> dinner = Context.loadUserDinnerPattern(jsonStr);
                        Vector<Map<String, Integer>> snack = Context.loadUserSnackPattern(jsonStr);

                        TextView recommendText = getView().findViewById(R.id.foodRecommendation);
                        recommendText.setText(Context.makeFoodRecommendation(healthScore, haveDiabetes, breakfast, lunch, dinner, snack));

                        // Add food to database
                        addFood(user.getUsername(), user.getToken(), user, name, isHighInCarbs, foodTime);
                        Toast.makeText(getActivity(), name + " successfully logged", Toast.LENGTH_LONG).show();
                        dialog.cancel();

                    }

                }



            }
        })
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertBuilder.create();
        alert.setTitle("Log food");
        alert.show();
    }

    private void initRecyclerView(View v)
    {
        RecyclerView recyclerView = v.findViewById(R.id.foodRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names, glucoseLevels, durations,
                carbBools, loggedTimes, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void parseFood(String jsonStr)
    {

        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            System.out.println(obj);
            String foodName = obj.get("name").getAsString();
            boolean hc = obj.get("high_carbs").getAsBoolean();
            int time = obj.get("time").getAsInt();

            names.add(foodName);
            carbBools.add(hc);
            loggedTimes.add(time);

        }
    }

    private void addFood (final String username, final String token,
                              final User user, final String name, final boolean isHighInCarbs, final int time) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_ADD_FOOD,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            // Get the user from the response
                            JSONObject responseJson = new JSONObject(response);
                            Log.d("loginresponse", responseJson.toString());

                            // Store the activity json response into shared preferences
                            SharedPrefManager.getInstance(getContext().getApplicationContext()).addFood(user, responseJson.toString());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // DOES NOT WORK
//                        Toast.makeText(getContext().getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", username);
                params.put("secret_token", token);
                JSONObject newFoodObj = new JSONObject();
                try {
                    newFoodObj.put("name", name);
                    newFoodObj.put("high_carbs", Boolean.toString(isHighInCarbs));
                    newFoodObj.put("time", Integer.toString(time));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                params.put("newFood", newFoodObj.toString());
                return params;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("Authorization", "JWT " + token);
                return params;
            }
        };
        VolleySingleton.getInstance(getContext()).addToRequestQueue(stringRequest);
    }

    private void parseGlucose(String jsonStr, ArrayList<Integer> glucoseList)
    {
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            int glucose = obj.get("level").getAsInt();

            glucoseList.add(glucose);
        }
    }

    private void parseActivity(String jsonStr, ArrayList<Integer> activityList)
    {
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i) {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            int duration = obj.get("duration").getAsInt();

            activityList.add(duration);
        }
    }

    private int calculateAverage(ArrayList<Integer> glucoseLevels)
    {
        if (glucoseLevels.size() == 0)
        {
            return 0;
        }

        int sum = 0;
        for (int glucoseLevel: glucoseLevels)
        {
            sum += glucoseLevel;
        }
        return sum/glucoseLevels.size();
    }


}
