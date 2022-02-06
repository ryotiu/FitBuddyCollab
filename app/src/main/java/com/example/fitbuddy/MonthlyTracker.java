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

    // February Variables
    private TextView FebruaryTextView, FebruaryAerobicTextView, FebruaryCircuitTextView, FebruaryIntervalTextView, FebruaryFlexibilityTextView, FebruaryChallengesTextView;
    public ProgressBar FebruaryProgressBar, FebruaryAerobicProgressBar, FebruaryCircuitProgressBar, FebruaryIntervalProgressBar, FebruaryFlexibilityProgressBar, FebruaryChallengesProgressBar;

    // March Variables
    private TextView MarchTextView, MarchAerobicTextView, MarchCircuitTextView, MarchIntervalTextView, MarchFlexibilityTextView, MarchChallengesTextView;
    public ProgressBar MarchProgressBar, MarchAerobicProgressBar, MarchCircuitProgressBar, MarchIntervalProgressBar, MarchFlexibilityProgressBar, MarchChallengesProgressBar;

    // April Variables
    private TextView AprilTextView, AprilAerobicTextView, AprilCircuitTextView, AprilIntervalTextView, AprilFlexibilityTextView, AprilChallengesTextView;
    public ProgressBar AprilProgressBar, AprilAerobicProgressBar, AprilCircuitProgressBar, AprilIntervalProgressBar, AprilFlexibilityProgressBar, AprilChallengesProgressBar;

    // May Variables
    private TextView MayTextView, MayAerobicTextView, MayCircuitTextView, MayIntervalTextView, MayFlexibilityTextView, MayChallengesTextView;
    public ProgressBar MayProgressBar, MayAerobicProgressBar, MayCircuitProgressBar, MayIntervalProgressBar, MayFlexibilityProgressBar, MayChallengesProgressBar;

    // June Variables
    private TextView JuneTextView, JuneAerobicTextView, JuneCircuitTextView, JuneIntervalTextView, JuneFlexibilityTextView, JuneChallengesTextView;
    public ProgressBar JuneProgressBar, JuneAerobicProgressBar, JuneCircuitProgressBar, JuneIntervalProgressBar, JuneFlexibilityProgressBar, JuneChallengesProgressBar;

    // July Variables
    private TextView JulyTextView, JulyAerobicTextView, JulyCircuitTextView, JulyIntervalTextView, JulyFlexibilityTextView, JulyChallengesTextView;
    public ProgressBar JulyProgressBar, JulyAerobicProgressBar, JulyCircuitProgressBar, JulyIntervalProgressBar, JulyFlexibilityProgressBar, JulyChallengesProgressBar;

    // August Variables
    private TextView AugustTextView, AugustAerobicTextView, AugustCircuitTextView, AugustIntervalTextView, AugustFlexibilityTextView, AugustChallengesTextView;
    public ProgressBar AugustProgressBar, AugustAerobicProgressBar, AugustCircuitProgressBar, AugustIntervalProgressBar, AugustFlexibilityProgressBar, AugustChallengesProgressBar;

    // September Variables
    private TextView SeptemberTextView, SeptemberAerobicTextView, SeptemberCircuitTextView, SeptemberIntervalTextView, SeptemberFlexibilityTextView, SeptemberChallengesTextView;
    public ProgressBar SeptemberProgressBar, SeptemberAerobicProgressBar, SeptemberCircuitProgressBar, SeptemberIntervalProgressBar, SeptemberFlexibilityProgressBar, SeptemberChallengesProgressBar;

    // October Variables
    private TextView OctoberTextView, OctoberAerobicTextView, OctoberCircuitTextView, OctoberIntervalTextView, OctoberFlexibilityTextView, OctoberChallengesTextView;
    public ProgressBar OctoberProgressBar, OctoberAerobicProgressBar, OctoberCircuitProgressBar, OctoberIntervalProgressBar, OctoberFlexibilityProgressBar, OctoberChallengesProgressBar;

    // November Variables
    private TextView NovemberTextView, NovemberAerobicTextView, NovemberCircuitTextView, NovemberIntervalTextView, NovemberFlexibilityTextView, NovemberChallengesTextView;
    public ProgressBar NovemberProgressBar, NovemberAerobicProgressBar, NovemberCircuitProgressBar, NovemberIntervalProgressBar, NovemberFlexibilityProgressBar, NovemberChallengesProgressBar;

    // December Variables
    private TextView DecemberTextView, DecemberAerobicTextView, DecemberCircuitTextView, DecemberIntervalTextView, DecemberFlexibilityTextView, DecemberChallengesTextView;
    public ProgressBar DecemberProgressBar, DecemberAerobicProgressBar, DecemberCircuitProgressBar, DecemberIntervalProgressBar, DecemberFlexibilityProgressBar, DecemberChallengesProgressBar;

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

        // Find February Contents
        FebruaryTextView = findViewById(R.id.FebruaryTextView);
        FebruaryAerobicTextView = findViewById(R.id.FebruaryAerobicTextView);
        FebruaryCircuitTextView = findViewById(R.id.FebruaryCircuitTextView);
        FebruaryIntervalTextView = findViewById(R.id.FebruaryIntervalTextView);
        FebruaryFlexibilityTextView = findViewById(R.id.FebruaryFlexibilityTextView);
        FebruaryChallengesTextView = findViewById(R.id.FebruaryChallengesTextView);
        FebruaryProgressBar = findViewById(R.id.FebruaryProgressBar);
        FebruaryAerobicProgressBar = findViewById(R.id.FebruaryAerobicProgressBar);
        FebruaryCircuitProgressBar = findViewById(R.id.FebruaryCircuitProgressBar);
        FebruaryIntervalProgressBar = findViewById(R.id.FebruaryIntervalProgressBar);
        FebruaryFlexibilityProgressBar = findViewById(R.id.FebruaryFlexibilityProgressBar);
        FebruaryChallengesProgressBar = findViewById(R.id.FebruaryChallengesProgressBar);

        // February Text View Clickable Actions
        FebruaryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set February Contents' Visibility to Gone
                if (FebruaryAerobicProgressBar.getVisibility() == View.VISIBLE && FebruaryCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        FebruaryIntervalProgressBar.getVisibility() == View.VISIBLE && FebruaryFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        FebruaryChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set February Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // February Progress Bar Clickable Actions
        FebruaryProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set February Contents' Visibility to Gone
                if (FebruaryAerobicProgressBar.getVisibility() == View.VISIBLE && FebruaryCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        FebruaryIntervalProgressBar.getVisibility() == View.VISIBLE && FebruaryFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        FebruaryChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set February Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find March Contents
        MarchTextView = findViewById(R.id.MarchTextView);
        MarchAerobicTextView = findViewById(R.id.MarchAerobicTextView);
        MarchCircuitTextView = findViewById(R.id.MarchCircuitTextView);
        MarchIntervalTextView = findViewById(R.id.MarchIntervalTextView);
        MarchFlexibilityTextView = findViewById(R.id.MarchFlexibilityTextView);
        MarchChallengesTextView = findViewById(R.id.MarchChallengesTextView);
        MarchProgressBar = findViewById(R.id.MarchProgressBar);
        MarchAerobicProgressBar = findViewById(R.id.MarchAerobicProgressBar);
        MarchCircuitProgressBar = findViewById(R.id.MarchCircuitProgressBar);
        MarchIntervalProgressBar = findViewById(R.id.MarchIntervalProgressBar);
        MarchFlexibilityProgressBar = findViewById(R.id.MarchFlexibilityProgressBar);
        MarchChallengesProgressBar = findViewById(R.id.MarchChallengesProgressBar);

        // March Text View Clickable Actions
        MarchTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set March Contents' Visibility to Gone
                if (MarchAerobicProgressBar.getVisibility() == View.VISIBLE && MarchCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MarchIntervalProgressBar.getVisibility() == View.VISIBLE && MarchFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MarchChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set March Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // March Progress Bar Clickable Actions
        MarchProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set March Contents' Visibility to Gone
                if (MarchAerobicProgressBar.getVisibility() == View.VISIBLE && MarchCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MarchIntervalProgressBar.getVisibility() == View.VISIBLE && MarchFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MarchChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set March Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find April Contents
        AprilTextView = findViewById(R.id.AprilTextView);
        AprilAerobicTextView = findViewById(R.id.AprilAerobicTextView);
        AprilCircuitTextView = findViewById(R.id.AprilCircuitTextView);
        AprilIntervalTextView = findViewById(R.id.AprilIntervalTextView);
        AprilFlexibilityTextView = findViewById(R.id.AprilFlexibilityTextView);
        AprilChallengesTextView = findViewById(R.id.AprilChallengesTextView);
        AprilProgressBar = findViewById(R.id.AprilProgressBar);
        AprilAerobicProgressBar = findViewById(R.id.AprilAerobicProgressBar);
        AprilCircuitProgressBar = findViewById(R.id.AprilCircuitProgressBar);
        AprilIntervalProgressBar = findViewById(R.id.AprilIntervalProgressBar);
        AprilFlexibilityProgressBar = findViewById(R.id.AprilFlexibilityProgressBar);
        AprilChallengesProgressBar = findViewById(R.id.AprilChallengesProgressBar);

        // April Text View Clickable Actions
        AprilTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set April Contents' Visibility to Gone
                if (MarchAerobicProgressBar.getVisibility() == View.VISIBLE && MarchCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MarchIntervalProgressBar.getVisibility() == View.VISIBLE && MarchFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MarchChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set April Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // April Progress Bar Clickable Actions
        AprilProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set April Contents' Visibility to Gone
                if (MarchAerobicProgressBar.getVisibility() == View.VISIBLE && MarchCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MarchIntervalProgressBar.getVisibility() == View.VISIBLE && MarchFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MarchChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set April Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find May Contents
        MayTextView = findViewById(R.id.MayTextView);
        MayAerobicTextView = findViewById(R.id.MayAerobicTextView);
        MayCircuitTextView = findViewById(R.id.MayCircuitTextView);
        MayIntervalTextView = findViewById(R.id.MayIntervalTextView);
        MayFlexibilityTextView = findViewById(R.id.MayFlexibilityTextView);
        MayChallengesTextView = findViewById(R.id.MayChallengesTextView);
        MayProgressBar = findViewById(R.id.MayProgressBar);
        MayAerobicProgressBar = findViewById(R.id.MayAerobicProgressBar);
        MayCircuitProgressBar = findViewById(R.id.MayCircuitProgressBar);
        MayIntervalProgressBar = findViewById(R.id.MayIntervalProgressBar);
        MayFlexibilityProgressBar = findViewById(R.id.MayFlexibilityProgressBar);
        MayChallengesProgressBar = findViewById(R.id.MayChallengesProgressBar);

        // May Text View Clickable Actions
        MayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set May Contents' Visibility to Gone
                if (MayAerobicProgressBar.getVisibility() == View.VISIBLE && MayCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MayIntervalProgressBar.getVisibility() == View.VISIBLE && MayFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MayChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set May Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // May Progress Bar Clickable Actions
        MayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set May Contents' Visibility to Gone
                if (MayAerobicProgressBar.getVisibility() == View.VISIBLE && MayCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        MayIntervalProgressBar.getVisibility() == View.VISIBLE && MayFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        MayChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set May Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find June Contents
        JuneTextView = findViewById(R.id.JuneTextView);
        JuneAerobicTextView = findViewById(R.id.JuneAerobicTextView);
        JuneCircuitTextView = findViewById(R.id.JuneCircuitTextView);
        JuneIntervalTextView = findViewById(R.id.JuneIntervalTextView);
        JuneFlexibilityTextView = findViewById(R.id.JuneFlexibilityTextView);
        JuneChallengesTextView = findViewById(R.id.JuneChallengesTextView);
        JuneProgressBar = findViewById(R.id.JuneProgressBar);
        JuneAerobicProgressBar = findViewById(R.id.JuneAerobicProgressBar);
        JuneCircuitProgressBar = findViewById(R.id.JuneCircuitProgressBar);
        JuneIntervalProgressBar = findViewById(R.id.JuneIntervalProgressBar);
        JuneFlexibilityProgressBar = findViewById(R.id.JuneFlexibilityProgressBar);
        JuneChallengesProgressBar = findViewById(R.id.JuneChallengesProgressBar);

        // June Text View Clickable Actions
        JuneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set June Contents' Visibility to Gone
                if (JuneAerobicProgressBar.getVisibility() == View.VISIBLE && JuneCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JuneIntervalProgressBar.getVisibility() == View.VISIBLE && JuneFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JuneChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set June Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // June Progress Bar Clickable Actions
        JuneProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set June Contents' Visibility to Gone
                if (JuneAerobicProgressBar.getVisibility() == View.VISIBLE && JuneCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JuneIntervalProgressBar.getVisibility() == View.VISIBLE && JuneFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JuneChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set June Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find July Contents
        JulyTextView = findViewById(R.id.JulyTextView);
        JulyAerobicTextView = findViewById(R.id.JulyAerobicTextView);
        JulyCircuitTextView = findViewById(R.id.JulyCircuitTextView);
        JulyIntervalTextView = findViewById(R.id.JulyIntervalTextView);
        JulyFlexibilityTextView = findViewById(R.id.JulyFlexibilityTextView);
        JulyChallengesTextView = findViewById(R.id.JulyChallengesTextView);
        JulyProgressBar = findViewById(R.id.JulyProgressBar);
        JulyAerobicProgressBar = findViewById(R.id.JulyAerobicProgressBar);
        JulyCircuitProgressBar = findViewById(R.id.JulyCircuitProgressBar);
        JulyIntervalProgressBar = findViewById(R.id.JulyIntervalProgressBar);
        JulyFlexibilityProgressBar = findViewById(R.id.JulyFlexibilityProgressBar);
        JulyChallengesProgressBar = findViewById(R.id.JulyChallengesProgressBar);

        // July Text View Clickable Actions
        JulyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set July Contents' Visibility to Gone
                if (JulyAerobicProgressBar.getVisibility() == View.VISIBLE && JulyCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JulyIntervalProgressBar.getVisibility() == View.VISIBLE && JulyFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JulyChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set July Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // July Progress Bar Clickable Actions
        JulyProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set July Contents' Visibility to Gone
                if (JulyAerobicProgressBar.getVisibility() == View.VISIBLE && JulyCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        JulyIntervalProgressBar.getVisibility() == View.VISIBLE && JulyFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        JulyChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set July Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find August Contents
        AugustTextView = findViewById(R.id.AugustTextView);
        AugustAerobicTextView = findViewById(R.id.AugustAerobicTextView);
        AugustCircuitTextView = findViewById(R.id.AugustCircuitTextView);
        AugustIntervalTextView = findViewById(R.id.AugustIntervalTextView);
        AugustFlexibilityTextView = findViewById(R.id.AugustFlexibilityTextView);
        AugustChallengesTextView = findViewById(R.id.AugustChallengesTextView);
        AugustProgressBar = findViewById(R.id.AugustProgressBar);
        AugustAerobicProgressBar = findViewById(R.id.AugustAerobicProgressBar);
        AugustCircuitProgressBar = findViewById(R.id.AugustCircuitProgressBar);
        AugustIntervalProgressBar = findViewById(R.id.AugustIntervalProgressBar);
        AugustFlexibilityProgressBar = findViewById(R.id.AugustFlexibilityProgressBar);
        AugustChallengesProgressBar = findViewById(R.id.AugustChallengesProgressBar);

        // August Text View Clickable Actions
        AugustTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set August Contents' Visibility to Gone
                if (AugustAerobicProgressBar.getVisibility() == View.VISIBLE && AugustCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        AugustIntervalProgressBar.getVisibility() == View.VISIBLE && AugustFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        AugustChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set August Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // August Progress Bar Clickable Actions
        AugustProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set August Contents' Visibility to Gone
                if (AugustAerobicProgressBar.getVisibility() == View.VISIBLE && AugustCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        AugustIntervalProgressBar.getVisibility() == View.VISIBLE && AugustFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        AugustChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set August Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find September Contents
        SeptemberTextView = findViewById(R.id.SeptemberTextView);
        SeptemberAerobicTextView = findViewById(R.id.SeptemberAerobicTextView);
        SeptemberCircuitTextView = findViewById(R.id.SeptemberCircuitTextView);
        SeptemberIntervalTextView = findViewById(R.id.SeptemberIntervalTextView);
        SeptemberFlexibilityTextView = findViewById(R.id.SeptemberFlexibilityTextView);
        SeptemberChallengesTextView = findViewById(R.id.SeptemberChallengesTextView);
        SeptemberProgressBar = findViewById(R.id.SeptemberProgressBar);
        SeptemberAerobicProgressBar = findViewById(R.id.SeptemberAerobicProgressBar);
        SeptemberCircuitProgressBar = findViewById(R.id.SeptemberCircuitProgressBar);
        SeptemberIntervalProgressBar = findViewById(R.id.SeptemberIntervalProgressBar);
        SeptemberFlexibilityProgressBar = findViewById(R.id.SeptemberFlexibilityProgressBar);
        SeptemberChallengesProgressBar = findViewById(R.id.SeptemberChallengesProgressBar);

        // September Text View Clickable Actions
        SeptemberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set September Contents' Visibility to Gone
                if (SeptemberAerobicProgressBar.getVisibility() == View.VISIBLE && SeptemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        SeptemberIntervalProgressBar.getVisibility() == View.VISIBLE && SeptemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        SeptemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set September Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // September Progress Bar Clickable Actions
        SeptemberProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set September Contents' Visibility to Gone
                if (SeptemberAerobicProgressBar.getVisibility() == View.VISIBLE && SeptemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        SeptemberIntervalProgressBar.getVisibility() == View.VISIBLE && SeptemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        SeptemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set September Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find October Contents
        OctoberTextView = findViewById(R.id.OctoberTextView);
        OctoberAerobicTextView = findViewById(R.id.OctoberAerobicTextView);
        OctoberCircuitTextView = findViewById(R.id.OctoberCircuitTextView);
        OctoberIntervalTextView = findViewById(R.id.OctoberIntervalTextView);
        OctoberFlexibilityTextView = findViewById(R.id.OctoberFlexibilityTextView);
        OctoberChallengesTextView = findViewById(R.id.OctoberChallengesTextView);
        OctoberProgressBar = findViewById(R.id.OctoberProgressBar);
        OctoberAerobicProgressBar = findViewById(R.id.OctoberAerobicProgressBar);
        OctoberCircuitProgressBar = findViewById(R.id.OctoberCircuitProgressBar);
        OctoberIntervalProgressBar = findViewById(R.id.OctoberIntervalProgressBar);
        OctoberFlexibilityProgressBar = findViewById(R.id.OctoberFlexibilityProgressBar);
        OctoberChallengesProgressBar = findViewById(R.id.OctoberChallengesProgressBar);

        // October Text View Clickable Actions
        OctoberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set October Contents' Visibility to Gone
                if (OctoberAerobicProgressBar.getVisibility() == View.VISIBLE && OctoberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        OctoberIntervalProgressBar.getVisibility() == View.VISIBLE && OctoberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        OctoberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set October Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // October Progress Bar Clickable Actions
        OctoberProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set October Contents' Visibility to Gone
                if (OctoberAerobicProgressBar.getVisibility() == View.VISIBLE && OctoberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        OctoberIntervalProgressBar.getVisibility() == View.VISIBLE && OctoberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        OctoberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set October Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find November Contents
        NovemberTextView = findViewById(R.id.NovemberTextView);
        NovemberAerobicTextView = findViewById(R.id.NovemberAerobicTextView);
        NovemberCircuitTextView = findViewById(R.id.NovemberCircuitTextView);
        NovemberIntervalTextView = findViewById(R.id.NovemberIntervalTextView);
        NovemberFlexibilityTextView = findViewById(R.id.NovemberFlexibilityTextView);
        NovemberChallengesTextView = findViewById(R.id.NovemberChallengesTextView);
        NovemberProgressBar = findViewById(R.id.NovemberProgressBar);
        NovemberAerobicProgressBar = findViewById(R.id.NovemberAerobicProgressBar);
        NovemberCircuitProgressBar = findViewById(R.id.NovemberCircuitProgressBar);
        NovemberIntervalProgressBar = findViewById(R.id.NovemberIntervalProgressBar);
        NovemberFlexibilityProgressBar = findViewById(R.id.NovemberFlexibilityProgressBar);
        NovemberChallengesProgressBar = findViewById(R.id.NovemberChallengesProgressBar);

        // November Text View Clickable Actions
        NovemberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set November Contents' Visibility to Gone
                if (NovemberAerobicProgressBar.getVisibility() == View.VISIBLE && NovemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        NovemberIntervalProgressBar.getVisibility() == View.VISIBLE && NovemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        NovemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set November Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // November Progress Bar Clickable Actions
        NovemberProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set November Contents' Visibility to Gone
                if (NovemberAerobicProgressBar.getVisibility() == View.VISIBLE && NovemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        NovemberIntervalProgressBar.getVisibility() == View.VISIBLE && NovemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        NovemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set November Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Find December Contents
        DecemberTextView = findViewById(R.id.DecemberTextView);
        DecemberAerobicTextView = findViewById(R.id.DecemberAerobicTextView);
        DecemberCircuitTextView = findViewById(R.id.DecemberCircuitTextView);
        DecemberIntervalTextView = findViewById(R.id.DecemberIntervalTextView);
        DecemberFlexibilityTextView = findViewById(R.id.DecemberFlexibilityTextView);
        DecemberChallengesTextView = findViewById(R.id.DecemberChallengesTextView);
        DecemberProgressBar = findViewById(R.id.DecemberProgressBar);
        DecemberAerobicProgressBar = findViewById(R.id.DecemberAerobicProgressBar);
        DecemberCircuitProgressBar = findViewById(R.id.DecemberCircuitProgressBar);
        DecemberIntervalProgressBar = findViewById(R.id.DecemberIntervalProgressBar);
        DecemberFlexibilityProgressBar = findViewById(R.id.DecemberFlexibilityProgressBar);
        DecemberChallengesProgressBar = findViewById(R.id.DecemberChallengesProgressBar);

        // December Text View Clickable Actions
        DecemberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set December Contents' Visibility to Gone
                if (DecemberAerobicProgressBar.getVisibility() == View.VISIBLE && DecemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        DecemberIntervalProgressBar.getVisibility() == View.VISIBLE && DecemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        DecemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set December Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // December Progress Bar Clickable Actions
        DecemberProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set December Contents' Visibility to Gone
                if (DecemberAerobicProgressBar.getVisibility() == View.VISIBLE && DecemberCircuitProgressBar.getVisibility() == View.VISIBLE &&
                        DecemberIntervalProgressBar.getVisibility() == View.VISIBLE && DecemberFlexibilityProgressBar.getVisibility() == View.VISIBLE &&
                        DecemberChallengesProgressBar.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set December Contents' Visibility to Visible
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

        // Set February Content's Visibility to Gone
        else if (FebruaryTextView.isPressed() || FebruaryProgressBar.isPressed()) {
            FebruaryAerobicProgressBar.setVisibility(View.GONE);
            FebruaryCircuitProgressBar.setVisibility(View.GONE);
            FebruaryIntervalProgressBar.setVisibility(View.GONE);
            FebruaryFlexibilityProgressBar.setVisibility(View.GONE);
            FebruaryChallengesProgressBar.setVisibility(View.GONE);
            FebruaryAerobicTextView.setVisibility(View.GONE);
            FebruaryCircuitTextView.setVisibility(View.GONE);
            FebruaryIntervalTextView.setVisibility(View.GONE);
            FebruaryFlexibilityTextView.setVisibility(View.GONE);
            FebruaryChallengesTextView.setVisibility(View.GONE);
        }

        // Set March Content's Visibility to Gone
        else if (MarchTextView.isPressed() || MarchProgressBar.isPressed()) {
            MarchAerobicProgressBar.setVisibility(View.GONE);
            MarchCircuitProgressBar.setVisibility(View.GONE);
            MarchIntervalProgressBar.setVisibility(View.GONE);
            MarchFlexibilityProgressBar.setVisibility(View.GONE);
            MarchChallengesProgressBar.setVisibility(View.GONE);
            MarchAerobicTextView.setVisibility(View.GONE);
            MarchCircuitTextView.setVisibility(View.GONE);
            MarchIntervalTextView.setVisibility(View.GONE);
            MarchFlexibilityTextView.setVisibility(View.GONE);
            MarchChallengesTextView.setVisibility(View.GONE);
        }

        // Set April Content's Visibility to Gone
        else if (AprilTextView.isPressed() || AprilProgressBar.isPressed()) {
            AprilAerobicProgressBar.setVisibility(View.GONE);
            AprilCircuitProgressBar.setVisibility(View.GONE);
            AprilIntervalProgressBar.setVisibility(View.GONE);
            AprilFlexibilityProgressBar.setVisibility(View.GONE);
            AprilChallengesProgressBar.setVisibility(View.GONE);
            AprilAerobicTextView.setVisibility(View.GONE);
            AprilCircuitTextView.setVisibility(View.GONE);
            AprilIntervalTextView.setVisibility(View.GONE);
            AprilFlexibilityTextView.setVisibility(View.GONE);
            AprilChallengesTextView.setVisibility(View.GONE);
        }

        // Set May Content's Visibility to Gone
        else if (MayTextView.isPressed() || MayProgressBar.isPressed()) {
            MayAerobicProgressBar.setVisibility(View.GONE);
            MayCircuitProgressBar.setVisibility(View.GONE);
            MayIntervalProgressBar.setVisibility(View.GONE);
            MayFlexibilityProgressBar.setVisibility(View.GONE);
            MayChallengesProgressBar.setVisibility(View.GONE);
            MayAerobicTextView.setVisibility(View.GONE);
            MayCircuitTextView.setVisibility(View.GONE);
            MayIntervalTextView.setVisibility(View.GONE);
            MayFlexibilityTextView.setVisibility(View.GONE);
            MayChallengesTextView.setVisibility(View.GONE);
        }

        // Set June Content's Visibility to Gone
        else if (JuneTextView.isPressed() || JuneProgressBar.isPressed()) {
            JuneAerobicProgressBar.setVisibility(View.GONE);
            JuneCircuitProgressBar.setVisibility(View.GONE);
            JuneIntervalProgressBar.setVisibility(View.GONE);
            JuneFlexibilityProgressBar.setVisibility(View.GONE);
            JuneChallengesProgressBar.setVisibility(View.GONE);
            JuneAerobicTextView.setVisibility(View.GONE);
            JuneCircuitTextView.setVisibility(View.GONE);
            JuneIntervalTextView.setVisibility(View.GONE);
            JuneFlexibilityTextView.setVisibility(View.GONE);
            JuneChallengesTextView.setVisibility(View.GONE);
        }

        // Set July Content's Visibility to Gone
        else if (JulyTextView.isPressed() || JulyProgressBar.isPressed()) {
            JulyAerobicProgressBar.setVisibility(View.GONE);
            JulyCircuitProgressBar.setVisibility(View.GONE);
            JulyIntervalProgressBar.setVisibility(View.GONE);
            JulyFlexibilityProgressBar.setVisibility(View.GONE);
            JulyChallengesProgressBar.setVisibility(View.GONE);
            JulyAerobicTextView.setVisibility(View.GONE);
            JulyCircuitTextView.setVisibility(View.GONE);
            JulyIntervalTextView.setVisibility(View.GONE);
            JulyFlexibilityTextView.setVisibility(View.GONE);
            JulyChallengesTextView.setVisibility(View.GONE);
        }

        // Set August Content's Visibility to Gone
        else if (AugustTextView.isPressed() || AugustProgressBar.isPressed()) {
            AugustAerobicProgressBar.setVisibility(View.GONE);
            AugustCircuitProgressBar.setVisibility(View.GONE);
            AugustIntervalProgressBar.setVisibility(View.GONE);
            AugustFlexibilityProgressBar.setVisibility(View.GONE);
            AugustChallengesProgressBar.setVisibility(View.GONE);
            AugustAerobicTextView.setVisibility(View.GONE);
            AugustCircuitTextView.setVisibility(View.GONE);
            AugustIntervalTextView.setVisibility(View.GONE);
            AugustFlexibilityTextView.setVisibility(View.GONE);
            AugustChallengesTextView.setVisibility(View.GONE);
        }

        // Set September Content's Visibility to Gone
        else if (SeptemberTextView.isPressed() || SeptemberProgressBar.isPressed()) {
            SeptemberAerobicProgressBar.setVisibility(View.GONE);
            SeptemberCircuitProgressBar.setVisibility(View.GONE);
            SeptemberIntervalProgressBar.setVisibility(View.GONE);
            SeptemberFlexibilityProgressBar.setVisibility(View.GONE);
            SeptemberChallengesProgressBar.setVisibility(View.GONE);
            SeptemberAerobicTextView.setVisibility(View.GONE);
            SeptemberCircuitTextView.setVisibility(View.GONE);
            SeptemberIntervalTextView.setVisibility(View.GONE);
            SeptemberFlexibilityTextView.setVisibility(View.GONE);
            SeptemberChallengesTextView.setVisibility(View.GONE);
        }

        // Set October Content's Visibility to Gone
        else if (OctoberTextView.isPressed() || OctoberProgressBar.isPressed()) {
            OctoberAerobicProgressBar.setVisibility(View.GONE);
            OctoberCircuitProgressBar.setVisibility(View.GONE);
            OctoberIntervalProgressBar.setVisibility(View.GONE);
            OctoberFlexibilityProgressBar.setVisibility(View.GONE);
            OctoberChallengesProgressBar.setVisibility(View.GONE);
            OctoberAerobicTextView.setVisibility(View.GONE);
            OctoberCircuitTextView.setVisibility(View.GONE);
            OctoberIntervalTextView.setVisibility(View.GONE);
            OctoberFlexibilityTextView.setVisibility(View.GONE);
            OctoberChallengesTextView.setVisibility(View.GONE);
        }

        // Set November Content's Visibility to Gone
        else if (NovemberTextView.isPressed() || NovemberProgressBar.isPressed()) {
            NovemberAerobicProgressBar.setVisibility(View.GONE);
            NovemberCircuitProgressBar.setVisibility(View.GONE);
            NovemberIntervalProgressBar.setVisibility(View.GONE);
            NovemberFlexibilityProgressBar.setVisibility(View.GONE);
            NovemberChallengesProgressBar.setVisibility(View.GONE);
            NovemberAerobicTextView.setVisibility(View.GONE);
            NovemberCircuitTextView.setVisibility(View.GONE);
            NovemberIntervalTextView.setVisibility(View.GONE);
            NovemberFlexibilityTextView.setVisibility(View.GONE);
            NovemberChallengesTextView.setVisibility(View.GONE);
        }

        // Set December Content's Visibility to Gone
        else {
            DecemberAerobicProgressBar.setVisibility(View.GONE);
            DecemberCircuitProgressBar.setVisibility(View.GONE);
            DecemberIntervalProgressBar.setVisibility(View.GONE);
            DecemberFlexibilityProgressBar.setVisibility(View.GONE);
            DecemberChallengesProgressBar.setVisibility(View.GONE);
            DecemberAerobicTextView.setVisibility(View.GONE);
            DecemberCircuitTextView.setVisibility(View.GONE);
            DecemberIntervalTextView.setVisibility(View.GONE);
            DecemberFlexibilityTextView.setVisibility(View.GONE);
            DecemberChallengesTextView.setVisibility(View.GONE);
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

        // Set February Content's Visibility to Visible
        else if (FebruaryTextView.isPressed() || FebruaryProgressBar.isPressed()) {
            FebruaryAerobicProgressBar.setVisibility(View.VISIBLE);
            FebruaryCircuitProgressBar.setVisibility(View.VISIBLE);
            FebruaryIntervalProgressBar.setVisibility(View.VISIBLE);
            FebruaryFlexibilityProgressBar.setVisibility(View.VISIBLE);
            FebruaryChallengesProgressBar.setVisibility(View.VISIBLE);
            FebruaryAerobicTextView.setVisibility(View.VISIBLE);
            FebruaryCircuitTextView.setVisibility(View.VISIBLE);
            FebruaryIntervalTextView.setVisibility(View.VISIBLE);
            FebruaryFlexibilityTextView.setVisibility(View.VISIBLE);
            FebruaryChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set March Content's Visibility to Visible
        else if (MarchTextView.isPressed() || MarchProgressBar.isPressed()) {
            MarchAerobicProgressBar.setVisibility(View.VISIBLE);
            MarchCircuitProgressBar.setVisibility(View.VISIBLE);
            MarchIntervalProgressBar.setVisibility(View.VISIBLE);
            MarchFlexibilityProgressBar.setVisibility(View.VISIBLE);
            MarchChallengesProgressBar.setVisibility(View.VISIBLE);
            MarchAerobicTextView.setVisibility(View.VISIBLE);
            MarchCircuitTextView.setVisibility(View.VISIBLE);
            MarchIntervalTextView.setVisibility(View.VISIBLE);
            MarchFlexibilityTextView.setVisibility(View.VISIBLE);
            MarchChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set April Content's Visibility to Visible
        else if (AprilTextView.isPressed() || AprilProgressBar.isPressed()) {
            AprilAerobicProgressBar.setVisibility(View.VISIBLE);
            AprilCircuitProgressBar.setVisibility(View.VISIBLE);
            AprilIntervalProgressBar.setVisibility(View.VISIBLE);
            AprilFlexibilityProgressBar.setVisibility(View.VISIBLE);
            AprilChallengesProgressBar.setVisibility(View.VISIBLE);
            AprilAerobicTextView.setVisibility(View.VISIBLE);
            AprilCircuitTextView.setVisibility(View.VISIBLE);
            AprilIntervalTextView.setVisibility(View.VISIBLE);
            AprilFlexibilityTextView.setVisibility(View.VISIBLE);
            AprilChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set May Content's Visibility to Visible
        else if (MayTextView.isPressed() || MayProgressBar.isPressed()) {
            MayAerobicProgressBar.setVisibility(View.VISIBLE);
            MayCircuitProgressBar.setVisibility(View.VISIBLE);
            MayIntervalProgressBar.setVisibility(View.VISIBLE);
            MayFlexibilityProgressBar.setVisibility(View.VISIBLE);
            MayChallengesProgressBar.setVisibility(View.VISIBLE);
            MayAerobicTextView.setVisibility(View.VISIBLE);
            MayCircuitTextView.setVisibility(View.VISIBLE);
            MayIntervalTextView.setVisibility(View.VISIBLE);
            MayFlexibilityTextView.setVisibility(View.VISIBLE);
            MayChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set June Content's Visibility to Visible
        else if (JuneTextView.isPressed() || JuneProgressBar.isPressed()) {
            JuneAerobicProgressBar.setVisibility(View.VISIBLE);
            JuneCircuitProgressBar.setVisibility(View.VISIBLE);
            JuneIntervalProgressBar.setVisibility(View.VISIBLE);
            JuneFlexibilityProgressBar.setVisibility(View.VISIBLE);
            JuneChallengesProgressBar.setVisibility(View.VISIBLE);
            JuneAerobicTextView.setVisibility(View.VISIBLE);
            JuneCircuitTextView.setVisibility(View.VISIBLE);
            JuneIntervalTextView.setVisibility(View.VISIBLE);
            JuneFlexibilityTextView.setVisibility(View.VISIBLE);
            JuneChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set July Content's Visibility to Visible
        else if (JulyTextView.isPressed() || JulyProgressBar.isPressed()) {
            JulyAerobicProgressBar.setVisibility(View.VISIBLE);
            JulyCircuitProgressBar.setVisibility(View.VISIBLE);
            JulyIntervalProgressBar.setVisibility(View.VISIBLE);
            JulyFlexibilityProgressBar.setVisibility(View.VISIBLE);
            JulyChallengesProgressBar.setVisibility(View.VISIBLE);
            JulyAerobicTextView.setVisibility(View.VISIBLE);
            JulyCircuitTextView.setVisibility(View.VISIBLE);
            JulyIntervalTextView.setVisibility(View.VISIBLE);
            JulyFlexibilityTextView.setVisibility(View.VISIBLE);
            JulyChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set August Content's Visibility to Visible
        else if (AugustTextView.isPressed() || AugustProgressBar.isPressed()) {
            AugustAerobicProgressBar.setVisibility(View.VISIBLE);
            AugustCircuitProgressBar.setVisibility(View.VISIBLE);
            AugustIntervalProgressBar.setVisibility(View.VISIBLE);
            AugustFlexibilityProgressBar.setVisibility(View.VISIBLE);
            AugustChallengesProgressBar.setVisibility(View.VISIBLE);
            AugustAerobicTextView.setVisibility(View.VISIBLE);
            AugustCircuitTextView.setVisibility(View.VISIBLE);
            AugustIntervalTextView.setVisibility(View.VISIBLE);
            AugustFlexibilityTextView.setVisibility(View.VISIBLE);
            AugustChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set September Content's Visibility to Visible
        else if (SeptemberTextView.isPressed() || SeptemberProgressBar.isPressed()) {
            SeptemberAerobicProgressBar.setVisibility(View.VISIBLE);
            SeptemberCircuitProgressBar.setVisibility(View.VISIBLE);
            SeptemberIntervalProgressBar.setVisibility(View.VISIBLE);
            SeptemberFlexibilityProgressBar.setVisibility(View.VISIBLE);
            SeptemberChallengesProgressBar.setVisibility(View.VISIBLE);
            SeptemberAerobicTextView.setVisibility(View.VISIBLE);
            SeptemberCircuitTextView.setVisibility(View.VISIBLE);
            SeptemberIntervalTextView.setVisibility(View.VISIBLE);
            SeptemberFlexibilityTextView.setVisibility(View.VISIBLE);
            SeptemberChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set October Content's Visibility to Visible
        else if (OctoberTextView.isPressed() || OctoberProgressBar.isPressed()) {
            OctoberAerobicProgressBar.setVisibility(View.VISIBLE);
            OctoberCircuitProgressBar.setVisibility(View.VISIBLE);
            OctoberIntervalProgressBar.setVisibility(View.VISIBLE);
            OctoberFlexibilityProgressBar.setVisibility(View.VISIBLE);
            OctoberChallengesProgressBar.setVisibility(View.VISIBLE);
            OctoberAerobicTextView.setVisibility(View.VISIBLE);
            OctoberCircuitTextView.setVisibility(View.VISIBLE);
            OctoberIntervalTextView.setVisibility(View.VISIBLE);
            OctoberFlexibilityTextView.setVisibility(View.VISIBLE);
            OctoberChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set November Content's Visibility to Visible
        else if (NovemberTextView.isPressed() || NovemberProgressBar.isPressed()) {
            NovemberAerobicProgressBar.setVisibility(View.VISIBLE);
            NovemberCircuitProgressBar.setVisibility(View.VISIBLE);
            NovemberIntervalProgressBar.setVisibility(View.VISIBLE);
            NovemberFlexibilityProgressBar.setVisibility(View.VISIBLE);
            NovemberChallengesProgressBar.setVisibility(View.VISIBLE);
            NovemberAerobicTextView.setVisibility(View.VISIBLE);
            NovemberCircuitTextView.setVisibility(View.VISIBLE);
            NovemberIntervalTextView.setVisibility(View.VISIBLE);
            NovemberFlexibilityTextView.setVisibility(View.VISIBLE);
            NovemberChallengesTextView.setVisibility(View.VISIBLE);
        }

        // Set December Content's Visibility to Visible
        else {
            DecemberAerobicProgressBar.setVisibility(View.VISIBLE);
            DecemberCircuitProgressBar.setVisibility(View.VISIBLE);
            DecemberIntervalProgressBar.setVisibility(View.VISIBLE);
            DecemberFlexibilityProgressBar.setVisibility(View.VISIBLE);
            DecemberChallengesProgressBar.setVisibility(View.VISIBLE);
            DecemberAerobicTextView.setVisibility(View.VISIBLE);
            DecemberCircuitTextView.setVisibility(View.VISIBLE);
            DecemberIntervalTextView.setVisibility(View.VISIBLE);
            DecemberFlexibilityTextView.setVisibility(View.VISIBLE);
            DecemberChallengesTextView.setVisibility(View.VISIBLE);
        }
    }
}
