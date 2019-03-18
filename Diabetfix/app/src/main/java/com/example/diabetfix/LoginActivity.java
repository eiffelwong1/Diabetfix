package com.example.diabetfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
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

public class LoginActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // If the user is already logged in, go to their profile
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, ProfileActivity.class));
            return;
        }

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        findViewById(R.id.buttonLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the user presses login button
                userLogin();
            }
        });
        findViewById(R.id.textViewRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the user presses not registered button
                // Open the register screen
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    private void userLogin() {
        final String username = editTextUsername.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

        // Validate the fields
        if (TextUtils.isEmpty(username)) {
            editTextUsername.setError("Please enter username");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            editTextUsername.setError("Enter a password");
            editTextUsername.requestFocus();
            return;
        }

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressBar.setVisibility(View.GONE);

                        try {
                            // Get the response
                            JSONObject responseJson = new JSONObject(response);
                            Log.d("loginresponse", responseJson.toString());
                            // Get the user from the response
                            JSONObject userJson = responseJson.getJSONObject("user");
                            // Get the info object
                            JSONObject userInfoJson = new JSONObject(userJson.getString("info"));
                            // Get the data object
                            JSONObject userDataJson = new JSONObject(userJson.getString("data"));
                            User user = new User(
                                    responseJson.getString("token"),
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
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
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
                params.put("username", username);
                params.put("password", password);
                return params;
            }
        };

        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }

}