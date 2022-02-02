package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class LoggedIn extends AppCompatActivity {

    private Button TrackersBtn;
    private Button LogoutBtn;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        TrackersBtn = findViewById(R.id.TrackersBtn);
        LogoutBtn = findViewById(R.id.LogoutBtn);

        firebaseAuth = FirebaseAuth.getInstance();

        // Launch activity_trackers
        TrackersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedIn.this, Trackers.class));
                finish();
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                startActivity(new Intent(LoggedIn.this, MainActivity.class));
                finish();
            }
        });

    }

}