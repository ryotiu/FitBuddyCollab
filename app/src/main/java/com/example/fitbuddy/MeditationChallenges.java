package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MeditationChallenges extends AppCompatActivity {

    private Button Day1MeditationChallengesBtn;
    private Button Day2MeditationChallengesBtn;
    private Button Day3MeditationChallengesBtn;
    private Button Day4MeditationChallengesBtn;
    private Button Day5MeditationChallengesBtn;
    private Button Day6MeditationChallengesBtn;
    private Button Day7MeditationChallengesBtn;
    private Button backBtn;
    private TextView MeditationChallengesHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_challenges);

        Day1MeditationChallengesBtn = findViewById(R.id.Day1MeditationChallengesBtn);
        Day2MeditationChallengesBtn = findViewById(R.id.Day2MeditationChallengesBtn);
        Day3MeditationChallengesBtn = findViewById(R.id.Day3MeditationChallengesBtn);
        Day4MeditationChallengesBtn = findViewById(R.id.Day4MeditationChallengesBtn);
        Day5MeditationChallengesBtn = findViewById(R.id.Day5MeditationChallengesBtn);
        Day6MeditationChallengesBtn = findViewById(R.id.Day6MeditationChallengesBtn);
        Day7MeditationChallengesBtn = findViewById(R.id.Day7MeditationChallengesBtn);
        MeditationChallengesHeader = findViewById(R.id.MeditationChallengesHeader);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeditationChallenges.this, Challenges.class));
            }
        });

        // Launch activity_weekly_tracker
        Day1MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day2MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day3MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day4MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day5MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day6MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

        Day7MeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, Day1Meditation.class));
            }
        });

    }
}