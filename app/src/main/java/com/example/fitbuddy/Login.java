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
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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

        //Get Firebase Auth Instance
        firebaseAuth = FirebaseAuth.getInstance();

        //No Account Click Listener
        noAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });

        //Forget Password Click Listener
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add Code here
            }
        });

        //Login Button Click Listener
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
    }

    //Login the user
    private void loginUser(){
        String lEmail = loginEmail.getText().toString();
        String lPassword = loginPassword.getText().toString();

        //If Email and Password are not empty
        //Email is a correct Email Address
        //Login the user
        if(!lEmail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(lEmail).matches()){
            if(!lPassword.isEmpty()){
                firebaseAuth.signInWithEmailAndPassword(lEmail, lPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                //Add SharedPreference for all Signed In Activity from here on
                                Toast.makeText(Login.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Login.this, LoggedIn.class));
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login.this, "Failed to Login", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            else {
                loginPassword.setError("Must enter a password");
            }
        }
        else if (lPassword.isEmpty()){
            loginEmail.setError("Must enter an Email Address");
        }
        else{
            loginEmail.setError("Please Enter a Correct Email Address");
        }
    }
}