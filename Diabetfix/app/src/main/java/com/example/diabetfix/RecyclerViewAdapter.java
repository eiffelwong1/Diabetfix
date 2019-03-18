package com.example.diabetfix;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> levelOrDuration = new ArrayList<>();
    private ArrayList<Boolean> carbBools = new ArrayList<>();
    private ArrayList<Integer> loggedTimes = new ArrayList<>();


    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> names, ArrayList<Integer> levelorDuration,
                               ArrayList<Boolean> carbBools, ArrayList<Integer> loggedTimes, Context mContext) {
        this.names = names;
        this.levelOrDuration = levelorDuration;
        this.carbBools = carbBools;
        this.loggedTimes = loggedTimes;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.time.setText(Integer.toString(loggedTimes.get(i)));
        if (names.size() > 0)
        {
            viewHolder.logName.setText(names.get(i));
        }
        if (levelOrDuration.size() > 0)
        {
            viewHolder.glucoseLevel.setText(levelOrDuration.get(i));
        }
        //Food log
        if (carbBools.size() > 0)
        {
            if (carbBools.get(i))
            {
                viewHolder.highInCarbs.setText("High in carbs");
            }
            else
            {
                viewHolder.highInCarbs.setText("Not high in carbs");
            }
        }

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView logName;
        TextView time;
        TextView highInCarbs;
        TextView glucoseLevel;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView)
        {
            super(itemView);
            logName = itemView.findViewById(R.id.log_name);
            time = itemView.findViewById(R.id.time);
            highInCarbs = itemView.findViewById(R.id.carbsBool);
            glucoseLevel = itemView.findViewById(R.id.glucose_level);
            parentLayout = itemView.findViewById(R.id.parent_layout);


        }
    }
}