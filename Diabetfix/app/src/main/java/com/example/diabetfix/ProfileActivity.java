package com.example.diabetfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ProfileActivity extends AppCompatActivity {
    TextView textViewId, textViewUsername, textViewActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // If the user is not logged in, begin login activity
        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }

        textViewId = (TextView) findViewById(R.id.textViewId);
        textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        textViewActivities = (TextView) findViewById(R.id.textViewActivities);

        // Get the current user
        final User user = SharedPrefManager.getInstance(this).getUser();

        // Set the values to the textviews
        textViewId.setText(String.valueOf("Token"));
        textViewUsername.setText(user.getUsername());
        //textViewActivities.setText(user.getActivities());

        findViewById(R.id.buttonAddActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                addActivity(user.getUsername(), user.getToken(), user);
            }
        });

        // When the user presses the logout button,
        // call the logout method
        findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
            }
        });
    }

//    private void addActivity (final String username, final String token, final User user) {
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_ADD_ACTIVITY,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        try {
//                            // Get the user from the response
//                            JSONObject responseJson = new JSONObject(response);
//                            Log.d("loginresponse", responseJson.toString());
//
//                            // Store the activity json response into shared preferences
//                            SharedPrefManager.getInstance(getApplicationContext()).addActivity(user, responseJson.toString());
//
//                            // Start the profile
//                            finish();
//                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("username", username);
//                params.put("secret_token", token);
//                JSONObject newActivityObj = new JSONObject();
//                try {
//                    newActivityObj.put("kind", "run");
//                    newActivityObj.put("duration", "10");
//                    newActivityObj.put("time", "Monday");
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                params.put("newActivity", newActivityObj.toString());
//                return params;
//            }
//
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("Authorization", "JWT " + token);
//                return params;
//            }
//        };
//        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
//    }
}

