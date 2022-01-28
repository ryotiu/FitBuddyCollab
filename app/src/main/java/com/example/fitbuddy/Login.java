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
    private Button loginBtn;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = (EditText) findViewById(R.id.LoginEmail);
        loginPassword = (EditText) findViewById(R.id.LoginPassword);
        noAccount = (TextView) findViewById(R.id.NoAccount);
        forgotPassword = (TextView) findViewById(R.id.ForgotPassword);
        loginBtn = (Button) findViewById(R.id.LoginBtn);

        firebaseAuth = FirebaseAuth.getInstance();
    }
}