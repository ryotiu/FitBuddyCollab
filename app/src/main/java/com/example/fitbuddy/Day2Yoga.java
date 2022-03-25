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

public class Day2Yoga extends AppCompatActivity {

    private Button backtochallengesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2yoga);

        TextView timer = findViewById(R.id.Day2YogaChallengestimer);
        TextView Day2YogaChallengesHeader = findViewById(R.id.Day2YogaChallengesHeader);
        Button Day2Step1YogaChallengesBtn = findViewById(R.id.Day2Step1YogaChallengesBtn);
        Button Day2Step2YogaChallengesBtn = findViewById(R.id.Day2Step2YogaChallengesBtn);
        Button Day2Step3YogaChallengesBtn = findViewById(R.id.Day2Step3YogaChallengesBtn);
        Button Day2Step4YogaChallengesBtn = findViewById(R.id.Day2Step4YogaChallengesBtn);
        Button Day2Step5YogaChallengesBtn = findViewById(R.id.Day2Step5YogaChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day2Yoga.this, Challenges.class));
            }
        });

        Day2Step1YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2YogaChallengesBtn.setEnabled(false);
                Day2Step3YogaChallengesBtn.setEnabled(false);
                Day2Step4YogaChallengesBtn.setEnabled(false);
                Day2Step5YogaChallengesBtn.setEnabled(false);


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
                        Day2Step2YogaChallengesBtn.setEnabled(true);
                        Day2Step3YogaChallengesBtn.setEnabled(true);
                        Day2Step4YogaChallengesBtn.setEnabled(true);
                        Day2Step5YogaChallengesBtn.setEnabled(true);
                        Day2Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step2YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step3YogaChallengesBtn.setEnabled(false);
                Day2Step4YogaChallengesBtn.setEnabled(false);
                Day2Step5YogaChallengesBtn.setEnabled(false);
                Day2Step1YogaChallengesBtn.setEnabled(false);

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
                        Day2Step2YogaChallengesBtn.setEnabled(false);
                        Day2Step3YogaChallengesBtn.setEnabled(true);
                        Day2Step4YogaChallengesBtn.setEnabled(true);
                        Day2Step5YogaChallengesBtn.setEnabled(true);
                        Day2Step1YogaChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day2Step3YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2YogaChallengesBtn.setEnabled(false);
                Day2Step4YogaChallengesBtn.setEnabled(false);
                Day2Step5YogaChallengesBtn.setEnabled(false);
                Day2Step1YogaChallengesBtn.setEnabled(false);

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
                        Day2Step2YogaChallengesBtn.setEnabled(false);
                        Day2Step3YogaChallengesBtn.setEnabled(false);
                        Day2Step4YogaChallengesBtn.setEnabled(true);
                        Day2Step5YogaChallengesBtn.setEnabled(true);
                        Day2Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step4YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2YogaChallengesBtn.setEnabled(false);
                Day2Step3YogaChallengesBtn.setEnabled(false);
                Day2Step5YogaChallengesBtn.setEnabled(false);
                Day2Step1YogaChallengesBtn.setEnabled(false);

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
                        Day2Step2YogaChallengesBtn.setEnabled(false);
                        Day2Step3YogaChallengesBtn.setEnabled(false);
                        Day2Step4YogaChallengesBtn.setEnabled(false);
                        Day2Step5YogaChallengesBtn.setEnabled(true);
                        Day2Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day2Step5YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day2Step2YogaChallengesBtn.setEnabled(false);
                Day2Step3YogaChallengesBtn.setEnabled(false);
                Day2Step4YogaChallengesBtn.setEnabled(false);
                Day2Step1YogaChallengesBtn.setEnabled(false);

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
                        Day2Step2YogaChallengesBtn.setEnabled(true);
                        Day2Step3YogaChallengesBtn.setEnabled(true);
                        Day2Step4YogaChallengesBtn.setEnabled(true);
                        Day2Step5YogaChallengesBtn.setEnabled(true);
                        Day2Step1YogaChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}

