package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MeditationChallenges extends AppCompatActivity {

    Button WeeklyMeditationChallengesBtn;
    Button MonthlyMeditationChallengesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_challenges);

        WeeklyMeditationChallengesBtn = findViewById(R.id.WeeklyMeditationChallengesBtn);
        MonthlyMeditationChallengesBtn = findViewById(R.id.MonthlyMeditationChallengesBtn);

        // Launch activity_weekly_tracker
        WeeklyMeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, WeeklyMeditationChallenges.class));
            }
        });

        // Launch activity_monthly_tracker
        MonthlyMeditationChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeditationChallenges.this, MonthlyMeditationChallenges.class));
            }
        });
    }
}