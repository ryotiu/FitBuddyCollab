package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText loginEmail, loginPassword;
    private TextView noAccount, forgotPassword;
    private Button registerBtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = (EditText) findViewById(R.id.LoginEmail);
        loginPassword = (EditText) findViewById(R.id.LoginPasswd);
        noAccount = (TextView) findViewById(R.id.NoAccount);
        forgotPassword = (TextView) findViewById(R.id.ForgotPassword);
        registerBtn = (Button) findViewById(R.id.LoginBtn);

        mAuth = FirebaseAuth.getInstance();
    }
}