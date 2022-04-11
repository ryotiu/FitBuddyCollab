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

public class loseweightExcerciseClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_exercise_class);

        Button back = findViewById(R.id.backBtn);
        TextView timer = findViewById(R.id.timer);
        Button tiptoeJacks = findViewById(R.id.tiptoeJacksBtn);
        Button Crunches = findViewById(R.id.CrunchesBtn);
        Button Skipping = findViewById(R.id.SkippingBtn);
        Button mountainClimbers = findViewById(R.id.mountainClimbersBtn);
        Button skaterJumps = findViewById(R.id.skaterJumpsBtn);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loseweightExcerciseClass.this, LoggedIn.class));
            }
        });

        tiptoeJacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Crunches.setEnabled(false);
                Skipping.setEnabled(false);
                mountainClimbers.setEnabled(false);
                skaterJumps.setEnabled(false);


                new CountDownTimer(10000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 10000) % 10;
                        long sec = (millisUntilFinished / 1000) % 10;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Crunches.setEnabled(true);
                        Skipping.setEnabled(true);
                        mountainClimbers.setEnabled(true);
                        skaterJumps.setEnabled(true);
                        tiptoeJacks.setEnabled(false);
                    }
                }.start();

            }
        });

        Crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Skipping.setEnabled(false);
                skaterJumps.setEnabled(false);
                mountainClimbers.setEnabled(false);
                tiptoeJacks.setEnabled(false);

                new CountDownTimer(10000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 10000) % 10;
                        long sec = (millisUntilFinished / 1000) % 10;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Crunches.setEnabled(false);
                        skaterJumps.setEnabled(true);
                        Skipping.setEnabled(true);
                        mountainClimbers.setEnabled(true);
                        tiptoeJacks.setEnabled(false);

                    }
                }.start();

            }
        });

        Skipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mountainClimbers.setEnabled(false);
                skaterJumps.setEnabled(false);
                tiptoeJacks.setEnabled(false);
                Crunches.setEnabled(false);

                new CountDownTimer(10000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 10000) % 10;
                        long sec = (millisUntilFinished / 1000) % 10;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        tiptoeJacks.setEnabled(false);
                        Crunches.setEnabled(false);
                        mountainClimbers.setEnabled(true);
                        skaterJumps.setEnabled(true);
                        Skipping.setEnabled(false);
                    }
                }.start();

            }
        });

        mountainClimbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                skaterJumps.setEnabled(false);
                Skipping.setEnabled(false);
                tiptoeJacks.setEnabled(false);
                Crunches.setEnabled(false);

                new CountDownTimer(10000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 10000) % 10;
                        long sec = (millisUntilFinished / 1000) % 10;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        Crunches.setEnabled(false);
                        tiptoeJacks.setEnabled(false);
                        Skipping.setEnabled(false);
                        skaterJumps.setEnabled(true);
                        mountainClimbers.setEnabled(false);
                    }
                }.start();

            }
        });

       skaterJumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Crunches.setEnabled(false);
                tiptoeJacks.setEnabled(false);
                mountainClimbers.setEnabled(false);
                Skipping.setEnabled(false);

                new CountDownTimer(10000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 10000) % 10;
                        long sec = (millisUntilFinished / 1000) % 10;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                        tiptoeJacks.setEnabled(true);
                        Crunches.setEnabled(true);
                        Skipping.setEnabled(true);
                        skaterJumps.setEnabled(true);
                        mountainClimbers.setEnabled(true);
                    }
                }.start();

            }
        });




        /*start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(90000, 1000) {

                    NumberFormat f = new DecimalFormat("00");

                    public void onTick(long millisUntilFinished) {
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        timer.setText(f.format(min) + ":" + f.format(sec));

                        // timer.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish() {
                        timer.setText("Done!");
                    }
                }.start();
            }
        });*/

    }
}