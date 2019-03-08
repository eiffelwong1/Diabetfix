package com.example.diabetfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class MainActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    EditText editTextFName, editTextLName;
    EditText editTextAge;
    RadioGroup radioGroupSex;
    EditText editTextHeight, editTextWeight;
    RadioGroup radioGroupDiabetic;
    RadioGroup radioGroupHealthFocus;

    ProgressBar progressBar;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        // If the user is already logged in, go to their profile
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, ProfileActivity.class));
            return;
        }

        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextFName = (EditText) findViewById(R.id.editTextFName);
        editTextLName = (EditText) findViewById(R.id.editTextLName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        radioGroupSex = (RadioGroup) findViewById(R.id.radioSex);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        radioGroupDiabetic = (RadioGroup) findViewById(R.id.radioDiabetic);
        radioGroupHealthFocus = (RadioGroup) findViewById(R.id.radioHealthFocus);

        findViewById(R.id.buttonRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the user presses register button
                // Register the user to the server
                registerUser();
            }
        });
        findViewById(R.id.textViewLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the user presses the login button
                // Bring them to the login screen
                finish();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

    private void registerUser() {
        final String username = editTextUsername.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();
        final String first_name = editTextFName.getText().toString().trim();
        final String last_name = editTextLName.getText().toString().trim();
        final String age = editTextAge.getText().toString().trim();
        final String sex = ((RadioButton) findViewById(radioGroupSex.getCheckedRadioButtonId())).getText().toString();
        final String height = editTextHeight.getText().toString().trim();
        final String weight = editTextWeight.getText().toString().trim();
        final Boolean diabetic = ((RadioButton) findViewById(radioGroupDiabetic.getCheckedRadioButtonId())).isChecked();
        final String health_focus = ((RadioButton) findViewById(radioGroupHealthFocus.getCheckedRadioButtonId())).getText().toString();

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

        if (TextUtils.isEmpty(first_name)) {
            editTextUsername.setError("Enter your first name");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(last_name)) {
            editTextUsername.setError("Enter your last name");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(age)) {
            editTextUsername.setError("Enter your age");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(sex)) {
            editTextUsername.setError("Enter your sex");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(height)) {
            editTextUsername.setError("Enter your height");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(weight)) {
            editTextUsername.setError("Enter your weight");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(health_focus)) {
            editTextUsername.setError("Enter what you wish to focus on");
            editTextUsername.requestFocus();
            return;
        }

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressBar.setVisibility(View.GONE);

                        try {
                            // Convert the response to a JSON object
                            JSONObject obj = new JSONObject(response);

                            // Get the user from the response
                            JSONObject userJson = new JSONObject(response);
                            JSONObject userInfoJson = new JSONObject(userJson.getString("info"));
                            // Create the user to store locally
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
                                    userInfoJson.getString("health_focus")
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
                params.put("username", username);
                params.put("password", password);
                JSONObject info = new JSONObject();
                try {
                    info.put("first_name", first_name);
                    info.put("last_name", last_name);
                    info.put("age", age);
                    info.put("sex", sex);
                    info.put("height", height);
                    info.put("weight", weight);
                    info.put("diabetic", diabetic);
                    info.put("health_focus", health_focus);
                }
                catch (JSONException e) {
                    e.printStackTrace();

                }
                params.put("info", info.toString());
                return params;
            }
        };

        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Starts app at profile input activity
//        Intent intent = new Intent(this, com.example.diabetfix.profileInputActivity.class);
//        startActivity(intent);

}
