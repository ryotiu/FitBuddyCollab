package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Tracker extends AppCompatActivity {

    Button backBtn;
    Button SaveTrackerBtn;
    Button ResetTrackerBtn;
    RadioButton Day1,Day2,Day3,Day4,Day5,Day6,Day7;
    FirebaseDatabase database;
    DatabaseReference reference;
    ChallengeTracker challengeTracker;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        reference = database.getInstance().getReference().child("Week");
        challengeTracker = new ChallengeTracker();

        backBtn = findViewById(R.id.backBtn);
        ResetTrackerBtn = findViewById(R.id.ResetTrackerBtn);
        SaveTrackerBtn = findViewById(R.id.SaveTrackerBtn);
        Day1 = findViewById(R.id.Day1);
        Day2 = findViewById(R.id.Day2);
        Day3 = findViewById(R.id.Day3);
        Day4 = findViewById(R.id.Day4);
        Day5 = findViewById(R.id.Day5);
        Day6 = findViewById(R.id.Day6);
        Day7 = findViewById(R.id.Day7);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    i = (int) snapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        String D1 = "Day1";
        String D2 = "Day2";
        String D3 = "Day3";
        String D4 = "Day4";
        String D5 = "Day5";
        String D6 = "Day6";
        String D7 = "Day7";

        SaveTrackerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Day1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day1 Challenge Completed! Great Job!", Toast.LENGTH_SHORT).show();
                challengeTracker.setDay1(D1);
                reference.child(String.valueOf(i)).setValue(challengeTracker);
                Day1.setEnabled(false);
                } else {
                    ///
                }
                if (Day2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day2 Challenge Completed! Way to Go!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay2(D2);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day2.setEnabled(false);

                } else {
                    ///
                }
                if (Day3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day3 Challenge Completed! Good Job!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay3(D3);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day3.setEnabled(false);
                } else {
                    ///
                }
                if (Day4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day4 Challenge Completed! Keep it Up!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay4(D4);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day4.setEnabled(false);
                } else {
                    ///
                }
                if (Day5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day5 Challenge Completed! Keep Going!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay5(D5);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day5.setEnabled(false);
                } else {
                    ///
                }
                if (Day6.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day6 Challenge Completed! Wow!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay6(D6);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day6.setEnabled(false);
                } else {
                    ///
                }
                if (Day7.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Day7 Challenge Completed! Excellent!", Toast.LENGTH_SHORT).show();
                    challengeTracker.setDay7(D7);
                    reference.child(String.valueOf(i)).setValue(challengeTracker);
                    Day7.setEnabled(false);
                } else {
                    ///
                }

            }


        });

        ResetTrackerBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(Day1.isChecked())
                        Day1.setChecked(false);
                        Day1.setEnabled(true);
                    if(Day2.isChecked())
                        Day2.setChecked(false);
                        Day2.setEnabled(true);
                    if(Day3.isChecked())
                        Day3.setChecked(false);
                        Day3.setEnabled(true);
                    if(Day4.isChecked())
                        Day4.setChecked(false);
                        Day4.setEnabled(true);
                    if(Day5.isChecked())
                        Day5.setChecked(false);
                        Day5.setEnabled(true);
                    if(Day6.isChecked())
                        Day6.setChecked(false);
                        Day6.setEnabled(true);
                    if(Day7.isChecked())
                        Day7.setChecked(false);
                        Day7.setEnabled(true);
                }
            });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tracker.this, LoggedIn.class));
            }
        });
        }
    }
