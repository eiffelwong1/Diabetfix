package com.example.diabetfix;

import org.json.JSONException;
import org.json.JSONObject;

enum sex_options {MALE, FEMALE, OTHER;}
enum healthFocusOptions {ACTIVITY, DIET, BOTH;}

public class User {
    protected String username, password;
    protected JSONObject info = new JSONObject();

    private String id;
    private JSONObject data;

    public User( String inputId, String inputUsername, String inputPassword,
                String fName, String lName,
                int inputAge, String inputSex,
                int inputHeight, int inputWeight,
                boolean diabeticStatus, String inputFocus) {
        this.username = inputUsername;
        this.password = inputPassword;
        this.id = inputId;
        try {
            this.info.put("first_name", fName);
            this.info.put("last_name", lName);
            this.info.put("age", inputAge);
            this.info.put("sex", inputSex);
            this.info.put("height", inputHeight);
            this.info.put("weight", inputWeight);
            this.info.put("diabetic", diabeticStatus);
            this.info.put("health_focus", inputFocus);
        }
        catch (JSONException e) {
            System.out.println(e);
        }
        this.data = new JSONObject();
//        this.username = inputUsername;
//        this.password = inputPassword;
//        this.first_name = fName;
//        this.last_name = lName;
//        this.age = inputAge;
//        this.sex = inputSex;
//        this.height = inputHeight;
//        this.weight = inputWeight;
//        this.isDiabetic = diabeticStatus;
//        this.healthFocus = inputFocus;
    }

//    protected void setId(String inputId) {
//        this.id = inputId;
//    }
    // Get methods
    public String getId() { return this.id; }
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

}
