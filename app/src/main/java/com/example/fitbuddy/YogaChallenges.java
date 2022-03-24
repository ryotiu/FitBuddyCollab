package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class YogaChallenges extends AppCompatActivity {

    private Button Day1YogaChallengesBtn;
    private Button Day2YogaChallengesBtn;
    private Button Day3YogaChallengesBtn;
    private Button Day4YogaChallengesBtn;
    private Button Day5YogaChallengesBtn;
    private Button Day6YogaChallengesBtn;
    private Button Day7YogaChallengesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_challenges);

        Day1YogaChallengesBtn = findViewById(R.id.Day1YogaChallengesBtn);
        Day2YogaChallengesBtn = findViewById(R.id.Day2YogaChallengesBtn);
        Day3YogaChallengesBtn = findViewById(R.id.Day3YogaChallengesBtn);
        Day4YogaChallengesBtn = findViewById(R.id.Day4YogaChallengesBtn);
        Day5YogaChallengesBtn = findViewById(R.id.Day5YogaChallengesBtn);
        Day6YogaChallengesBtn = findViewById(R.id.Day6YogaChallengesBtn);
        Day7YogaChallengesBtn = findViewById(R.id.Day7YogaChallengesBtn);


        // Launch activity_weekly_tracker
        Day1YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day1Yoga.class));
            }
        });

        Day2YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day2Yoga.class));
            }
        });

        Day3YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day1Yoga.class));
            }
        });

        Day4YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day2Yoga.class));
            }
        });

        Day5YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day1Yoga.class));
            }
        });

        Day6YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day2Yoga.class));
            }
        });

        Day7YogaChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YogaChallenges.this, Day1Yoga.class));
            }
        });

    }
}