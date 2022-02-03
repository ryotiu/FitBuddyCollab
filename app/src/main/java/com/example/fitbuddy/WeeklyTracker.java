package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.sax.EndTextElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class WeeklyTracker extends AppCompatActivity {

    // Monday Variables
    private TextView MondayTextView;
    private ProgressBar MondayProgressBar;
    private CheckBox MondayAerobicCheckbox;
    private CheckBox MondayCircuitCheckbox;
    private CheckBox MondayIntervalCheckbox;
    private CheckBox MondayFlexibilityCheckbox;
    private CheckBox MondayChallengesCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_tracker);

        // Find Monday Contents
        MondayTextView = findViewById(R.id.MondayTextView);
        MondayProgressBar = findViewById(R.id.MondayProgressBar);
        MondayAerobicCheckbox = findViewById(R.id.MondayAerobicCheckbox);
        MondayCircuitCheckbox = findViewById(R.id.MondayCircuitCheckbox);
        MondayIntervalCheckbox = findViewById(R.id.MondayIntervalCheckbox);
        MondayFlexibilityCheckbox = findViewById(R.id.MondayFlexibilityCheckbox);
        MondayChallengesCheckbox = findViewById(R.id.MondayChallengesCheckbox);

        // Monday Text View Clickable Actions
        MondayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Monday Tracker Checkboxes
                if (MondayAerobicCheckbox.getVisibility() == View.VISIBLE && MondayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        MondayIntervalCheckbox.getVisibility() == View.VISIBLE && MondayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        MondayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    MondayAerobicCheckbox.setVisibility(View.GONE);
                    MondayCircuitCheckbox.setVisibility(View.GONE);
                    MondayIntervalCheckbox.setVisibility(View.GONE);
                    MondayFlexibilityCheckbox.setVisibility(View.GONE);
                    MondayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Monday Tracker Checkboxes
                else  {
                    MondayAerobicCheckbox.setVisibility(View.VISIBLE);
                    MondayCircuitCheckbox.setVisibility(View.VISIBLE);
                    MondayIntervalCheckbox.setVisibility(View.VISIBLE);
                    MondayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    MondayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Monday Progress Bar Clickable Actions
        MondayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Monday Tracker Checkboxes
                if (MondayAerobicCheckbox.getVisibility() == View.VISIBLE && MondayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        MondayIntervalCheckbox.getVisibility() == View.VISIBLE && MondayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        MondayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    MondayAerobicCheckbox.setVisibility(View.GONE);
                    MondayCircuitCheckbox.setVisibility(View.GONE);
                    MondayIntervalCheckbox.setVisibility(View.GONE);
                    MondayFlexibilityCheckbox.setVisibility(View.GONE);
                    MondayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Monday Tracker Checkboxes
                else  {
                    MondayAerobicCheckbox.setVisibility(View.VISIBLE);
                    MondayCircuitCheckbox.setVisibility(View.VISIBLE);
                    MondayIntervalCheckbox.setVisibility(View.VISIBLE);
                    MondayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    MondayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
