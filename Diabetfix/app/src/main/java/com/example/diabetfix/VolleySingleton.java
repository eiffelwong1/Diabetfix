package com.example.diabetfix;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;


public class VolleySingleton {
    private static VolleySingleton mInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;

    private VolleySingleton(Context context) {
        mContext = context;
        mRequestQueue = Volley.newRequestQueue(context);;
    }

    public static synchronized VolleySingleton getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new VolleySingleton(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext is important! It keepts from leaking the
            // Activity if someone passes one in
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request req) {
        getRequestQueue().add(req);
    }

//    protected JsonArrayRequest getUsers(String url) {
//        Log.d("URL", url);
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
//                Request.Method.GET, url, null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        Log.d("Object", response.toString());
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        // Handle error;
//                        System.out.println("Error: " + error);
//                    }
//                }
//        );
//        return jsonArrayRequest;
//    }
//
//    protected StringRequest signUpUserApi(String url, final userClass new_user) {
//
//        StringRequest signUpPostRequest = new StringRequest(
//                Request.Method.POST, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // response
//                        JsonObject obj = (new JsonParser()).parse(response).getAsJsonObject();
//                        Log.d("converted", obj.toString());
//                        editor.putString("id", obj.get("_id").toString());
//                        editor.commit();
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        // error
//                        System.out.println("Error: " + error);
//                    }
//                }) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<>();
//                params.put("username", new_user.username);
//                params.put("password", new_user.password);
//                params.put("info", String.valueOf(new_user.info));
////                params.put("last_name", new_user.last_name);
////                params.put("age", String.valueOf(new_user.age));
////                params.put("sex", new_user.sex.toString());
////                params.put("height", String.valueOf(new_user.height));
////                params.put("weight", String.valueOf(new_user.weight));
////                params.put("diabetic", String.valueOf(new_user.isDiabetic));
////                params.put("health_focus", new_user.healthFocus.toString());
//                return params;
//            }
//        };
//        return signUpPostRequest;
//    }
}
