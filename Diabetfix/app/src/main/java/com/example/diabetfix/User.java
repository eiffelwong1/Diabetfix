package com.example.diabetfix;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

enum sex_options {MALE, FEMALE, OTHER;}
enum healthFocusOptions {ACTIVITY, DIET, BOTH;}

public class User {
    protected String username, password;
    protected JSONObject info = new JSONObject();

    private String token;
    protected JSONObject data = new JSONObject();

    public User( String token, String inputUsername, String inputPassword,
                String fName, String lName,
                int inputAge, String inputSex,
                int inputHeight, int inputWeight,
                boolean diabeticStatus, String inputFocus,
                 String userActivities, String userGlucoseLevels, String userFood) {
        this.username = inputUsername;
        this.password = inputPassword;
        this.token = token;
        try {
            // Populate info obj
            this.info.put("first_name", fName);
            this.info.put("last_name", lName);
            this.info.put("age", inputAge);
            this.info.put("sex", inputSex);
            this.info.put("height", inputHeight);
            this.info.put("weight", inputWeight);
            this.info.put("diabetic", diabeticStatus);
            this.info.put("health_focus", inputFocus);
            // Populate data obj
            this.data.put("activities", userActivities);
            this.data.put("glucose_levels", userGlucoseLevels);
            this.data.put("food", userFood);
        } catch (JSONException e) {
            System.out.println(e);
        }
    }

    // Get methods
    public String getToken() { return this.token; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public String getFName() {
        String fName ="";
        try {
            fName = this.info.getString("first_name");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return fName;
    }

    public String getLName() {
        String lName ="";
        try {
            lName = this.info.getString("last_name");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return lName;
    }

    public int getAge() {
        int age = 0;
        try {
            age = this.info.getInt("age");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return age;
    }

    public String getSex() {
        String sex = "";
        try {
            sex = this.info.getString("sex");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return sex;
    }

    public int getHeight() {
        int height = 0;
        try {
            height = this.info.getInt("height");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return height;
    }

    public int getWeight() {
        int weight = 0;
        try {
            weight = this.info.getInt("weight");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return weight;
    }

    public Boolean getDiabeticStatus() {
        Boolean diabetic = false;
        try {
            diabetic = this.info.getBoolean("diabetic");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return diabetic;
    }

    public String getHealthFocus() {
        String healthFocus = "";
        try {
            healthFocus = this.info.getString("health_focus");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return healthFocus;
    }

    public String getActivities() {
        String activities = "";
        try {
            activities = this.data.getString("activities");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return activities;
    }

    public String getGlucoseLevels() {
        String glucoseLevels = "";
        try {
            glucoseLevels = this.data.getString("glucose_levels");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return glucoseLevels;
    }

    public String getFood() {
        String food = "";
        try {
            food = this.data.getString("food");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return food;
    }

    // Set methods
    public void addActivity(String activity) {
        try {
            String currentActivities = this.data.getString("activities");
            String updatedActivities = prepDataForAdd(currentActivities);
            updatedActivities = updatedActivities.concat(activity);
            updatedActivities = updatedActivities.concat("]");
            this.data.put("activities", updatedActivities);
            System.out.println(this.data.get("activities"));
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void addGlucoseLevel(String glucoseLevel) {
        try {
            String currentGlucoseLevels = this.data.getString("glucose_levels");
            String updatedGlucoseLevels = prepDataForAdd(currentGlucoseLevels);
            updatedGlucoseLevels = updatedGlucoseLevels.concat(glucoseLevel);
            updatedGlucoseLevels = updatedGlucoseLevels.concat("]");
            this.data.put("glucose_levels", updatedGlucoseLevels);
            System.out.println(this.data.get("glucose_levels"));
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void addFood(String food) {
        try {
            String currentFood = this.data.getString("food");
            String updatedFood = prepDataForAdd(currentFood);
            updatedFood = updatedFood.concat(food);
            updatedFood = updatedFood.concat("]");
            this.data.put("food", updatedFood);
            System.out.println(this.data.get("food"));
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String prepDataForAdd(String data) {
        String formattedData = data.substring(0, data.length()-1);
        // Data is not empty, so add a comma
        if (!data.equals("[]")) {
            formattedData = formattedData.concat(",");
        }
        return formattedData;
    }
}
