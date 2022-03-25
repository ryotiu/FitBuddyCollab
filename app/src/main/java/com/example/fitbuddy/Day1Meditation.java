package com.example.fitbuddy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Day1Meditation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1meditation);

        TextView timer = findViewById(R.id.Day1CardioChallengesTimer);
        TextView Day1CardioChallengesHeader = findViewById(R.id.Day1CardioChallengesTimer);
        Button Day1Step1MeditationChallengesBtn = findViewById(R.id.Day1Step1MeditationChallengesBtn);
        Button Day1Step2MeditationChallengesBtn = findViewById(R.id.Day1Step2MeditationChallengesBtn);
        Button Day1Step3MeditationChallengesBtn = findViewById(R.id.Day1Step3MeditationChallengesBtn);
        Button Day1Step4MeditationChallengesBtn = findViewById(R.id.Day1Step4MeditationChallengesBtn);
        Button Day1Step5MeditationChallengesBtn = findViewById(R.id.Day1Step5MeditationChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day1Meditation.this, Challenges.class));
            }
        });

        Day1Step1MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MeditationChallengesBtn.setEnabled(false);
                Day1Step3MeditationChallengesBtn.setEnabled(false);
                Day1Step4MeditationChallengesBtn.setEnabled(false);
                Day1Step5MeditationChallengesBtn.setEnabled(false);


                new CountDownTimer(60000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Day1Step2MeditationChallengesBtn.setEnabled(true);
                        Day1Step3MeditationChallengesBtn.setEnabled(true);
                        Day1Step4MeditationChallengesBtn.setEnabled(true);
                        Day1Step5MeditationChallengesBtn.setEnabled(true);
                        Day1Step1MeditationChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step2MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step3MeditationChallengesBtn.setEnabled(false);
                Day1Step4MeditationChallengesBtn.setEnabled(false);
                Day1Step5MeditationChallengesBtn.setEnabled(false);
                Day1Step1MeditationChallengesBtn.setEnabled(false);

                new CountDownTimer(60000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Day1Step2MeditationChallengesBtn.setEnabled(false);
                        Day1Step3MeditationChallengesBtn.setEnabled(true);
                        Day1Step4MeditationChallengesBtn.setEnabled(true);
                        Day1Step5MeditationChallengesBtn.setEnabled(true);
                        Day1Step1MeditationChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day1Step3MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MeditationChallengesBtn.setEnabled(false);
                Day1Step4MeditationChallengesBtn.setEnabled(false);
                Day1Step5MeditationChallengesBtn.setEnabled(false);
                Day1Step1MeditationChallengesBtn.setEnabled(false);

                new CountDownTimer(60000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Day1Step2MeditationChallengesBtn.setEnabled(false);
                        Day1Step3MeditationChallengesBtn.setEnabled(false);
                        Day1Step4MeditationChallengesBtn.setEnabled(true);
                        Day1Step5MeditationChallengesBtn.setEnabled(true);
                        Day1Step1MeditationChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step4MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MeditationChallengesBtn.setEnabled(false);
                Day1Step3MeditationChallengesBtn.setEnabled(false);
                Day1Step5MeditationChallengesBtn.setEnabled(false);
                Day1Step1MeditationChallengesBtn.setEnabled(false);

                new CountDownTimer(60000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Day1Step2MeditationChallengesBtn.setEnabled(false);
                        Day1Step3MeditationChallengesBtn.setEnabled(false);
                        Day1Step4MeditationChallengesBtn.setEnabled(false);
                        Day1Step5MeditationChallengesBtn.setEnabled(true);
                        Day1Step1MeditationChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step5MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MeditationChallengesBtn.setEnabled(false);
                Day1Step3MeditationChallengesBtn.setEnabled(false);
                Day1Step4MeditationChallengesBtn.setEnabled(false);
                Day1Step1MeditationChallengesBtn.setEnabled(false);

                new CountDownTimer(60000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");

                        Day1Step2MeditationChallengesBtn.setEnabled(true);
                        Day1Step3MeditationChallengesBtn.setEnabled(true);
                        Day1Step4MeditationChallengesBtn.setEnabled(true);
                        Day1Step5MeditationChallengesBtn.setEnabled(true);
                        Day1Step1MeditationChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}

