package com.example.diabetfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class profileInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_input);

    }

    public void saveButton(View view)
    {
        Intent intent = new Intent(this, com.example.diabetfix.MainActivity.class);
        startActivity(intent);
    }
}
