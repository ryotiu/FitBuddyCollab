package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    private EditText firstName, lastName, registerEmail, registerPassWD, birthday, currentWeight, targetwWeight;
    private Button registerBtn;

    private FirebaseAuth mAuth;

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

        mAuth = FirebaseAuth.getInstance();

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });
    }

    private void createUser(){
        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        String rEmail = registerEmail.getText().toString();
        String rPassword = registerPassWD.getText().toString();
        String rBirthday = birthday.getText().toString();
        String rCWeight = currentWeight.getText().toString();
        String rTWeight = targetwWeight.getText().toString();

        if(!rEmail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(rEmail).matches()){
            if(!rPassword.isEmpty()){
                mAuth.createUserWithEmailAndPassword(rEmail, rPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(Register.this, "Successfully Registered User", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this, Login.class));
                                finish();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            else {
                registerPassWD.setError("Must enter a password");
            }
        }
        else if (rPassword.isEmpty()){
            registerEmail.setError("Must enter an Email Address");
        }
        else{
            registerEmail.setError("Please Enter a Correct Email Address");
        }
    }
}