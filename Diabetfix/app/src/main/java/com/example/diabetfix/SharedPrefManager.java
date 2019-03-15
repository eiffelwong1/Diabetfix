package com.example.diabetfix;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class SharedPrefManager {
    // constants
    private static final String SHARED_PREF_NAME = "userprofile";
    private static final String KEY_USERNAME = "keyusername";
    private static final String KEY_PASSWORD = "keypass";
    private static final String KEY_TOKEN = "keytoken";
    private static final String KEY_FNAME = "keyfname";
    private static final String KEY_LNAME = "keylname";
    private static final String KEY_AGE = "keyage";
    private static final String KEY_SEX = "keysex";
    private static final String KEY_HEIGHT = "keyheight";
    private static final String KEY_WEIGHT = "keyweight";
    private static final String KEY_DIABETIC = "keydiabetic";
    private static final String KEY_HEALTHFOCUS = "keyhealthfocus";
    private static final String KEY_ACTIVITIES = "keyactivities";
    private static final String KEY_GLUCOSELEVELS = "keyglucose";
    private static final String KEY_FOOD = "keyfood";

    private static SharedPrefManager mInstance;
    private static Context mContext;

    private SharedPrefManager(Context context) {
        mContext = context;
    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }

    // Login the user
    // Store the user data in shared preferences
    public void userLogin(User user) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_TOKEN, user.getToken());
        editor.putString(KEY_USERNAME, user.getUsername());
        editor.putString(KEY_PASSWORD, user.getPassword());
        editor.putString(KEY_FNAME, user.getFName());
        editor.putString(KEY_LNAME, user.getLName());
        editor.putInt(KEY_AGE, user.getAge());
        editor.putString(KEY_SEX, user.getSex());
        editor.putInt(KEY_HEIGHT, user.getHeight());
        editor.putInt(KEY_WEIGHT, user.getWeight());
        editor.putBoolean(KEY_DIABETIC, user.getDiabeticStatus());
        editor.putString(KEY_HEALTHFOCUS, user.getHealthFocus());
        editor.putString(KEY_ACTIVITIES, user.getActivities());
        editor.putString(KEY_GLUCOSELEVELS, user.getGlucoseLevels());
        editor.putString(KEY_FOOD, user.getFood());
        editor.apply();
    }

    // Check whether the user is already logged in
    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_USERNAME, null) != null;
    }

    public User getUser() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new User(
                sharedPreferences.getString(KEY_TOKEN, null),
                sharedPreferences.getString(KEY_USERNAME, null),
                sharedPreferences.getString(KEY_PASSWORD, null),
                sharedPreferences.getString(KEY_FNAME, null),
                sharedPreferences.getString(KEY_LNAME, null),
                sharedPreferences.getInt(KEY_AGE, 0),
                sharedPreferences.getString(KEY_SEX, null),
                sharedPreferences.getInt(KEY_HEIGHT, 0),
                sharedPreferences.getInt(KEY_WEIGHT, 0),
                sharedPreferences.getBoolean(KEY_DIABETIC, false),
                sharedPreferences.getString(KEY_HEALTHFOCUS, null),
                sharedPreferences.getString(KEY_ACTIVITIES, null),
                sharedPreferences.getString(KEY_GLUCOSELEVELS, null),
                sharedPreferences.getString(KEY_FOOD, null)
        );
    }

    public void logout() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        mContext.startActivity(new Intent(mContext, LoginActivity.class));
    }
}
