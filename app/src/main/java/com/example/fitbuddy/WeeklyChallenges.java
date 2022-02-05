package com.example.fitbuddy;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class WeeklyChallenges extends AppCompatActivity {

    private RecyclerView challengesRV;
    private ArrayList<ChallengesModel> challengesModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_challenges);
        challengesRV = findViewById(R.id.idChallengesRV);

        // here we have created new array list and added data to it.
        challengesModelArrayList = new ArrayList<>();

        // Connect to firebase
        // get the challenges array
        // filter out the "weekly" entries by "durationType"
        // Show cards for each entry

        // Get a reference to our posts
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Challenges");

        // Attach a listener to read the data at our challenges reference
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ChallengesModel challenge = dataSnapshot.getValue(ChallengesModel.class);
                System.out.println(challenge);


                // we are initializing our adapter class and passing our arraylist to it.
                ChallengesAdapter courseAdapter = new ChallengesAdapter(WeeklyChallenges.this, challengesModelArrayList);

                // below line is for setting a layout manager for our recycler view.
                // here we are creating vertical list so we will provide orientation as vertical
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WeeklyChallenges.this, LinearLayoutManager.VERTICAL, false);

                // in below two lines we are setting layoutmanager and adapter to our recycler view.
                challengesRV.setLayoutManager(linearLayoutManager);
                challengesRV.setAdapter(courseAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });

        ref.addChildEventListener(new ChildEventListener() {

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }

            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                ChallengesModel challenge = dataSnapshot.getValue(ChallengesModel.class);
                System.out.println("Title: " + challenge.title);
                System.out.println("Description: " + challenge.description);
                System.out.println("Video URL: " + challenge.videoUrl);
                System.out.println("Duration Type: " + challenge.durationType);

                if (challenge.durationType.equalsIgnoreCase("weekly")) {
                    challengesModelArrayList.add(challenge);
                }

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String prevChildKey) {}
        });
    }
}
