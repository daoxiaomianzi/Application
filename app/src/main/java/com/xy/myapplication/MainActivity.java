package com.xy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RotatView rotatView=(RotatView)findViewById(R.id.myRotatView);
        rotatView.setRotatDrawableResource(R.mipmap.test6);

        DashboardView dashboardView3 = (DashboardView) findViewById(R.id.dashboard_view_3);
        DashboardView dashboardView4 = (DashboardView) findViewById(R.id.dashboard_view_4);
//        List<HighlightCR> highlight2 = new ArrayList<>();
//        highlight2.add(new HighlightCR(170, 140, Color.parseColor("#607D8B")));
//        highlight2.add(new HighlightCR(310, 60, Color.parseColor("#795548")));
//        dashboardView3.setStripeHighlightColorAndRange(highlight2);

        dashboardView4.setRadius(60);
        dashboardView4.setArcColor(getResources().getColor(android.R.color.white));
        dashboardView4.setTextColor(Color.parseColor("#ffffffff"));
        dashboardView4.setBgColor(getResources().getColor(android.R.color.black));
        dashboardView4.setStartAngle(150);
        dashboardView4.setPointerRadius(40);
        dashboardView4.setCircleRadius(4);
        dashboardView4.setSweepAngle(240);
        dashboardView4.setBigSliceCount(12);
        dashboardView4.setMaxValue(240);
        dashboardView4.setRealTimeValue(80);
        dashboardView4.setMeasureTextSize(6);
        dashboardView4.setHeaderRadius(30);
        dashboardView4.setHeaderTitle("km/h");
        dashboardView4.setHeaderTextSize(6);
        dashboardView4.setStripeWidth(20);
        dashboardView4.setStripeMode(DashboardView.StripeMode.OUTER);
        List<HighlightCR> highlight3 = new ArrayList<>();
//        highlight3.add(new HighlightCR(150, 100, Color.parseColor("#4CAF50")));
//        highlight3.add(new HighlightCR(250, 80, Color.parseColor("#FFEB3B")));
//        highlight3.add(new HighlightCR(330, 60, Color.parseColor("#F44336")));
        dashboardView4.setStripeHighlightColorAndRange(highlight3);

    }
}