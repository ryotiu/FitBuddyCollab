package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button LoginBtn, RegisterBtn;
    FirebaseUser firebaseUser;

    @Override
    protected void onStart(){
        super.onStart();

        if(firebaseUser != null){
            Intent intent = new Intent(MainActivity.this, Chat.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginBtn = (Button) findViewById(R.id.loginButton);
        RegisterBtn = (Button) findViewById(R.id.RegisterButton);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });
    }

    public void openLogin() {
        Intent loginIntent = new Intent(this, Login.class);
        startActivity(loginIntent);
    }

    public void openRegister() {
        Intent registerIntent = new Intent(this, Register.class);
        startActivity(registerIntent);
    }

}