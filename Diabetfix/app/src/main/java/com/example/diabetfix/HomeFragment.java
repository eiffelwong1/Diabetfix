package com.example.diabetfix;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.mongodb.lang.Nullable;

public class HomeFragment extends Fragment {
    private User user;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        user = SharedPrefManager.getInstance(getContext()).getUser();
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        int healthScore = Score.getOverallScore(0,user.getHeight(), user.getWeight(),user.getAge(), 10, 300);


        TextView homeScore = view.findViewById(R.id.homeScore);
        homeScore.setText(Integer.toString(healthScore));

        return view;
    }
}
