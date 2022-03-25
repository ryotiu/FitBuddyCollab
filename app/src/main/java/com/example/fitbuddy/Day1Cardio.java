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

public class Day1Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1cardio);

        TextView timer = findViewById(R.id.Day1CardioChallengesTimer);
        TextView Day1CardioChallengesHeader = findViewById(R.id.Day1CardioChallengesTimer);
        Button Day1Step1CardioChallengesBtn = findViewById(R.id.Day1Step1CardioChallengesBtn);
        Button Day1Step2CardioChallengesBtn = findViewById(R.id.Day1Step2CardioChallengesBtn);
        Button Day1Step3CardioChallengesBtn = findViewById(R.id.Day1Step3CardioChallengesBtn);
        Button Day1Step4CardioChallengesBtn = findViewById(R.id.Day1Step4CardioChallengesBtn);
        Button Day1Step5CardioChallengesBtn = findViewById(R.id.Day1Step5CardioChallengesBtn);
        Button backtochallengesBtn = findViewById(R.id.backtochallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        backtochallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Day1Cardio.this, Challenges.class));
            }
        });

        Day1Step1CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2CardioChallengesBtn.setEnabled(false);
                Day1Step3CardioChallengesBtn.setEnabled(false);
                Day1Step4CardioChallengesBtn.setEnabled(false);
                Day1Step5CardioChallengesBtn.setEnabled(false);


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
                        Day1Step2CardioChallengesBtn.setEnabled(true);
                        Day1Step3CardioChallengesBtn.setEnabled(true);
                        Day1Step4CardioChallengesBtn.setEnabled(true);
                        Day1Step5CardioChallengesBtn.setEnabled(true);
                        Day1Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step2CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step3CardioChallengesBtn.setEnabled(false);
                Day1Step4CardioChallengesBtn.setEnabled(false);
                Day1Step5CardioChallengesBtn.setEnabled(false);
                Day1Step1CardioChallengesBtn.setEnabled(false);

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
                        Day1Step2CardioChallengesBtn.setEnabled(false);
                        Day1Step3CardioChallengesBtn.setEnabled(true);
                        Day1Step4CardioChallengesBtn.setEnabled(true);
                        Day1Step5CardioChallengesBtn.setEnabled(true);
                        Day1Step1CardioChallengesBtn.setEnabled(false);

                    }
                }.start();

            }
        });

        Day1Step3CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2CardioChallengesBtn.setEnabled(false);
                Day1Step4CardioChallengesBtn.setEnabled(false);
                Day1Step5CardioChallengesBtn.setEnabled(false);
                Day1Step1CardioChallengesBtn.setEnabled(false);

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
                        Day1Step2CardioChallengesBtn.setEnabled(false);
                        Day1Step3CardioChallengesBtn.setEnabled(false);
                        Day1Step4CardioChallengesBtn.setEnabled(true);
                        Day1Step5CardioChallengesBtn.setEnabled(true);
                        Day1Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step4CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2CardioChallengesBtn.setEnabled(false);
                Day1Step3CardioChallengesBtn.setEnabled(false);
                Day1Step5CardioChallengesBtn.setEnabled(false);
                Day1Step1CardioChallengesBtn.setEnabled(false);

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
                        Day1Step2CardioChallengesBtn.setEnabled(false);
                        Day1Step3CardioChallengesBtn.setEnabled(false);
                        Day1Step4CardioChallengesBtn.setEnabled(false);
                        Day1Step5CardioChallengesBtn.setEnabled(true);
                        Day1Step1CardioChallengesBtn.setEnabled(false);
                    }
                }.start();

            }
        });

        Day1Step5CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Day1Step2CardioChallengesBtn.setEnabled(false);
                Day1Step3CardioChallengesBtn.setEnabled(false);
                Day1Step4CardioChallengesBtn.setEnabled(false);
                Day1Step1CardioChallengesBtn.setEnabled(false);

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
                        Day1Step2CardioChallengesBtn.setEnabled(true);
                        Day1Step3CardioChallengesBtn.setEnabled(true);
                        Day1Step4CardioChallengesBtn.setEnabled(true);
                        Day1Step5CardioChallengesBtn.setEnabled(true);
                        Day1Step1CardioChallengesBtn.setEnabled(true);
                    }
                }.start();

            }
        });
    }
}
