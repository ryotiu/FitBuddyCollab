package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WeeklyCardioChallenges extends AppCompatActivity {

    private Button Day1CardioChallengesBtn;
    private Button Day2CardioChallengesBtn;
    private Button Day3CardioChallengesBtn;
    private Button Day4CardioChallengesBtn;
    private Button Day5CardioChallengesBtn;
    private Button Day6CardioChallengesBtn;
    private Button Day7CardioChallengesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeklycardio_challenges);

        Day1CardioChallengesBtn = findViewById(R.id.Day1CardioChallengesBtn);
        Day2CardioChallengesBtn = findViewById(R.id.Day2CardioChallengesBtn);
        Day3CardioChallengesBtn = findViewById(R.id.Day3CardioChallengesBtn);
        Day4CardioChallengesBtn = findViewById(R.id.Day4CardioChallengesBtn);
        Day5CardioChallengesBtn = findViewById(R.id.Day5CardioChallengesBtn);
        Day6CardioChallengesBtn = findViewById(R.id.Day6CardioChallengesBtn);
        Day7CardioChallengesBtn = findViewById(R.id.Day7CardioChallengesBtn);


        // Launch activity_weekly_tracker
        Day1CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day1Cardio.class));
            }
        });

        Day2CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day2Cardio.class));
            }
        });

        Day3CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day3Cardio.class));
            }
        });

        Day4CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day4Cardio.class));
            }
        });

        Day5CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day5Cardio.class));
            }
        });

        Day6CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day6Cardio.class));
            }
        });

        Day7CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeeklyCardioChallenges.this, Day7Cardio.class));
            }
        });

    }
}