package com.example.fitbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WeeklyTracker extends AppCompatActivity {

    private TextView MondayTextView, TuesdayTextView, WednesdayTextView, ThursdayTextView,FridayTextView, SaturdayTextView, SundayTextView;
    private ProgressBar MondayProgressBar, TuesdayProgressBar, WednesdayProgressBar, ThursdayProgressBar, FridayProgressBar, SaturdayProgressBar, SundayProgressBar;
    public CheckBox MondayAerobicCheckbox, MondayCircuitCheckbox, MondayIntervalCheckbox, MondayFlexibilityCheckbox, MondayChallengesCheckbox;
    public CheckBox TuesdayAerobicCheckbox, TuesdayCircuitCheckbox, TuesdayIntervalCheckbox, TuesdayFlexibilityCheckbox, TuesdayChallengesCheckbox;
    public CheckBox WednesdayAerobicCheckbox, WednesdayCircuitCheckbox, WednesdayIntervalCheckbox, WednesdayFlexibilityCheckbox, WednesdayChallengesCheckbox;
    public CheckBox ThursdayAerobicCheckbox, ThursdayCircuitCheckbox, ThursdayIntervalCheckbox, ThursdayFlexibilityCheckbox, ThursdayChallengesCheckbox;
    public CheckBox FridayAerobicCheckbox, FridayCircuitCheckbox, FridayIntervalCheckbox, FridayFlexibilityCheckbox, FridayChallengesCheckbox;
    public CheckBox SaturdayAerobicCheckbox, SaturdayCircuitCheckbox, SaturdayIntervalCheckbox, SaturdayFlexibilityCheckbox, SaturdayChallengesCheckbox;
    public CheckBox SundayAerobicCheckbox, SundayCircuitCheckbox, SundayIntervalCheckbox, SundayFlexibilityCheckbox, SundayChallengesCheckbox;

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
                // Set Monday Contents' Visibility to Gone
                if (MondayAerobicCheckbox.getVisibility() == View.VISIBLE && MondayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        MondayIntervalCheckbox.getVisibility() == View.VISIBLE && MondayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        MondayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Monday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Monday Progress Bar Clickable Actions
        MondayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Monday Contents' Visibility to Gone
                if (MondayAerobicCheckbox.getVisibility() == View.VISIBLE && MondayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        MondayIntervalCheckbox.getVisibility() == View.VISIBLE && MondayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        MondayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Monday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Set On Click Listener for MondayAerobicCheckbox
        MondayAerobicCheckbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // If only 1 checkbox is true
                if ((MondayAerobicCheckbox.isChecked() && MondayProgressBar.getProgress() == 0) || (MondayAerobicCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 40)){
                    MondayProgressBar.setProgress(20);
                }
                // If 2 checkboxes are true
                else if ((MondayAerobicCheckbox.isChecked() && MondayProgressBar.getProgress() == 20) || (MondayAerobicCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 60)){
                    MondayProgressBar.setProgress(40);
                }
                // If 3 checkboxes are true
                else if ((MondayAerobicCheckbox.isChecked() && MondayProgressBar.getProgress() == 40) || (MondayAerobicCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 80)){
                    MondayProgressBar.setProgress(60);
                }
                // If 4 checkboxes are true
                else if ((MondayAerobicCheckbox.isChecked() && MondayProgressBar.getProgress() == 60) || (MondayAerobicCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 100)){
                    MondayProgressBar.setProgress(80);
                }
                // If all checkboxes are true
                else if (MondayAerobicCheckbox.isChecked() && MondayProgressBar.getProgress() == 80){
                    MondayProgressBar.setProgress(100);
                }
                // If all checkboxes are false
                else {
                    MondayProgressBar.setProgress(0);
                }
            }
        });

        // Set On Click Listener for MondayCircuitCheckbox
        MondayCircuitCheckbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // If only 1 checkbox is true
                if ((MondayCircuitCheckbox.isChecked() && MondayProgressBar.getProgress() == 0) || (MondayCircuitCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 40)){
                    MondayProgressBar.setProgress(20);
                }
                // If 2 checkboxes are true
                else if ((MondayCircuitCheckbox.isChecked() && MondayProgressBar.getProgress() == 20) || (MondayCircuitCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 60)){
                    MondayProgressBar.setProgress(40);
                }
                // If 3 checkboxes are true
                else if ((MondayCircuitCheckbox.isChecked() && MondayProgressBar.getProgress() == 40) || (MondayCircuitCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 80)){
                    MondayProgressBar.setProgress(60);
                }
                // If 4 checkboxes are true
                else if ((MondayCircuitCheckbox.isChecked() && MondayProgressBar.getProgress() == 60) || (MondayCircuitCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 100)){
                    MondayProgressBar.setProgress(80);
                }
                // If all checkboxes are true
                else if (MondayCircuitCheckbox.isChecked() && MondayProgressBar.getProgress() == 80){
                    MondayProgressBar.setProgress(100);
                }
                // If all checkboxes are false
                else {
                    MondayProgressBar.setProgress(0);
                }
            }
        });

        // Set On Click Listener for MondayIntervalCheckbox
        MondayIntervalCheckbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // If only 1 checkbox is true
                if ((MondayIntervalCheckbox.isChecked() && MondayProgressBar.getProgress() == 0) || (MondayIntervalCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 40)){
                    MondayProgressBar.setProgress(20);
                }
                // If 2 checkboxes are true
                else if ((MondayIntervalCheckbox.isChecked() && MondayProgressBar.getProgress() == 20) || (MondayIntervalCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 60)){
                    MondayProgressBar.setProgress(40);
                }
                // If 3 checkboxes are true
                else if ((MondayIntervalCheckbox.isChecked() && MondayProgressBar.getProgress() == 40) || (MondayIntervalCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 80)){
                    MondayProgressBar.setProgress(60);
                }
                // If 4 checkboxes are true
                else if ((MondayIntervalCheckbox.isChecked() && MondayProgressBar.getProgress() == 60) || (MondayIntervalCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 100)){
                    MondayProgressBar.setProgress(80);
                }
                // If all checkboxes are true
                else if (MondayIntervalCheckbox.isChecked() && MondayProgressBar.getProgress() == 80){
                    MondayProgressBar.setProgress(100);
                }
                // If all checkboxes are false
                else {
                    MondayProgressBar.setProgress(0);
                }
            }
        });

        // Set On Click Listener for MondayFlexibilityCheckbox
        MondayFlexibilityCheckbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // If only 1 checkbox is true
                if ((MondayFlexibilityCheckbox.isChecked() && MondayProgressBar.getProgress() == 0) || (MondayFlexibilityCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 40)){
                    MondayProgressBar.setProgress(20);
                }
                // If 2 checkboxes are true
                else if ((MondayFlexibilityCheckbox.isChecked() && MondayProgressBar.getProgress() == 20) || (MondayFlexibilityCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 60)){
                    MondayProgressBar.setProgress(40);
                }
                // If 3 checkboxes are true
                else if ((MondayFlexibilityCheckbox.isChecked() && MondayProgressBar.getProgress() == 40) || (MondayFlexibilityCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 80)){
                    MondayProgressBar.setProgress(60);
                }
                // If 4 checkboxes are true
                else if ((MondayFlexibilityCheckbox.isChecked() && MondayProgressBar.getProgress() == 60) || (MondayFlexibilityCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 100)){
                    MondayProgressBar.setProgress(80);
                }
                // If all checkboxes are true
                else if (MondayFlexibilityCheckbox.isChecked() && MondayProgressBar.getProgress() == 80){
                    MondayProgressBar.setProgress(100);
                }
                // If all checkboxes are false
                else {
                    MondayProgressBar.setProgress(0);
                }
            }
        });

        // Set On Click Listener for MondayChallengesCheckbox
        MondayChallengesCheckbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // If only 1 checkbox is true
                if ((MondayChallengesCheckbox.isChecked() && MondayProgressBar.getProgress() == 0) || (MondayChallengesCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 40)){
                    MondayProgressBar.setProgress(20);
                }
                // If 2 checkboxes are true
                else if ((MondayChallengesCheckbox.isChecked() && MondayProgressBar.getProgress() == 20) || (MondayChallengesCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 60)){
                    MondayProgressBar.setProgress(40);
                }
                // If 3 checkboxes are true
                else if ((MondayChallengesCheckbox.isChecked() && MondayProgressBar.getProgress() == 40) || (MondayChallengesCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 80)){
                    MondayProgressBar.setProgress(60);
                }
                // If 4 checkboxes are true
                else if ((MondayChallengesCheckbox.isChecked() && MondayProgressBar.getProgress() == 60) || (MondayChallengesCheckbox.isChecked() == false && MondayProgressBar.getProgress() == 100)){
                    MondayProgressBar.setProgress(80);
                }
                // If all checkboxes are true
                else if (MondayChallengesCheckbox.isChecked() && MondayProgressBar.getProgress() == 80){
                    MondayProgressBar.setProgress(100);
                }
                // If all checkboxes are false
                else {
                    MondayProgressBar.setProgress(0);
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
                // Set Tuesday Contents' Visibility to Gone
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Tuesday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Tuesday Progress Bar Clickable Actions
        TuesdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Tuesday Contents' Visibility to Gone
                if (TuesdayAerobicCheckbox.getVisibility() == View.VISIBLE && TuesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayIntervalCheckbox.getVisibility() == View.VISIBLE && TuesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        TuesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Tuesday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
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
                // Set Wednesday Contents' Visibility to Gone
                if (WednesdayAerobicCheckbox.getVisibility() == View.VISIBLE && WednesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayIntervalCheckbox.getVisibility() == View.VISIBLE && WednesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Wednesday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Wednesday Progress Bar Clickable Actions
        WednesdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Wednesday Contents' Visibility to Gone
                if (WednesdayAerobicCheckbox.getVisibility() == View.VISIBLE && WednesdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayIntervalCheckbox.getVisibility() == View.VISIBLE && WednesdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        WednesdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Wednesday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
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
                // Set Thursday Contents' Visibility to Gone
                if (ThursdayAerobicCheckbox.getVisibility() == View.VISIBLE && ThursdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayIntervalCheckbox.getVisibility() == View.VISIBLE && ThursdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Thursday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Thursday Progress Bar Clickable Actions
        ThursdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Thursday Contents' Visibility to Gone
                if (ThursdayAerobicCheckbox.getVisibility() == View.VISIBLE && ThursdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayIntervalCheckbox.getVisibility() == View.VISIBLE && ThursdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        ThursdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Thursday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
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
                // Set Friday Contents' Visibility to Gone
                if (FridayAerobicCheckbox.getVisibility() == View.VISIBLE && FridayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        FridayIntervalCheckbox.getVisibility() == View.VISIBLE && FridayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        FridayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Friday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Friday Progress Bar Clickable Actions
        FridayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Friday Contents' Visibility to Gone
                if (FridayAerobicCheckbox.getVisibility() == View.VISIBLE && FridayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        FridayIntervalCheckbox.getVisibility() == View.VISIBLE && FridayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        FridayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Friday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
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
                // Set Saturday Contents' Visibility to Gone
                if (SaturdayAerobicCheckbox.getVisibility() == View.VISIBLE && SaturdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayIntervalCheckbox.getVisibility() == View.VISIBLE && SaturdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Saturday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Saturday Progress Bar Clickable Actions
        SaturdayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Saturday Contents' Visibility to Gone
                if (SaturdayAerobicCheckbox.getVisibility() == View.VISIBLE && SaturdayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayIntervalCheckbox.getVisibility() == View.VISIBLE && SaturdayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SaturdayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Saturday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
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
                // Set Sunday Contents' Visibility to Gone
                if (SundayAerobicCheckbox.getVisibility() == View.VISIBLE && SundayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SundayIntervalCheckbox.getVisibility() == View.VISIBLE && SundayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SundayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Sunday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });

        // Sunday Progress Bar Clickable Actions
        SundayProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Sunday Contents' Visibility to Gone
                if (SundayAerobicCheckbox.getVisibility() == View.VISIBLE && SundayCircuitCheckbox.getVisibility() == View.VISIBLE &&
                        SundayIntervalCheckbox.getVisibility() == View.VISIBLE && SundayFlexibilityCheckbox.getVisibility() == View.VISIBLE &&
                        SundayChallengesCheckbox.getVisibility() == View.VISIBLE) {
                    SetContentsToGone();
                }
                // Set Sunday Contents' Visibility to Visible
                else  {
                    SetContentsToVisible();
                }
            }
        });
    }

    // Set Weekly Contents' Visibility to Gone
    private void SetContentsToGone(){

        // Set Monday Content's Visibility to Gone
        if (MondayTextView.isPressed() || MondayProgressBar.isPressed()) {
            MondayAerobicCheckbox.setVisibility(View.GONE);
            MondayCircuitCheckbox.setVisibility(View.GONE);
            MondayIntervalCheckbox.setVisibility(View.GONE);
            MondayFlexibilityCheckbox.setVisibility(View.GONE);
            MondayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Tuesday Content's Visibility to Gone
        else if (TuesdayTextView.isPressed() || TuesdayProgressBar.isPressed()) {
            TuesdayAerobicCheckbox.setVisibility(View.GONE);
            TuesdayCircuitCheckbox.setVisibility(View.GONE);
            TuesdayIntervalCheckbox.setVisibility(View.GONE);
            TuesdayFlexibilityCheckbox.setVisibility(View.GONE);
            TuesdayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Wednesday Content's Visibility to Gone
        else if (WednesdayTextView.isPressed() || WednesdayProgressBar.isPressed()) {
            WednesdayAerobicCheckbox.setVisibility(View.GONE);
            WednesdayCircuitCheckbox.setVisibility(View.GONE);
            WednesdayIntervalCheckbox.setVisibility(View.GONE);
            WednesdayFlexibilityCheckbox.setVisibility(View.GONE);
            WednesdayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Thursday Content's Visibility to Gone
        else if (ThursdayTextView.isPressed() || ThursdayProgressBar.isPressed()) {
            ThursdayAerobicCheckbox.setVisibility(View.GONE);
            ThursdayCircuitCheckbox.setVisibility(View.GONE);
            ThursdayIntervalCheckbox.setVisibility(View.GONE);
            ThursdayFlexibilityCheckbox.setVisibility(View.GONE);
            ThursdayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Friday Content's Visibility to Gone
        else if (FridayTextView.isPressed() || FridayProgressBar.isPressed()) {
            FridayAerobicCheckbox.setVisibility(View.GONE);
            FridayCircuitCheckbox.setVisibility(View.GONE);
            FridayIntervalCheckbox.setVisibility(View.GONE);
            FridayFlexibilityCheckbox.setVisibility(View.GONE);
            FridayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Saturday Content's Visibility to Gone
        else if (SaturdayTextView.isPressed() || SaturdayProgressBar.isPressed()) {
            SaturdayAerobicCheckbox.setVisibility(View.GONE);
            SaturdayCircuitCheckbox.setVisibility(View.GONE);
            SaturdayIntervalCheckbox.setVisibility(View.GONE);
            SaturdayFlexibilityCheckbox.setVisibility(View.GONE);
            SaturdayChallengesCheckbox.setVisibility(View.GONE);
        }

        // Set Sunday Content's Visibility to Gone
        else {
            SundayAerobicCheckbox.setVisibility(View.GONE);
            SundayCircuitCheckbox.setVisibility(View.GONE);
            SundayIntervalCheckbox.setVisibility(View.GONE);
            SundayFlexibilityCheckbox.setVisibility(View.GONE);
            SundayChallengesCheckbox.setVisibility(View.GONE);
        }
    }

    // Set Weekly Contents' Visibility to Visible
    private void SetContentsToVisible(){

        // Set Monday Content's Visibility to Visible
        if (MondayTextView.isPressed() || MondayProgressBar.isPressed()) {
            MondayAerobicCheckbox.setVisibility(View.VISIBLE);
            MondayCircuitCheckbox.setVisibility(View.VISIBLE);
            MondayIntervalCheckbox.setVisibility(View.VISIBLE);
            MondayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            MondayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Tuesday Content's Visibility to Visible
        else if (TuesdayTextView.isPressed() || TuesdayProgressBar.isPressed()) {
            TuesdayAerobicCheckbox.setVisibility(View.VISIBLE);
            TuesdayCircuitCheckbox.setVisibility(View.VISIBLE);
            TuesdayIntervalCheckbox.setVisibility(View.VISIBLE);
            TuesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            TuesdayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Wednesday Content's Visibility to Visible
        else if (WednesdayTextView.isPressed() || WednesdayProgressBar.isPressed()) {
            WednesdayAerobicCheckbox.setVisibility(View.VISIBLE);
            WednesdayCircuitCheckbox.setVisibility(View.VISIBLE);
            WednesdayIntervalCheckbox.setVisibility(View.VISIBLE);
            WednesdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            WednesdayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Thursday Content's Visibility to Visible
        else if (ThursdayTextView.isPressed() || ThursdayProgressBar.isPressed()) {
            ThursdayAerobicCheckbox.setVisibility(View.VISIBLE);
            ThursdayCircuitCheckbox.setVisibility(View.VISIBLE);
            ThursdayIntervalCheckbox.setVisibility(View.VISIBLE);
            ThursdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            ThursdayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Friday Content's Visibility to Visible
        else if (FridayTextView.isPressed() || FridayProgressBar.isPressed()) {
            FridayAerobicCheckbox.setVisibility(View.VISIBLE);
            FridayCircuitCheckbox.setVisibility(View.VISIBLE);
            FridayIntervalCheckbox.setVisibility(View.VISIBLE);
            FridayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            FridayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Saturday Content's Visibility to Visible
        else if (SaturdayTextView.isPressed() || SaturdayProgressBar.isPressed()) {
            SaturdayAerobicCheckbox.setVisibility(View.VISIBLE);
            SaturdayCircuitCheckbox.setVisibility(View.VISIBLE);
            SaturdayIntervalCheckbox.setVisibility(View.VISIBLE);
            SaturdayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            SaturdayChallengesCheckbox.setVisibility(View.VISIBLE);
        }

        // Set Sunday Content's Visibility to Visible
        else {
            SundayAerobicCheckbox.setVisibility(View.VISIBLE);
            SundayCircuitCheckbox.setVisibility(View.VISIBLE);
            SundayIntervalCheckbox.setVisibility(View.VISIBLE);
            SundayFlexibilityCheckbox.setVisibility(View.VISIBLE);
            SundayChallengesCheckbox.setVisibility(View.VISIBLE);
        }
    }
}
