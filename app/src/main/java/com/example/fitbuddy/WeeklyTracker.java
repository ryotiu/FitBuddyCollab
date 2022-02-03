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
    public CheckBox MondayAerobicCheckbox;
    public CheckBox MondayCircuitCheckbox;
    public CheckBox MondayIntervalCheckbox;
    public CheckBox MondayFlexibilityCheckbox;
    public CheckBox MondayChallengesCheckbox;

    // Tuesday Variables
    private TextView TuesdayTextView;
    private ProgressBar TuesdayProgressBar;
    public CheckBox TuesdayAerobicCheckbox;
    public CheckBox TuesdayCircuitCheckbox;
    public CheckBox TuesdayIntervalCheckbox;
    public CheckBox TuesdayFlexibilityCheckbox;
    public CheckBox TuesdayChallengesCheckbox;

    // Wednesday Variables
    private TextView WednesdayTextView;
    private ProgressBar WednesdayProgressBar;
    public CheckBox WednesdayAerobicCheckbox;
    public CheckBox WednesdayCircuitCheckbox;
    public CheckBox WednesdayIntervalCheckbox;
    public CheckBox WednesdayFlexibilityCheckbox;
    public CheckBox WednesdayChallengesCheckbox;

    // Thursday Variables
    private TextView ThursdayTextView;
    private ProgressBar ThursdayProgressBar;
    public CheckBox ThursdayAerobicCheckbox;
    public CheckBox ThursdayCircuitCheckbox;
    public CheckBox ThursdayIntervalCheckbox;
    public CheckBox ThursdayFlexibilityCheckbox;
    public CheckBox ThursdayChallengesCheckbox;

    // Friday Variables
    private TextView FridayTextView;
    private ProgressBar FridayProgressBar;
    public CheckBox FridayAerobicCheckbox;
    public CheckBox FridayCircuitCheckbox;
    public CheckBox FridayIntervalCheckbox;
    public CheckBox FridayFlexibilityCheckbox;
    public CheckBox FridayChallengesCheckbox;

    // Saturday Variables
    private TextView SaturdayTextView;
    private ProgressBar SaturdayProgressBar;
    public CheckBox SaturdayAerobicCheckbox;
    public CheckBox SaturdayCircuitCheckbox;
    public CheckBox SaturdayIntervalCheckbox;
    public CheckBox SaturdayFlexibilityCheckbox;
    public CheckBox SaturdayChallengesCheckbox;

    // Sunday Variables
    private TextView SundayTextView;
    private ProgressBar SundayProgressBar;
    public CheckBox SundayAerobicCheckbox;
    public CheckBox SundayCircuitCheckbox;
    public CheckBox SundayIntervalCheckbox;
    public CheckBox SundayFlexibilityCheckbox;
    public CheckBox SundayChallengesCheckbox;

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

        // Find Tuesday Contents
        TuesdayTextView = findViewById(R.id.TuesdayTextView);
        TuesdayProgressBar = findViewById(R.id.TuesdayProgressBar);
        TuesdayAerobicCheckbox = findViewById(R.id.TuesdayAerobicCheckbox);
        TuesdayCircuitCheckbox = findViewById(R.id.TuesdayCircuitCheckbox);
        TuesdayIntervalCheckbox = findViewById(R.id.TuesdayIntervalCheckbox);
        TuesdayFlexibilityCheckbox = findViewById(R.id.TuesdayFlexibilityCheckbox);
        TuesdayChallengesCheckbox = findViewById(R.id.TuesdayChallengesCheckbox);

        // Tuesday Text View Clickable Actions
        TuesdayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Monday Tracker Checkboxes
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    TuesdayAerobicCheckbox.setVisibility(View.GONE);
                    TuesdayCircuitCheckbox.setVisibility(View.GONE);
                    TuesdayIntervalCheckbox.setVisibility(View.GONE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    TuesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Monday Tracker Checkboxes
                else  {
                    TuesdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    TuesdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    TuesdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    TuesdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Tuesday Progress Bar Clickable Actions
        TuesdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Monday Tracker Checkboxes
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    TuesdayAerobicCheckbox.setVisibility(View.GONE);
                    TuesdayCircuitCheckbox.setVisibility(View.GONE);
                    TuesdayIntervalCheckbox.setVisibility(View.GONE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    TuesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Monday Tracker Checkboxes
                else  {
                    TuesdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    TuesdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    TuesdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    TuesdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
