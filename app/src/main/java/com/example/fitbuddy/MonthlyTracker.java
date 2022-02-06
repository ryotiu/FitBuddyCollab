package com.example.fitbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MonthlyTracker extends AppCompatActivity {

    // January Variables
    private TextView JanuaryTextView, JanuaryAerobicTextView, JanuaryCircuitTextView, JanuaryIntervalTextView, JanuaryFlexibilityTextView, JanuaryChallengesTextView;
    public ProgressBar JanuaryProgressBar, JanuaryAerobicProgressBar, JanuaryCircuitProgressBar, JanuaryIntervalProgressBar, JanuaryFlexibilityProgressBar, JanuaryChallengesProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_tracker);

        // Find January Contents
        JanuaryTextView = findViewById(R.id.JanuaryTextView);
        JanuaryAerobicTextView = findViewById(R.id.JanuaryAerobicTextView);
        JanuaryCircuitTextView = findViewById(R.id.JanuaryCircuitTextView);
        JanuaryIntervalTextView = findViewById(R.id.JanuaryIntervalTextView);
        JanuaryFlexibilityTextView = findViewById(R.id.JanuaryFlexibilityTextView);
        JanuaryChallengesTextView = findViewById(R.id.JanuaryChallengesTextView);
        JanuaryProgressBar = findViewById(R.id.JanuaryProgressBar);
        JanuaryAerobicProgressBar = findViewById(R.id.JanuaryAerobicProgressBar);
        JanuaryCircuitProgressBar = findViewById(R.id.JanuaryCircuitProgressBar);
        JanuaryIntervalProgressBar = findViewById(R.id.JanuaryIntervalProgressBar);
        JanuaryFlexibilityProgressBar = findViewById(R.id.JanuaryFlexibilityProgressBar);
        JanuaryChallengesProgressBar = findViewById(R.id.JanuaryChallengesProgressBar);

        // January Text View Clickable Actions
        JanuaryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set January Contents' Visibility to Gone
                if (JanuaryAerobicProgressBar.getVisibility() == View.VISIBLE && JanuaryCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JanuaryIntervalProgressBar.getVisibility() == View.VISIBLE && JanuaryFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JanuaryChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set January Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // January Progress Bar Clickable Actions
        JanuaryProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set January Contents' Visibility to Gone
                if (JanuaryAerobicProgressBar.getVisibility() == View.VISIBLE && JanuaryCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JanuaryIntervalProgressBar.getVisibility() == View.VISIBLE && JanuaryFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JanuaryChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set January Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

    }

    // Set Monthly Contents' Visibility to Gone
    private void SetContentsToGone(){

        // Set January Content's Visibility to Gone
        if (JanuaryTextView.isPressed() || JanuaryProgressBar.isPressed()) {
            JanuaryAerobicProgressBar.setVisibility(View.GONE);
            JanuaryCircuitProgressBar.setVisibility(View.GONE);
            JanuaryIntervalProgressBar.setVisibility(View.GONE);
            JanuaryFlexibilityProgressBar.setVisibility(View.GONE);
            JanuaryChallengesProgressBar.setVisibility(View.GONE);
            JanuaryAerobicTextView.setVisibility(View.GONE);
            JanuaryCircuitTextView.setVisibility(View.GONE);
            JanuaryIntervalTextView.setVisibility(View.GONE);
            JanuaryFlexibilityTextView.setVisibility(View.GONE);
            JanuaryChallengesTextView.setVisibility(View.GONE);
        }
    }

    // Set Monthly Contents' Visibility to Visible
    private void SetContentsToVisible(){

        // Set January Content's Visibility to Visible
        if (JanuaryTextView.isPressed() || JanuaryProgressBar.isPressed()) {
            JanuaryAerobicProgressBar.setVisibility(View.VISIBLE);
            JanuaryCircuitProgressBar.setVisibility(View.VISIBLE);
            JanuaryIntervalProgressBar.setVisibility(View.VISIBLE);
            JanuaryFlexibilityProgressBar.setVisibility(View.VISIBLE);
            JanuaryChallengesProgressBar.setVisibility(View.VISIBLE);
            JanuaryAerobicTextView.setVisibility(View.VISIBLE);
            JanuaryCircuitTextView.setVisibility(View.VISIBLE);
            JanuaryIntervalTextView.setVisibility(View.VISIBLE);
            JanuaryFlexibilityTextView.setVisibility(View.VISIBLE);
            JanuaryChallengesTextView.setVisibility(View.VISIBLE);
        }
    }
}
