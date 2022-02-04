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
                // Hide Tuesday Tracker Checkboxes
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    TuesdayAerobicCheckbox.setVisibility(View.GONE);
                    TuesdayCircuitCheckbox.setVisibility(View.GONE);
                    TuesdayIntervalCheckbox.setVisibility(View.GONE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    TuesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Tuesday Tracker Checkboxes
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
                // Hide Tuesday Tracker Checkboxes
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    TuesdayAerobicCheckbox.setVisibility(View.GONE);
                    TuesdayCircuitCheckbox.setVisibility(View.GONE);
                    TuesdayIntervalCheckbox.setVisibility(View.GONE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    TuesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Tuesday Tracker Checkboxes
                else  {
                    TuesdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    TuesdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    TuesdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    TuesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    TuesdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Find Wednesday Contents
        WednesdayTextView = findViewById(R.id.WednesdayTextView);
        WednesdayProgressBar = findViewById(R.id.WednesdayProgressBar);
        WednesdayAerobicCheckbox = findViewById(R.id.WednesdayAerobicCheckbox);
        WednesdayCircuitCheckbox = findViewById(R.id.WednesdayCircuitCheckbox);
        WednesdayIntervalCheckbox = findViewById(R.id.WednesdayIntervalCheckbox);
        WednesdayFlexibilityCheckbox = findViewById(R.id.WednesdayFlexibilityCheckbox);
        WednesdayChallengesCheckbox = findViewById(R.id.WednesdayChallengesCheckbox);

        // Wednesday Text View Clickable Actions
        WednesdayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Wednesday Tracker Checkboxes
                if (WednesdayAerobicCheckbox.getVisibility() == View.VISIBLE && WednesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayIntervalCheckbox.getVisibility() == View.VISIBLE && WednesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    WednesdayAerobicCheckbox.setVisibility(View.GONE);
                    WednesdayCircuitCheckbox.setVisibility(View.GONE);
                    WednesdayIntervalCheckbox.setVisibility(View.GONE);
                    WednesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    WednesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Wednesday Tracker Checkboxes
                else  {
                    WednesdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    WednesdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    WednesdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    WednesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    WednesdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Wednesday Progress Bar Clickable Actions
        WednesdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Wednesday Tracker Checkboxes
                if (WednesdayAerobicCheckbox.getVisibility() == View.VISIBLE && WednesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayIntervalCheckbox.getVisibility() == View.VISIBLE && WednesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    WednesdayAerobicCheckbox.setVisibility(View.GONE);
                    WednesdayCircuitCheckbox.setVisibility(View.GONE);
                    WednesdayIntervalCheckbox.setVisibility(View.GONE);
                    WednesdayFlexibilityCheckbox.setVisibility(View.GONE);
                    WednesdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Wednesday Tracker Checkboxes
                else  {
                    WednesdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    WednesdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    WednesdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    WednesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    WednesdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Find Thursday Contents
        ThursdayTextView = findViewById(R.id.ThursdayTextView);
        ThursdayProgressBar = findViewById(R.id.ThursdayProgressBar);
        ThursdayAerobicCheckbox = findViewById(R.id.ThursdayAerobicCheckbox);
        ThursdayCircuitCheckbox = findViewById(R.id.ThursdayCircuitCheckbox);
        ThursdayIntervalCheckbox = findViewById(R.id.ThursdayIntervalCheckbox);
        ThursdayFlexibilityCheckbox = findViewById(R.id.ThursdayFlexibilityCheckbox);
        ThursdayChallengesCheckbox = findViewById(R.id.ThursdayChallengesCheckbox);

        // Thursday Text View Clickable Actions
        ThursdayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Thursday Tracker Checkboxes
                if (ThursdayAerobicCheckbox.getVisibility() == View.VISIBLE && ThursdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayIntervalCheckbox.getVisibility() == View.VISIBLE && ThursdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    ThursdayAerobicCheckbox.setVisibility(View.GONE);
                    ThursdayCircuitCheckbox.setVisibility(View.GONE);
                    ThursdayIntervalCheckbox.setVisibility(View.GONE);
                    ThursdayFlexibilityCheckbox.setVisibility(View.GONE);
                    ThursdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Thursday Tracker Checkboxes
                else  {
                    ThursdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    ThursdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    ThursdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    ThursdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    ThursdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Thursday Progress Bar Clickable Actions
        ThursdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Thursday Tracker Checkboxes
                if (ThursdayAerobicCheckbox.getVisibility() == View.VISIBLE && ThursdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayIntervalCheckbox.getVisibility() == View.VISIBLE && ThursdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    ThursdayAerobicCheckbox.setVisibility(View.GONE);
                    ThursdayCircuitCheckbox.setVisibility(View.GONE);
                    ThursdayIntervalCheckbox.setVisibility(View.GONE);
                    ThursdayFlexibilityCheckbox.setVisibility(View.GONE);
                    ThursdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Thursday Tracker Checkboxes
                else  {
                    ThursdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    ThursdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    ThursdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    ThursdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    ThursdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Find Friday Contents
        FridayTextView = findViewById(R.id.FridayTextView);
        FridayProgressBar = findViewById(R.id.FridayProgressBar);
        FridayAerobicCheckbox = findViewById(R.id.FridayAerobicCheckbox);
        FridayCircuitCheckbox = findViewById(R.id.FridayCircuitCheckbox);
        FridayIntervalCheckbox = findViewById(R.id.FridayIntervalCheckbox);
        FridayFlexibilityCheckbox = findViewById(R.id.FridayFlexibilityCheckbox);
        FridayChallengesCheckbox = findViewById(R.id.FridayChallengesCheckbox);

        // Friday Text View Clickable Actions
        FridayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Friday Tracker Checkboxes
                if (FridayAerobicCheckbox.getVisibility() == View.VISIBLE && FridayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        FridayIntervalCheckbox.getVisibility() == View.VISIBLE && FridayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        FridayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    FridayAerobicCheckbox.setVisibility(View.GONE);
                    FridayCircuitCheckbox.setVisibility(View.GONE);
                    FridayIntervalCheckbox.setVisibility(View.GONE);
                    FridayFlexibilityCheckbox.setVisibility(View.GONE);
                    FridayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Friday Tracker Checkboxes
                else  {
                    FridayAerobicCheckbox.setVisibility(View.VISIBLE);
                    FridayCircuitCheckbox.setVisibility(View.VISIBLE);
                    FridayIntervalCheckbox.setVisibility(View.VISIBLE);
                    FridayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    FridayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Friday Progress Bar Clickable Actions
        FridayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Friday Tracker Checkboxes
                if (FridayAerobicCheckbox.getVisibility() == View.VISIBLE && FridayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        FridayIntervalCheckbox.getVisibility() == View.VISIBLE && FridayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        FridayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    FridayAerobicCheckbox.setVisibility(View.GONE);
                    FridayCircuitCheckbox.setVisibility(View.GONE);
                    FridayIntervalCheckbox.setVisibility(View.GONE);
                    FridayFlexibilityCheckbox.setVisibility(View.GONE);
                    FridayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Friday Tracker Checkboxes
                else  {
                    FridayAerobicCheckbox.setVisibility(View.VISIBLE);
                    FridayCircuitCheckbox.setVisibility(View.VISIBLE);
                    FridayIntervalCheckbox.setVisibility(View.VISIBLE);
                    FridayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    FridayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Find Saturday Contents
        SaturdayTextView = findViewById(R.id.SaturdayTextView);
        SaturdayProgressBar = findViewById(R.id.SaturdayProgressBar);
        SaturdayAerobicCheckbox = findViewById(R.id.SaturdayAerobicCheckbox);
        SaturdayCircuitCheckbox = findViewById(R.id.SaturdayCircuitCheckbox);
        SaturdayIntervalCheckbox = findViewById(R.id.SaturdayIntervalCheckbox);
        SaturdayFlexibilityCheckbox = findViewById(R.id.SaturdayFlexibilityCheckbox);
        SaturdayChallengesCheckbox = findViewById(R.id.SaturdayChallengesCheckbox);

        // Saturday Text View Clickable Actions
        SaturdayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Saturday Tracker Checkboxes
                if (SaturdayAerobicCheckbox.getVisibility() == View.VISIBLE && SaturdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayIntervalCheckbox.getVisibility() == View.VISIBLE && SaturdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SaturdayAerobicCheckbox.setVisibility(View.GONE);
                    SaturdayCircuitCheckbox.setVisibility(View.GONE);
                    SaturdayIntervalCheckbox.setVisibility(View.GONE);
                    SaturdayFlexibilityCheckbox.setVisibility(View.GONE);
                    SaturdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Saturday Tracker Checkboxes
                else  {
                    SaturdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    SaturdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    SaturdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    SaturdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    SaturdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Saturday Progress Bar Clickable Actions
        SaturdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Saturday Tracker Checkboxes
                if (SaturdayAerobicCheckbox.getVisibility() == View.VISIBLE && SaturdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayIntervalCheckbox.getVisibility() == View.VISIBLE && SaturdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SaturdayAerobicCheckbox.setVisibility(View.GONE);
                    SaturdayCircuitCheckbox.setVisibility(View.GONE);
                    SaturdayIntervalCheckbox.setVisibility(View.GONE);
                    SaturdayFlexibilityCheckbox.setVisibility(View.GONE);
                    SaturdayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Saturday Tracker Checkboxes
                else  {
                    SaturdayAerobicCheckbox.setVisibility(View.VISIBLE);
                    SaturdayCircuitCheckbox.setVisibility(View.VISIBLE);
                    SaturdayIntervalCheckbox.setVisibility(View.VISIBLE);
                    SaturdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    SaturdayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Find Sunday Contents
        SundayTextView = findViewById(R.id.SundayTextView);
        SundayProgressBar = findViewById(R.id.SundayProgressBar);
        SundayAerobicCheckbox = findViewById(R.id.SundayAerobicCheckbox);
        SundayCircuitCheckbox = findViewById(R.id.SundayCircuitCheckbox);
        SundayIntervalCheckbox = findViewById(R.id.SundayIntervalCheckbox);
        SundayFlexibilityCheckbox = findViewById(R.id.SundayFlexibilityCheckbox);
        SundayChallengesCheckbox = findViewById(R.id.SundayChallengesCheckbox);

        // Sunday Text View Clickable Actions
        SundayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Sunday Tracker Checkboxes
                if (SundayAerobicCheckbox.getVisibility() == View.VISIBLE && SundayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SundayIntervalCheckbox.getVisibility() == View.VISIBLE && SundayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SundayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SundayAerobicCheckbox.setVisibility(View.GONE);
                    SundayCircuitCheckbox.setVisibility(View.GONE);
                    SundayIntervalCheckbox.setVisibility(View.GONE);
                    SundayFlexibilityCheckbox.setVisibility(View.GONE);
                    SundayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Sunday Tracker Checkboxes
                else  {
                    SundayAerobicCheckbox.setVisibility(View.VISIBLE);
                    SundayCircuitCheckbox.setVisibility(View.VISIBLE);
                    SundayIntervalCheckbox.setVisibility(View.VISIBLE);
                    SundayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    SundayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });

        // Sunday Progress Bar Clickable Actions
        SundayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Sunday Tracker Checkboxes
                if (SundayAerobicCheckbox.getVisibility() == View.VISIBLE && SundayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SundayIntervalCheckbox.getVisibility() == View.VISIBLE && SundayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SundayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SundayAerobicCheckbox.setVisibility(View.GONE);
                    SundayCircuitCheckbox.setVisibility(View.GONE);
                    SundayIntervalCheckbox.setVisibility(View.GONE);
                    SundayFlexibilityCheckbox.setVisibility(View.GONE);
                    SundayChallengesCheckbox.setVisibility(View.GONE);
                }
                // Reveal Sunday Tracker Checkboxes
                else  {
                    SundayAerobicCheckbox.setVisibility(View.VISIBLE);
                    SundayCircuitCheckbox.setVisibility(View.VISIBLE);
                    SundayIntervalCheckbox.setVisibility(View.VISIBLE);
                    SundayFlexibilityCheckbox.setVisibility(View.VISIBLE);
                    SundayChallengesCheckbox.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
