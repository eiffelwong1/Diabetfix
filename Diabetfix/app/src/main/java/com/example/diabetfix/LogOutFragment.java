package com.example.diabetfix;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.lang.Nullable;

import java.util.ArrayList;

public class LogOutFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.log_out_fragment, container, false);

        view.findViewById(R.id.logOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                SharedPrefManager.getInstance(getActivity().getApplicationContext()).logout();
            }
        });

        view.findViewById(R.id.credits).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Home icon made by https://www.flaticon.com/authors/smashicons from www.flaticon.com\n" +
                        "        Food icon made by https://www.flaticon.com/authors/payungkead from www.flaticon.com\n" +
                        "        Exercise icon made by https://www.flaticon.com/authors/srip from www.flaticon.com\n" +
                        "        Cog icon made by https://www.flaticon.com/authors/egor-rumyantsev from www.flaticon.com\n" +
                        "        Blood icon made by https://www.flaticon.com/authors/pixel-perfect from https://www.flaticon.com", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}