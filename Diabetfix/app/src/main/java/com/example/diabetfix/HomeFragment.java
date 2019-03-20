package com.example.diabetfix;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.lang.Nullable;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private User user;
    private ArrayList<Integer> glucoseLevels = new ArrayList<>();
    private ArrayList<Integer> durations = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        user = SharedPrefManager.getInstance(getContext()).getUser();
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        parseGlucose(user.getGlucoseLevels());
        int averageGlucose;
        if (glucoseLevels.size() == 0)
        {
            averageGlucose = 120;
        }
        else
        {
            averageGlucose = calculateAverage(glucoseLevels);
        }

        parseActivity(user.getActivities());
        int recentActivityTime = 0;
        if (durations.size() > 0)
        {
            recentActivityTime = durations.get(durations.size() - 1);
        }

        int healthScore = Score.getOverallScore(0,user.getHeight(), user.getWeight(),user.getAge(), recentActivityTime * 7, averageGlucose);


        TextView homeScore = view.findViewById(R.id.homeScore);
        homeScore.setText(Integer.toString(healthScore));

        //Change colors
        if (healthScore >= 7)
        {
            homeScore.setTextColor(Color.GREEN);
        }
        else if (healthScore >= 4)
        {
            homeScore.setTextColor(Color.BLACK);
        }
        else
        {
            homeScore.setTextColor(Color.RED);
        }

        return view;
    }

    private void parseGlucose(String jsonStr)
        {
            JsonParser jsonParser = new JsonParser();
            JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
            for (int i = 0; i < arrayFromString.size(); ++i)
            {
                JsonObject obj = arrayFromString.get(i).getAsJsonObject();
                int glucose = obj.get("level").getAsInt();

                glucoseLevels.add(glucose);
            }
        }

        private void parseActivity(String jsonStr)
        {
            JsonParser jsonParser = new JsonParser();
            JsonArray arrayFromString = jsonParser.parse(jsonStr).getAsJsonArray();
            for (int i = 0; i < arrayFromString.size(); ++i) {
                JsonObject obj = arrayFromString.get(i).getAsJsonObject();
                int duration = obj.get("duration").getAsInt();

                durations.add(duration);
            }
        }

        private int calculateAverage(ArrayList<Integer> glucoseLevels)
        {
            if (glucoseLevels.size() == 0)
            {
                return 0;
            }

            int sum = 0;
            for (int glucoseLevel: glucoseLevels)
            {
                sum += glucoseLevel;
            }
        return sum/glucoseLevels.size();
    }
}
