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

public class Day1Muscle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1muscle);


        TextView timer = findViewById(R.id.Day1MuscleChallengesTimer);
        TextView Day1MuscleChallengesHeader = findViewById(R.id.Day1MuscleChallengesHeader);
        Button Day1Step1MuscleChallengesBtn = findViewById(R.id.Day1Step1MuscleChallengesBtn);
        Button Day1Step2MuscleChallengesBtn = findViewById(R.id.Day1Step2MuscleChallengesBtn);
        Button Day1Step3MuscleChallengesBtn = findViewById(R.id.Day1Step3MuscleChallengesBtn);
        Button Day1Step4MuscleChallengesBtn = findViewById(R.id.Day1Step4MuscleChallengesBtn);
        Button Day1Step5MuscleChallengesBtn = findViewById(R.id.Day1Step5MuscleChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);
        
        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day1Muscle.this, Challenges.class));
            }
        });

        Day1Step1MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MuscleChallengesBtn.setEnabled(false);
                Day1Step3MuscleChallengesBtn.setEnabled(false);
                Day1Step4MuscleChallengesBtn.setEnabled(false);
                Day1Step5MuscleChallengesBtn.setEnabled(false);


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
                        Day1Step2MuscleChallengesBtn.setEnabled(true);
                        Day1Step3MuscleChallengesBtn.setEnabled(true);
                        Day1Step4MuscleChallengesBtn.setEnabled(true);
                        Day1Step5MuscleChallengesBtn.setEnabled(true);
                        Day1Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step2MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step3MuscleChallengesBtn.setEnabled(false);
                Day1Step4MuscleChallengesBtn.setEnabled(false);
                Day1Step5MuscleChallengesBtn.setEnabled(false);
                Day1Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day1Step2MuscleChallengesBtn.setEnabled(false);
                        Day1Step3MuscleChallengesBtn.setEnabled(true);
                        Day1Step4MuscleChallengesBtn.setEnabled(true);
                        Day1Step5MuscleChallengesBtn.setEnabled(true);
                        Day1Step1MuscleChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day1Step3MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MuscleChallengesBtn.setEnabled(false);
                Day1Step4MuscleChallengesBtn.setEnabled(false);
                Day1Step5MuscleChallengesBtn.setEnabled(false);
                Day1Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day1Step2MuscleChallengesBtn.setEnabled(false);
                        Day1Step3MuscleChallengesBtn.setEnabled(false);
                        Day1Step4MuscleChallengesBtn.setEnabled(true);
                        Day1Step5MuscleChallengesBtn.setEnabled(true);
                        Day1Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step4MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MuscleChallengesBtn.setEnabled(false);
                Day1Step3MuscleChallengesBtn.setEnabled(false);
                Day1Step5MuscleChallengesBtn.setEnabled(false);
                Day1Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day1Step2MuscleChallengesBtn.setEnabled(false);
                        Day1Step3MuscleChallengesBtn.setEnabled(false);
                        Day1Step4MuscleChallengesBtn.setEnabled(false);
                        Day1Step5MuscleChallengesBtn.setEnabled(true);
                        Day1Step1MuscleChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step5MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2MuscleChallengesBtn.setEnabled(false);
                Day1Step3MuscleChallengesBtn.setEnabled(false);
                Day1Step4MuscleChallengesBtn.setEnabled(false);
                Day1Step1MuscleChallengesBtn.setEnabled(false);

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
                        Day1Step2MuscleChallengesBtn.setEnabled(true);
                        Day1Step3MuscleChallengesBtn.setEnabled(true);
                        Day1Step4MuscleChallengesBtn.setEnabled(true);
                        Day1Step5MuscleChallengesBtn.setEnabled(true);
                        Day1Step1MuscleChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}
