package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Register extends AppCompatActivity {

    private EditText firstName, lastName, registerEmail, registerPassWD, birthday, currentWeight, targetWeight;
    private Button registerBtn;
    private TextView haveAccount;

    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase root;
    private DatabaseReference ref;

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
        targetWeight = (EditText) findViewById(R.id.TargetWeight);
        haveAccount = (TextView) findViewById(R.id.HaveAccount);
        registerBtn = (Button) findViewById(R.id.RegisterBtn);

        //Get Firebase Auth Instance
        firebaseAuth = FirebaseAuth.getInstance();

        //Registered user Click Listener
        haveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });

        //Register Button Click Listener
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });
    }

    //Create a User
    private void createUser(){

        //Get Firebase Database Root Instance
        root = FirebaseDatabase.getInstance();

        //Get Users Reference path
        ref = root.getReference("Users");

        //Then save all the input values as string
        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        String rEmail = registerEmail.getText().toString();
        String rPassword = registerPassWD.getText().toString();
        String rBirthday = birthday.getText().toString();
        String rCWeight = currentWeight.getText().toString();
        String rTWeight = targetWeight.getText().toString();

        //Check if first name, last name, birthday, current weight, target weight field is empty
        if(!fName.isEmpty() && !lName.isEmpty() && !rBirthday.isEmpty() && !rCWeight.isEmpty() && !rTWeight.isEmpty()) {

            //Add date checker
            //Add numeric current weight checker
            //Add numeric target weight checker

            //Check if email and password field is empty, if password is at least 6 characters
            if (!rEmail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(rEmail).matches()) {
                if ((!rPassword.isEmpty()) && (rPassword.length() >= 6)) {
                    //Add check if email exists

                    //Put all the strings into a UserClass to upload
                    UserClass User = new UserClass(fName, lName, rEmail, rPassword, rBirthday, rCWeight, rTWeight);

                    //Create user in Firebase Auth and Storage
                    firebaseAuth.createUserWithEmailAndPassword(rEmail, rPassword)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    //Add Send User a Verification Email
                                    String[] splitEmail = rEmail.split("@");
                                    String username = splitEmail[0];
                                    ref.child(username).setValue(User);
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
                else if (rPassword.length() < 6) {
                    registerPassWD.setError("Must be at least 6 characters");
                    registerPassWD.requestFocus();
                }
                else {
                    registerPassWD.setError("Must enter a password");
                    registerPassWD.requestFocus();
                }
            }
            else if (rEmail.isEmpty()) {
                registerEmail.setError("Must enter an Email Address");
                registerEmail.requestFocus();
            }
            else {
                registerEmail.setError("Please Enter a Correct Email Address");
                registerEmail.requestFocus();
            }
        }
        else if(fName.isEmpty()){
            firstName.setError("First name required!");
            firstName.requestFocus();
        }
        else if(lName.isEmpty()){
            lastName.setError("Last Name required!");
            lastName.requestFocus();
        }
        else if(rBirthday.isEmpty()){
            birthday.setError("Birthday required!");
            birthday.requestFocus();
        }
        else if(rCWeight.isEmpty()){
            currentWeight.setError("Your current weight is required!");
            currentWeight.requestFocus();
        }
        else if(rTWeight.isEmpty()){
            targetWeight.setError("Your target weight is required!");
            targetWeight.requestFocus();
        }
    }
}