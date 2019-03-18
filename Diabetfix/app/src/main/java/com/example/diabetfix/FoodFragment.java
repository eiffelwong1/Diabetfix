package com.example.diabetfix;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

import com.mongodb.lang.Nullable;

public class FoodFragment extends Fragment {

    private boolean isHighInCarbs = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.food_fragment, container, false);

        //Input here the number for recommended carbs intake
        TextView carbText = (TextView) view.findViewById(R.id.carbsRecommendation);
        carbText.setText("10");

        Button btn = (Button) view.findViewById(R.id.addFoodLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddFood(v);
            }
        });

        
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
        timeLabel.setText("Time eaten:");
        timeLabel.setLayoutParams(lp);
        layout.addView(timeLabel);

        final EditText time = new EditText(getActivity());
        time.setHint("3:52");
        time.setInputType(InputType.TYPE_CLASS_DATETIME);
        time.setLayoutParams(lp);
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
                String foodTime = time.getText().toString();

                //Use name, foodTime, and isHighInCarbs to enter into database

                Toast.makeText(getActivity(), name + " successfully logged", Toast.LENGTH_LONG).show();



                dialog.cancel();
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


}
