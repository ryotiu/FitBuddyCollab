package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class LoggedIn extends AppCompatActivity {

    private TextView Username;
    private Button TrackersBtn;
    private Button ChallengesBtn;
    private Button LogoutBtn;
    private Button ExerciseLibrary;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        TrackersBtn = findViewById(R.id.TrackersBtn);
        ChallengesBtn = findViewById(R.id.ChallengesBtn);
        LogoutBtn = findViewById(R.id.LogoutBtn);
        ExerciseLibrary = findViewById(R.id.ExerciseLibraryBtn);
        Username = findViewById(R.id.UserName);

        firebaseAuth = FirebaseAuth.getInstance();

        //Code for Welcoming Verified User Incomplete
        /*
        //Display Username
        Username.setText("Anne Marie");
        */

        // Launch activity_trackers
        TrackersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedIn.this, Trackers.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        ChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedIn.this, Challenges.class));
            }
        });

        //Logout Button
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                startActivity(new Intent(LoggedIn.this, MainActivity.class));
                finish();
            }
        });

        //choose your goals activity
        ExerciseLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoggedIn.this, ChooseGoals.class));
            }
        });
    }

}