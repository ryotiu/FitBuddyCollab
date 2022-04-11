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

public class Day1Yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1yoga);

        TextView timer = findViewById(R.id.Day1YogaChallengesTimer);
        TextView Day1YogaChallengesHeader = findViewById(R.id.Day1YogaChallengesHeader);
        Button Day1Step1YogaChallengesBtn = findViewById(R.id.Day1Step1YogaChallengesBtn);
        Button Day1Step2YogaChallengesBtn = findViewById(R.id.Day1Step2YogaChallengesBtn);
        Button Day1Step3YogaChallengesBtn = findViewById(R.id.Day1Step3YogaChallengesBtn);
        Button Day1Step4YogaChallengesBtn = findViewById(R.id.Day1Step4YogaChallengesBtn);
        Button Day1Step5YogaChallengesBtn = findViewById(R.id.Day1Step5YogaChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day1Yoga.this, Challenges.class));
            }
        });

        Day1Step1YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2YogaChallengesBtn.setEnabled(false);
                Day1Step3YogaChallengesBtn.setEnabled(false);
                Day1Step4YogaChallengesBtn.setEnabled(false);
                Day1Step5YogaChallengesBtn.setEnabled(false);


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
                        Day1Step2YogaChallengesBtn.setEnabled(true);
                        Day1Step3YogaChallengesBtn.setEnabled(true);
                        Day1Step4YogaChallengesBtn.setEnabled(true);
                        Day1Step5YogaChallengesBtn.setEnabled(true);
                        Day1Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step2YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step3YogaChallengesBtn.setEnabled(false);
                Day1Step4YogaChallengesBtn.setEnabled(false);
                Day1Step5YogaChallengesBtn.setEnabled(false);
                Day1Step1YogaChallengesBtn.setEnabled(false);

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
                        Day1Step2YogaChallengesBtn.setEnabled(false);
                        Day1Step3YogaChallengesBtn.setEnabled(true);
                        Day1Step4YogaChallengesBtn.setEnabled(true);
                        Day1Step5YogaChallengesBtn.setEnabled(true);
                        Day1Step1YogaChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day1Step3YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2YogaChallengesBtn.setEnabled(false);
                Day1Step4YogaChallengesBtn.setEnabled(false);
                Day1Step5YogaChallengesBtn.setEnabled(false);
                Day1Step1YogaChallengesBtn.setEnabled(false);

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
                        Day1Step2YogaChallengesBtn.setEnabled(false);
                        Day1Step3YogaChallengesBtn.setEnabled(false);
                        Day1Step4YogaChallengesBtn.setEnabled(true);
                        Day1Step5YogaChallengesBtn.setEnabled(true);
                        Day1Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step4YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2YogaChallengesBtn.setEnabled(false);
                Day1Step3YogaChallengesBtn.setEnabled(false);
                Day1Step5YogaChallengesBtn.setEnabled(false);
                Day1Step1YogaChallengesBtn.setEnabled(false);

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
                        Day1Step2YogaChallengesBtn.setEnabled(false);
                        Day1Step3YogaChallengesBtn.setEnabled(false);
                        Day1Step4YogaChallengesBtn.setEnabled(false);
                        Day1Step5YogaChallengesBtn.setEnabled(true);
                        Day1Step1YogaChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step5YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2YogaChallengesBtn.setEnabled(false);
                Day1Step3YogaChallengesBtn.setEnabled(false);
                Day1Step4YogaChallengesBtn.setEnabled(false);
                Day1Step1YogaChallengesBtn.setEnabled(false);

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
                        Day1Step2YogaChallengesBtn.setEnabled(true);
                        Day1Step3YogaChallengesBtn.setEnabled(true);
                        Day1Step4YogaChallengesBtn.setEnabled(true);
                        Day1Step5YogaChallengesBtn.setEnabled(true);
                        Day1Step1YogaChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}
