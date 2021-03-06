package com.example.diabetfix;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class ExerciseFragment extends Fragment {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> durations = new ArrayList<>();
    private ArrayList<Integer> loggedTimes = new ArrayList<>();

    //Don't need to populate these ones
    private ArrayList<Boolean> carbBools = new ArrayList<>();
    private ArrayList<Integer> glucoseLevels = new ArrayList<>();

    String jsonStr;


    //Get current user
    private User user;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.exercise_fragment, container, false);
        user = SharedPrefManager.getInstance(getContext()).getUser();

        //Input here the number for recommended carbs intake
        jsonStr = user.getActivities();
        Vector<Map<String, Integer>> activityPattern = Context.loadUserActivityPattern(jsonStr);

        TextView exerciseText = view.findViewById(R.id.exerciseScore);
        exerciseText.setText(Context.makeActivityRecommendation(activityPattern));

        Button btn = view.findViewById(R.id.addExerciseLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddExercise(v);
            }
        });

        parseActivity(jsonStr);

        initRecyclerView(view);


        return view;
    }

    private void onAddExercise(final View view)
    {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setCancelable(false);

        //Creates layout to add EditText to
        final LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        final TextView exerciseLabel = new TextView(getActivity());
        exerciseLabel.setText("Name:");
        exerciseLabel.setLayoutParams(lp);
        layout.addView(exerciseLabel);

        final EditText exerciseName = new EditText(getActivity());
        exerciseName.setHint("Jogging");
        exerciseName.setLayoutParams(lp);
        layout.addView(exerciseName);

        final TextView timeLabel = new TextView(getActivity());
        timeLabel.setText("Hour done in military time (0-23):");
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

        final TextView durationLabel = new TextView(getActivity());
        durationLabel.setText("Duration (in minutes): ");
        durationLabel.setLayoutParams(lp);
        layout.addView(durationLabel);

        final EditText duration = new EditText(getActivity());
        duration.setHint("30");
        duration.setInputType(InputType.TYPE_CLASS_NUMBER);
        duration.setLayoutParams(lp);
        layout.addView(duration);


        alertBuilder.setView(layout);

        alertBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = (exerciseName.getText().toString());

                if (time.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a time",
                            Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
                else if (duration.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a duration",
                            Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
                else
                {
                    int exerciseTime = Integer.parseInt(time.getText().toString());
                    int durationTime = Integer.parseInt(duration.getText().toString());


                    if (exerciseTime < 0 || exerciseTime > 23)
                    {
                        Toast.makeText(getActivity(), exerciseTime + " is not valid. Please enter a number 0-23",
                                Toast.LENGTH_LONG).show();
                    }
                    else if (name.isEmpty())
                    {
                        Toast.makeText(getActivity(), "Please enter a name",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        //Use name, foodTime, durationTime and user to enter into database
                        names.add(name);
                        loggedTimes.add(exerciseTime);
                        durations.add(durationTime);

                        //Update text recommendation
                        jsonStr = user.getActivities();
                        Vector<Map<String, Integer>> activityPattern = Context.loadUserActivityPattern(jsonStr);

                        TextView exerciseText = getView().findViewById(R.id.exerciseScore);
                        exerciseText.setText(Context.makeActivityRecommendation(activityPattern));

                        // Add activity to database
                        addActivity(user.getUsername(), user.getToken(), user, name, exerciseTime, durationTime);
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
        alert.setTitle("Log Exercise");
        alert.show();
    }

    private void initRecyclerView(View v)
    {
        RecyclerView recyclerView = v.findViewById(R.id.exerciseRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names, glucoseLevels, durations,
                carbBools, loggedTimes, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }


    private void parseActivity(String jsonStr)
    {
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i) {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            String activityName = obj.get("kind").getAsString();
            int time = obj.get("time").getAsInt();
            int duration = obj.get("duration").getAsInt();

            names.add(activityName);
            loggedTimes.add(time);
            durations.add(duration);
        }
    }

    private void addActivity (final String username, final String token,
                              final User user, final String name, final int time, final int duration) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_ADD_ACTIVITY,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            // Get the user from the response
                            JSONObject responseJson = new JSONObject(response);
                            Log.d("loginresponse", responseJson.toString());

                            // Store the activity json response into shared preferences
                            SharedPrefManager.getInstance(getContext().getApplicationContext()).addActivity(user, responseJson.toString());

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
                JSONObject newActivityObj = new JSONObject();
                try {
                    newActivityObj.put("kind", name);
                    newActivityObj.put("duration", Integer.toString(duration));
                    newActivityObj.put("time", Integer.toString(time));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                params.put("newActivity", newActivityObj.toString());
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
}