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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.lang.Nullable;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    private boolean isHighInCarbs = true;

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Boolean> carbBools = new ArrayList<>();
    private ArrayList<Integer> loggedTimes = new ArrayList<>();

    //Don't need to populate this one
    private ArrayList<Integer> levelOrDuration = new ArrayList<>();

    //Get current user
    private User user;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.food_fragment, container, false);
        user = SharedPrefManager.getInstance(getContext()).getUser();

        //Input here the number for recommended carbs intake
        TextView carbText = view.findViewById(R.id.carbsRecommendation);
        carbText.setText("10");

        Button btn = view.findViewById(R.id.addFoodLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddFood(v);
            }
        });

        parseFood(user.getFood());

//        names.add("Chicken");
//        names.add("Broccoli");
//        names.add("Rice");
//
//        carbBools.add(false);
//        carbBools.add(false);
//        carbBools.add(true);
//
//        loggedTimes.add(11);
//        loggedTimes.add(11);
//        loggedTimes.add(11);

        initRecyclerView(view);

        
        return view;
    }

    private void onAddFood(final View view)
    {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setCancelable(false);

        //Creates layout to add EditText to
        final LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        final TextView foodLabel = new TextView(getActivity());
        foodLabel.setText("Name:");
        foodLabel.setLayoutParams(lp);
        layout.addView(foodLabel);

        final EditText foodName = new EditText(getActivity());
        foodName.setHint("Broccoli");
        foodName.setLayoutParams(lp);
        layout.addView(foodName);

        final TextView timeLabel = new TextView(getActivity());
        timeLabel.setText("Hour eaten in military (0-23):");
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

        final TextView carbsLabel = new TextView(getActivity());
        carbsLabel.setText("Food high in carbs: ");
        carbsLabel.setLayoutParams(lp);
        layout.addView(carbsLabel);

        final RadioGroup rg = new RadioGroup(getActivity());
        rg.setOrientation(RadioGroup.HORIZONTAL);

        final RadioButton rb1 = new RadioButton(getActivity());
        rb1.setText("True");
        rb1.setId(view.getId());
        final RadioButton rb2 = new RadioButton(getActivity());
        rb2.setText("False");
        rb1.setId(view.getId());

        isHighInCarbs = true;

        rg.addView(rb1);
        rg.addView(rb2);
        rg.check(rb1.getId());
        layout.addView(rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                for (int i = 0; i < group.getChildCount(); i++)
                {
                    RadioButton btn = (RadioButton) group.getChildAt(i);
                    if (btn.getId() == checkedId)
                    {
                        isHighInCarbs = Boolean.parseBoolean(btn.getText().toString());
                    }
                }
            }
        });

        alertBuilder.setView(layout);

        alertBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = (foodName.getText().toString());
                int foodTime = Integer.parseInt(time.getText().toString());


                if (foodTime < 0 || foodTime > 23)
                {
                    Toast.makeText(getActivity(), foodTime + " is not valid. Please enter a number 0-23",
                            Toast.LENGTH_LONG).show();
                }
                else if (name.isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter a name",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    //Use name, foodTime, and isHighInCarbs to enter into database
                    names.add(name);
                    loggedTimes.add(foodTime);
                    carbBools.add(isHighInCarbs);



                    Toast.makeText(getActivity(), name + " successfully logged", Toast.LENGTH_LONG).show();
                    dialog.cancel();

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
        alert.setTitle("Log food");
        alert.show();
    }

    private void initRecyclerView(View v)
    {
        RecyclerView recyclerView = v.findViewById(R.id.foodRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names, levelOrDuration, carbBools, loggedTimes, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void parseFood(String jsonStr)
    {

        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            String foodName = obj.get("name").getAsString();
            boolean hc = obj.get("high_carbs").getAsBoolean();
            int time = obj.get("time").getAsInt();

            names.add(foodName);
            carbBools.add(hc);
            loggedTimes.add(time);

        }
    }


}
