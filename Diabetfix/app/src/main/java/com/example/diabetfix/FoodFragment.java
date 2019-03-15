package com.example.diabetfix;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.mongodb.lang.Nullable;

public class FoodFragment extends Fragment {

    private String m_text = "";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.food_fragment, container, false);

        //Input here the number for recommended carbs intake
        TextView carbText = (TextView) view.findViewById(R.id.carbsRecommendation);
        carbText.setText("10");

        
        return view;
    }

    public void onAddFood(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Add Food");

        final EditText input = (EditText) view;
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        builder.setView(view);

        // Set up the buttons
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                m_text = input.getText().toString();
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
}
