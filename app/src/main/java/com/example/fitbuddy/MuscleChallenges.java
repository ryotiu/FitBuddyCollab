package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MuscleChallenges extends AppCompatActivity {

    private Button Day1MuscleChallengesBtn;
    private Button Day2MuscleChallengesBtn;
    private Button Day3MuscleChallengesBtn;
    private Button Day4MuscleChallengesBtn;
    private Button Day5MuscleChallengesBtn;
    private Button Day6MuscleChallengesBtn;
    private Button Day7MuscleChallengesBtn;
    private TextView MuscleChallengesHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles_challenges);

        Day1MuscleChallengesBtn = findViewById(R.id.Day1MuscleChallengesBtn);
        Day2MuscleChallengesBtn = findViewById(R.id.Day2MuscleChallengesBtn);
        Day3MuscleChallengesBtn = findViewById(R.id.Day3MuscleChallengesBtn);
        Day4MuscleChallengesBtn = findViewById(R.id.Day4MuscleChallengesBtn);
        Day5MuscleChallengesBtn = findViewById(R.id.Day5MuscleChallengesBtn);
        Day6MuscleChallengesBtn = findViewById(R.id.Day6MuscleChallengesBtn);
        Day7MuscleChallengesBtn = findViewById(R.id.Day7MuscleChallengesBtn);
        MuscleChallengesHeader = findViewById(R.id.MuscleChallengesHeader);

        // Launch activity_weekly_tracker
        Day1MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day1Muscle.class));
            }
        });

        Day2MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day2Muscle.class));
            }
        });

        Day3MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day1Muscle.class));
            }
        });

        Day4MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day2Muscle.class));
            }
        });

        Day5MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day1Muscle.class));
            }
        });

        Day6MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day2Muscle.class));
            }
        });

        Day7MuscleChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleChallenges.this, Day1Muscle.class));
            }
        });

    }
}