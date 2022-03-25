package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Day2Muscle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2muscle);

        TextView timer = findViewById(R.id.Day2MuscleChallengestimer);
        TextView Day2MuscleChallengesHeader = findViewById(R.id.Day2MuscleChallengesHeader);
        Button Day2Step1MuscleChallengesBtn = findViewById(R.id.Day2Step1MuscleChallengesBtn);
        Button Day2Step2MuscleChallengesBtn = findViewById(R.id.Day2Step2MuscleChallengesBtn);
        Button Day2Step3MuscleChallengesBtn = findViewById(R.id.Day2Step3MuscleChallengesBtn);
        Button Day2Step4MuscleChallengesBtn = findViewById(R.id.Day2Step4MuscleChallengesBtn);
        Button Day2Step5MuscleChallengesBtn = findViewById(R.id.Day2Step5MuscleChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day2Muscle.this, Challenges.class));
            }
        });
        Day2Step1MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2MuscleChallengesBtn.setEnabled(false);
                Day2Step3MuscleChallengesBtn.setEnabled(false);
                Day2Step4MuscleChallengesBtn.setEnabled(false);
                Day2Step5MuscleChallengesBtn.setEnabled(false);


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
                        Day2Step2MuscleChallengesBtn.setEnabled(true);
                        Day2Step3MuscleChallengesBtn.setEnabled(true);
                        Day2Step4MuscleChallengesBtn.setEnabled(true);
                        Day2Step5MuscleChallengesBtn.setEnabled(true);
                        Day2Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step2MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step3MuscleChallengesBtn.setEnabled(false);
                Day2Step4MuscleChallengesBtn.setEnabled(false);
                Day2Step5MuscleChallengesBtn.setEnabled(false);
                Day2Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day2Step2MuscleChallengesBtn.setEnabled(false);
                        Day2Step3MuscleChallengesBtn.setEnabled(true);
                        Day2Step4MuscleChallengesBtn.setEnabled(true);
                        Day2Step5MuscleChallengesBtn.setEnabled(true);
                        Day2Step1MuscleChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day2Step3MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2MuscleChallengesBtn.setEnabled(false);
                Day2Step4MuscleChallengesBtn.setEnabled(false);
                Day2Step5MuscleChallengesBtn.setEnabled(false);
                Day2Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day2Step2MuscleChallengesBtn.setEnabled(false);
                        Day2Step3MuscleChallengesBtn.setEnabled(false);
                        Day2Step4MuscleChallengesBtn.setEnabled(true);
                        Day2Step5MuscleChallengesBtn.setEnabled(true);
                        Day2Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step4MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2MuscleChallengesBtn.setEnabled(false);
                Day2Step3MuscleChallengesBtn.setEnabled(false);
                Day2Step5MuscleChallengesBtn.setEnabled(false);
                Day2Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day2Step2MuscleChallengesBtn.setEnabled(false);
                        Day2Step3MuscleChallengesBtn.setEnabled(false);
                        Day2Step4MuscleChallengesBtn.setEnabled(false);
                        Day2Step5MuscleChallengesBtn.setEnabled(true);
                        Day2Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step5MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2MuscleChallengesBtn.setEnabled(false);
                Day2Step3MuscleChallengesBtn.setEnabled(false);
                Day2Step4MuscleChallengesBtn.setEnabled(false);
                Day2Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day2Step2MuscleChallengesBtn.setEnabled(true);
                        Day2Step3MuscleChallengesBtn.setEnabled(true);
                        Day2Step4MuscleChallengesBtn.setEnabled(true);
                        Day2Step5MuscleChallengesBtn.setEnabled(true);
                        Day2Step1MuscleChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}