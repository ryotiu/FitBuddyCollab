package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Challenges extends AppCompatActivity {

     TextView challengesHeader;
     ImageButton yogaBtn;
     ImageButton meditationBtn;
     ImageButton cardioBtn;
     ImageButton musclesBtn;
     Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

      challengesHeader = findViewById(R.id.challengesHeader);
        yogaBtn = findViewById(R.id.yogaBtn);
        meditationBtn = findViewById(R.id.meditationBtn);
        cardioBtn = findViewById(R.id.cardioBtn);
        musclesBtn = findViewById(R.id.musclesBtn);
        backBtn = findViewById(R.id.backBtn);

        // Launch activity_challenges AndroidManifest.xml
        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, YogaChallenges.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        meditationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, MeditationChallenges.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, CardioChallenges.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        musclesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, MusclesChallenges.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, LoggedIn.class));
            }
        });
    }
}
