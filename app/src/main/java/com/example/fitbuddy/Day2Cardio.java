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

public class Day2Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2cardio);

        TextView timer = findViewById(R.id.Day2CardioChallengesTimer);
        TextView Day1MuscleChallengesHeader = findViewById(R.id.Day1MuscleChallengesHeader);
        Button Day2Step1CardioChallengesBtn = findViewById(R.id.Day2Step1CardioChallengesBtn);
        Button Day2Step2CardioChallengesBtn = findViewById(R.id.Day2Step2CardioChallengesBtn);
        Button Day2Step3CardioChallengesBtn = findViewById(R.id.Day2Step3CardioChallengesBtn);
        Button Day2Step4CardioChallengesBtn = findViewById(R.id.Day2Step4CardioChallengesBtn);
        Button Day2Step5CardioChallengesBtn = findViewById(R.id.Day2Step5CardioChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day2Cardio.this, Challenges.class));
            }
        });

        Day2Step1CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2CardioChallengesBtn.setEnabled(false);
                Day2Step3CardioChallengesBtn.setEnabled(false);
                Day2Step4CardioChallengesBtn.setEnabled(false);
                Day2Step5CardioChallengesBtn.setEnabled(false);


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
                        Day2Step2CardioChallengesBtn.setEnabled(true);
                        Day2Step3CardioChallengesBtn.setEnabled(true);
                        Day2Step4CardioChallengesBtn.setEnabled(true);
                        Day2Step5CardioChallengesBtn.setEnabled(true);
                        Day2Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step2CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step3CardioChallengesBtn.setEnabled(false);
                Day2Step4CardioChallengesBtn.setEnabled(false);
                Day2Step5CardioChallengesBtn.setEnabled(false);
                Day2Step1CardioChallengesBtn.setEnabled(false);

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
                        Day2Step2CardioChallengesBtn.setEnabled(false);
                        Day2Step3CardioChallengesBtn.setEnabled(true);
                        Day2Step4CardioChallengesBtn.setEnabled(true);
                        Day2Step5CardioChallengesBtn.setEnabled(true);
                        Day2Step1CardioChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day2Step3CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2CardioChallengesBtn.setEnabled(false);
                Day2Step4CardioChallengesBtn.setEnabled(false);
                Day2Step5CardioChallengesBtn.setEnabled(false);
                Day2Step1CardioChallengesBtn.setEnabled(false);

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
                        Day2Step2CardioChallengesBtn.setEnabled(false);
                        Day2Step3CardioChallengesBtn.setEnabled(false);
                        Day2Step4CardioChallengesBtn.setEnabled(true);
                        Day2Step5CardioChallengesBtn.setEnabled(true);
                        Day2Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step4CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2CardioChallengesBtn.setEnabled(false);
                Day2Step3CardioChallengesBtn.setEnabled(false);
                Day2Step5CardioChallengesBtn.setEnabled(false);
                Day2Step1CardioChallengesBtn.setEnabled(false);

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
                        Day2Step2CardioChallengesBtn.setEnabled(false);
                        Day2Step3CardioChallengesBtn.setEnabled(false);
                        Day2Step4CardioChallengesBtn.setEnabled(false);
                        Day2Step5CardioChallengesBtn.setEnabled(true);
                        Day2Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step5CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2CardioChallengesBtn.setEnabled(false);
                Day2Step3CardioChallengesBtn.setEnabled(false);
                Day2Step4CardioChallengesBtn.setEnabled(false);
                Day2Step1CardioChallengesBtn.setEnabled(false);

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
                        Day2Step2CardioChallengesBtn.setEnabled(true);
                        Day2Step3CardioChallengesBtn.setEnabled(true);
                        Day2Step4CardioChallengesBtn.setEnabled(true);
                        Day2Step5CardioChallengesBtn.setEnabled(true);
                        Day2Step1CardioChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}
