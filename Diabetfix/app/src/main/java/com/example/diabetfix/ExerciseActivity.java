package com.example.diabetfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
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

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Get the current user
        final User user = SharedPrefManager.getInstance(this).getUser();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            // Get the user from the response
                            JSONObject userJson = new JSONObject(response);
                            Log.d("loginresponse", userJson.toString());
                            // Get the info object
                            JSONObject userInfoJson = new JSONObject(userJson.getString("info"));
                            // Get the data object
                            JSONObject userDataJson = new JSONObject(userJson.getString("data"));
                            User user = new User(
                                    userJson.getString("_id"),
                                    userJson.getString("username"),
                                    userJson.getString("password"),

                                    userInfoJson.getString("first_name"),
                                    userInfoJson.getString("last_name"),
                                    userInfoJson.getInt("age"),
                                    userInfoJson.getString("sex"),
                                    userInfoJson.getInt("height"),
                                    userInfoJson.getInt("weight"),
                                    userInfoJson.getBoolean("diabetic"),
                                    userInfoJson.getString("health_focus"),

                                    userDataJson.getString("activities"),
                                    userDataJson.getString("glucose_levels"),
                                    userDataJson.getString("food")
                            );

                            // Store the user in shared preferences
                            SharedPrefManager.getInstance(getApplicationContext()).userLogin(user);

                            // Start the profile
                            finish();
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("token", user.getToken());
                return params;
            }
        };

            VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
}
