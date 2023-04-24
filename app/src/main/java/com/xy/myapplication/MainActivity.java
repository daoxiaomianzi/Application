package com.xy.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("NonConstantResourceId")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.travel_control_tv:
                startActivity(new Intent(this, TravelControlActivity.class));
                break;
            default:
                break;
        }
    }
}