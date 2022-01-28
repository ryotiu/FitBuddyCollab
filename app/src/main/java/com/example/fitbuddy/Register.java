package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    private EditText firstName, lastName, registerEmail, registerPassWD, birthday, currentWeight, targetwWeight;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = (EditText) findViewById(R.id.FirstName);
        lastName = (EditText) findViewById(R.id.LastName);
        registerEmail = (EditText) findViewById(R.id.RegisterEmail);
        registerPassWD = (EditText) findViewById(R.id.RegisterPasswd);
        birthday = (EditText) findViewById(R.id.Birthday);
        currentWeight = (EditText) findViewById(R.id.CurrentWeight);
        targetwWeight = (EditText) findViewById(R.id.TargetWeight);

        registerBtn = (Button) findViewById(R.id.RegisterBtn);
    }
}