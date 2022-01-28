package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText loginEmail, loginPasswd;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = (EditText) findViewById(R.id.LoginEmail);
        loginPasswd = (EditText) findViewById(R.id.LoginPasswd);
        registerBtn = (Button) findViewById(R.id.LoginBtn);
    }
}