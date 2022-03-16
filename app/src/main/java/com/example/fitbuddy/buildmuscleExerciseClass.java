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

public class buildmuscleExerciseClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_exercise_class);

        Button back = findViewById(R.id.backBtn);
        TextView timer = findViewById(R.id.timer);
        Button Lunges = findViewById(R.id.LungesBtn);
        Button Squats = findViewById(R.id.SquatsBtn);
        Button Planks = findViewById(R.id.PlanksBtn);
        Button Tricepdip = findViewById(R.id.TricepdipBtn);
        Button Pushups = findViewById(R.id.PushupsBtn);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(buildmuscleExerciseClass.this, LoggedIn.class));
            }
        });

        Lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Squats.setEnabled(false);
                Planks.setEnabled(false);
                Tricepdip.setEnabled(false);
                Pushups.setEnabled(false);


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
                        Squats.setEnabled(true);
                        Planks.setEnabled(true);
                        Tricepdip.setEnabled(true);
                        Pushups.setEnabled(true);
                        Lunges.setEnabled(false);
                    }
                }.start();

            }
        });

        Squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Planks.setEnabled(false);
                Pushups.setEnabled(false);
                Tricepdip.setEnabled(false);
                Lunges.setEnabled(false);

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
                        Squats.setEnabled(false);
                        Pushups.setEnabled(true);
                        Planks.setEnabled(true);
                        Tricepdip.setEnabled(true);
                        Lunges.setEnabled(false);

                    }
                }.start();

            }
        });

        Planks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Tricepdip.setEnabled(false);
                Pushups.setEnabled(false);
                Lunges.setEnabled(false);
                Squats.setEnabled(false);

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
                        Lunges.setEnabled(false);
                        Squats.setEnabled(false);
                        Tricepdip.setEnabled(true);
                        Pushups.setEnabled(true);
                        Planks.setEnabled(false);
                    }
                }.start();

            }
        });

        Tricepdip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pushups.setEnabled(false);
                Planks.setEnabled(false);
                Lunges.setEnabled(false);
                Squats.setEnabled(false);

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
                        Squats.setEnabled(false);
                        Lunges.setEnabled(false);
                        Planks.setEnabled(false);
                        Pushups.setEnabled(true);
                        Tricepdip.setEnabled(false);
                    }
                }.start();

            }
        });

       Pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Squats.setEnabled(false);
                Lunges.setEnabled(false);
                Tricepdip.setEnabled(false);
                Planks.setEnabled(false);

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
                        Lunges.setEnabled(true);
                        Squats.setEnabled(true);
                        Planks.setEnabled(true);
                        Pushups.setEnabled(true);
                        Tricepdip.setEnabled(true);
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