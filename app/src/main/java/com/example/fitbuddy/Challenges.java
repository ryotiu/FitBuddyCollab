package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Challenges extends AppCompatActivity {

    private Button WeeklyChallengesBtn;
    private Button MonthlyChallengesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        WeeklyChallengesBtn = findViewById(R.id.WeeklyChallengesBtn);
        MonthlyChallengesBtn = findViewById(R.id.MonthlyChallengesBtn);

        // Launch activity_challenges AndroidManifest.xml
        WeeklyChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, WeeklyChallenges.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        MonthlyChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Challenges.this, MonthlyChallenges.class));
            }
        });

    }
}
