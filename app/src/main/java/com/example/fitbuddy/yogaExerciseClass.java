package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class yogaExerciseClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_exercise_class);

        Button back = findViewById(R.id.backBtn);
        TextView timer = findViewById(R.id.timer);
        Button cresentPose = findViewById(R.id.cresentPoseBtn);
        Button warriorPose = findViewById(R.id.warriorPoseBtn);
        Button bigtoePose = findViewById(R.id.bigtoePoseBtn);
        Button wheelPose = findViewById(R.id.wheelPoseBtn);
        Button bowPose = findViewById(R.id.bowPoseBtn);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(yogaExerciseClass.this, LoggedIn.class));
            }
        });

        cresentPose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                warriorPose.setEnabled(false);
                bigtoePose.setEnabled(false);
                wheelPose.setEnabled(false);
                bowPose.setEnabled(false);


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
                        warriorPose.setEnabled(true);
                        bigtoePose.setEnabled(true);
                        wheelPose.setEnabled(true);
                        bowPose.setEnabled(true);
                        cresentPose.setEnabled(false);
                    }
                }.start();

            }
        });

        warriorPose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bigtoePose.setEnabled(false);
                wheelPose.setEnabled(false);
                bowPose.setEnabled(false);
                cresentPose.setEnabled(false);

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
                        warriorPose.setEnabled(false);
                        bigtoePose.setEnabled(true);
                        wheelPose.setEnabled(true);
                        bowPose.setEnabled(true);
                        cresentPose.setEnabled(false);

                    }
                }.start();

            }
        });

        bigtoePose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                warriorPose.setEnabled(false);
                wheelPose.setEnabled(false);
                bowPose.setEnabled(false);
                cresentPose.setEnabled(false);

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
                        warriorPose.setEnabled(false);
                        bigtoePose.setEnabled(false);
                        wheelPose.setEnabled(true);
                        bowPose.setEnabled(true);
                        cresentPose.setEnabled(false);
                    }
                }.start();

            }
        });

        wheelPose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                warriorPose.setEnabled(false);
                bigtoePose.setEnabled(false);
                bowPose.setEnabled(false);
                cresentPose.setEnabled(false);

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
                        warriorPose.setEnabled(false);
                        bigtoePose.setEnabled(false);
                        wheelPose.setEnabled(false);
                        bowPose.setEnabled(true);
                        cresentPose.setEnabled(false);
                    }
                }.start();

            }
        });

        bowPose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                warriorPose.setEnabled(false);
                bigtoePose.setEnabled(false);
                wheelPose.setEnabled(false);
                cresentPose.setEnabled(false);

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
                        warriorPose.setEnabled(true);
                        bigtoePose.setEnabled(true);
                        wheelPose.setEnabled(true);
                        bowPose.setEnabled(true);
                        cresentPose.setEnabled(true);
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