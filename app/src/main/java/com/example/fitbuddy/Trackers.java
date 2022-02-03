package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Trackers extends AppCompatActivity {

    private Button WeeklyTrackerBtn;
    private Button MonthlyTrackerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackers);

        WeeklyTrackerBtn = findViewById(R.id.WeeklyTrackerBtn);
        MonthlyTrackerBtn = findViewById(R.id.MonthlyTrackerBtn);

        // Launch activity_weekly_tracker
        WeeklyTrackerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Trackers.this, WeeklyTracker.class));
            }
        });

        // Launch activity_monthly_tracker
        MonthlyTrackerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Trackers.this, MonthlyTracker.class));
            }
        });

    }
}
