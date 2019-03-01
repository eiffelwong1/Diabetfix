package com.example.diabetfix;

import org.json.JSONObject;

enum sex_options {MALE, FEMALE, OTHER;}
enum healthFocusOptions {ACTIVITY, DIET, BOTH;}

public class userClass {
    protected String first_name, last_name;
    protected int age;
    protected sex_options sex;
    protected int height, weight;
    protected boolean isDiabetic;
    protected healthFocusOptions healthFocus;
    private String id;
    private JSONObject data;

    public userClass(String fName, String lName,
                     int inputAge, sex_options inputSex,
                     int inputHeight, int inputWeight,
                     boolean diabeticStatus, healthFocusOptions inputFocus) {
        this.first_name = fName;
        this.last_name = lName;
        this.age = inputAge;
        this.sex = inputSex;
        this.height = inputHeight;
        this.weight = inputWeight;
        this.isDiabetic = diabeticStatus;
        this.healthFocus = inputFocus;
        this.data = new JSONObject();
    }

    protected void setId(String inputId) {
        this.id = inputId;
    }
}
