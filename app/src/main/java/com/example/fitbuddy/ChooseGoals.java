package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ChooseGoals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_goals);

        RadioButton loseWeight = findViewById(R.id.loseWeightRb);
        RadioButton buildMuscle = findViewById(R.id.buildMuscleRb);
        RadioButton achieveFlexibility = findViewById(R.id.achieveFlexibilityRb);
        Button start = findViewById(R.id.getstartedBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loseWeight.isChecked()){
                    startActivity(new Intent(ChooseGoals.this, loseweightExcerciseClass.class));
                }

                if(buildMuscle.isChecked()){
                    startActivity(new Intent(ChooseGoals.this, buildmuscleExerciseClass.class));
                }

                if(achieveFlexibility.isChecked()){
                    startActivity(new Intent(ChooseGoals.this, yogaExerciseClass.class));
                }
            }
        });



    }
}