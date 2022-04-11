package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CardioChallenges extends AppCompatActivity {

    private Button Day1CardioChallengesBtn;
    private Button Day2CardioChallengesBtn;
    private Button Day3CardioChallengesBtn;
    private Button Day4CardioChallengesBtn;
    private Button Day5CardioChallengesBtn;
    private Button Day6CardioChallengesBtn;
    private Button Day7CardioChallengesBtn;
    private TextView CardioChallengesHeader;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_challenges);

        Day1CardioChallengesBtn = findViewById(R.id.Day1CardioChallengesBtn);
        Day2CardioChallengesBtn = findViewById(R.id.Day2CardioChallengesBtn);
        Day3CardioChallengesBtn = findViewById(R.id.Day3CardioChallengesBtn);
        Day4CardioChallengesBtn = findViewById(R.id.Day4CardioChallengesBtn);
        Day5CardioChallengesBtn = findViewById(R.id.Day5CardioChallengesBtn);
        Day6CardioChallengesBtn = findViewById(R.id.Day6CardioChallengesBtn);
        Day7CardioChallengesBtn = findViewById(R.id.Day7CardioChallengesBtn);
        CardioChallengesHeader = findViewById(R.id.CardioChallengesHeader);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardioChallenges.this, Challenges.class));
            }
        });


        // Launch activity_weekly_tracker
        Day1CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day1Cardio.class));
            }
        });

        Day2CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day2Cardio.class));
            }
        });

        Day3CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day1Cardio.class));
            }
        });

        Day4CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day2Cardio.class));
            }
        });

        Day5CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day1Cardio.class));
            }
        });

        Day6CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day2Cardio.class));
            }
        });

        Day7CardioChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardioChallenges.this, Day1Cardio.class));
            }
        });

    }
}