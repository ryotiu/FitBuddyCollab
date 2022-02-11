package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoggedIn extends AppCompatActivity {

    TextView FullName;
    Button ExerciseLibrary;
    Button ChallengesBtn;
    Button TrackersBtn;
    Button ChatBtn;
    Button LogoutBtn;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        FullName = findViewById(R.id.FullName);
        ExerciseLibrary = findViewById(R.id.ExerciseLibraryBtn);
        ChallengesBtn = findViewById(R.id.ChallengesBtn);
        TrackersBtn = findViewById(R.id.TrackersBtn);
        ChatBtn = findViewById(R.id.ChatBtn);
        LogoutBtn = findViewById(R.id.LogoutBtn);

        //Get Firebase Auth Instance
        firebaseAuth = FirebaseAuth.getInstance();

        //Get Shared Preference, Get User First and Last Name
        SharedPreferences sp = getApplication().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        String username = sp.getString("Username", "");
        FullName.setText(username);

        //Access Firebase Realtime Firebase to display Full Name
        displayFullName(username);

        //Choose Your Goals Activity
        ExerciseLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoggedIn.this, ChooseGoals.class));
            }
        });

        // Launch activity_challenges AndroidManifest.xml
        ChallengesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedIn.this, Challenges.class));
            }
        });

        // Launch activity_trackers
        TrackersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedIn.this, Trackers.class));
            }
        });

        //Launch Chat Function
        ChatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(LoggedIn.this, Chat.class));
            }
        });

        //Logout User and clear SharedPreference
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sign out from Firebase
                firebaseAuth.signOut();

                //Clear SharedPreference
                sp.edit().clear().apply();

                //Change Screen to Main Activity
                startActivity(new Intent(LoggedIn.this, MainActivity.class));
                finish();
            }
        });
    }

    //Display Full Name Method
    private void displayFullName(String username){
        Query getFullName = FirebaseDatabase.getInstance().getReference("Users").child(username);
        getFullName.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String firstName = snapshot.child("firstName").getValue(String.class);
                    String lastName = snapshot.child("lastName").getValue(String.class);
                    String fullName = firstName + " " + lastName;
                    FullName.setText(fullName);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(LoggedIn.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}