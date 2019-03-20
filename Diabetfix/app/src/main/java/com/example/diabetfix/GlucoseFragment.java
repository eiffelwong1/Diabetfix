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

public class GlucoseFragment extends Fragment {

    private ArrayList<Integer> glucoseLevels = new ArrayList<>();
    private ArrayList<Integer> loggedTimes = new ArrayList<>();

    //Don't need to populate these ones
    private ArrayList<Boolean> carbBools = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> durations = new ArrayList<>();

    //Get current user
    private User user;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.glucose_fragment, container, false);
        user = SharedPrefManager.getInstance(getContext()).getUser();



        Button btn = view.findViewById(R.id.addGlucoseLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddGlucose(v);
            }
        });

        parseGlucose(user.getGlucoseLevels());

        //Input here the number for recommended carbs intake

        int recentBloodSugar = 0;
        if (glucoseLevels.size() > 0)
        {
            recentBloodSugar = glucoseLevels.get(glucoseLevels.size() - 1);
        }
        int bloodSugarScore = Score.getBloodSugarScore(recentBloodSugar);
        TextView glucoseText = view.findViewById(R.id.glucoseScore);
        glucoseText.setText(Integer.toString(bloodSugarScore));

        initRecyclerView(view);


        return view;
    }

    private void onAddGlucose(final View view)
    {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setCancelable(false);

        //Creates layout to add EditText to
        final LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        final TextView glucoseLabel = new TextView(getActivity());
        glucoseLabel.setText("Glucose Level:");

        glucoseLabel.setLayoutParams(lp);
        layout.addView(glucoseLabel);

        final EditText glucoseLevelText = new EditText(getActivity());
        glucoseLevelText.setHint("100");
        glucoseLevelText.setInputType(InputType.TYPE_CLASS_NUMBER);
        glucoseLevelText.setLayoutParams(lp);
        layout.addView(glucoseLevelText);

        final TextView timeLabel = new TextView(getActivity());
        timeLabel.setText("Hour logged in military time (0-23):");
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

        alertBuilder.setView(layout);

        alertBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (glucoseLevelText.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a glucose level",
                            Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
                else if (time.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a time",
                            Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
                else
                {
                    int glucoseLevel = Integer.parseInt(glucoseLevelText.getText().toString());
                    int glucoseTime = Integer.parseInt(time.getText().toString());


                    if (glucoseTime < 0 || glucoseTime > 23)
                    {
                        Toast.makeText(getActivity(), glucoseTime + " is not valid. Please enter a number 0-23",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        //Use glucoseTime, glucoseLevel and user to enter into database
                        loggedTimes.add(glucoseTime);
                        glucoseLevels.add(glucoseLevel);

                        //Update BloodSugarScoreText
                        int bloodSugarScore = Score.getBloodSugarScore(glucoseLevels.get(glucoseLevels.size() - 1));
                        System.out.println(bloodSugarScore);
                        TextView glucoseText = view.findViewById(R.id.glucoseScore);
                        glucoseText.setText(Integer.toString(bloodSugarScore));

                        // Add glucose level to database
                        addGlucose(user.getUsername(), user.getToken(), user, glucoseLevel, glucoseTime);
                        Toast.makeText(getActivity(), glucoseLevel + " successfully logged", Toast.LENGTH_LONG).show();
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
        alert.setTitle("Log Glucose Level");
        alert.show();
    }

    private void initRecyclerView(View v)
    {
        RecyclerView recyclerView = v.findViewById(R.id.glucoseRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names, glucoseLevels, durations,
                carbBools, loggedTimes, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void parseGlucose(String jsonStr)
    {
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            int glucose = obj.get("level").getAsInt();
            int time = obj.get("time").getAsInt();

            glucoseLevels.add(glucose);
            loggedTimes.add(time);
        }
    }

    private void addGlucose (final String username, final String token,
                          final User user, final int glucoseLevel, final int time) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_ADD_GLUCOSE_LEVEL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            // Get the user from the response
                            JSONObject responseJson = new JSONObject(response);
                            Log.d("loginresponse", responseJson.toString());

                            // Store the activity json response into shared preferences
                            SharedPrefManager.getInstance(getContext().getApplicationContext()).addGlucoseLevel(user, responseJson.toString());

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
                JSONObject newGlucoseObj = new JSONObject();
                try {
                    newGlucoseObj.put("level", Integer.toString(glucoseLevel));
                    newGlucoseObj.put("time", Integer.toString(time));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                params.put("newGlucoseLevel", newGlucoseObj.toString());
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