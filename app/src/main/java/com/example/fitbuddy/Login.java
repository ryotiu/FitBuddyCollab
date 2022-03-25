package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText loginEmail, loginPassword;
    TextView noAccount, forgotPassword;
    Button loginBtn;
    //SharedPreferences sp;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = (EditText) findViewById(R.id.LoginEmail);
        loginPassword = (EditText) findViewById(R.id.LoginPassword);
        noAccount = (TextView) findViewById(R.id.NoAccount);
        forgotPassword = (TextView) findViewById(R.id.ForgotPassword);
        loginBtn = (Button) findViewById(R.id.LoginBtn);

        //Create SharePreference
        //sp = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);

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

        //If Email are empty
        if(lEmail.isEmpty()){
            loginEmail.setError("Must enter an Email Address");
            loginEmail.requestFocus();
            return;
        }

        //If Password are empty
        if(lPassword.isEmpty()){
            loginPassword.setError("Must enter a password");
            loginPassword.requestFocus();
            return;
        }

        //Check Email is a correct Email Address, then Login the user
        if(Patterns.EMAIL_ADDRESS.matcher(lEmail).matches()){
            firebaseAuth.signInWithEmailAndPassword(lEmail, lPassword)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            //Save Username in SharedPreference, move user to LoggedIn Activity
                            //String[] splitEmail = lEmail.split("@");
                            //String username = splitEmail[0];
                            //SharedPreferences.Editor editor = sp.edit();
                            //editor.putString("Username", username);
                            //editor.apply();

                            Toast.makeText(Login.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login.this, LoggedIn.class));
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Login.this, "Failed to Login", Toast.LENGTH_SHORT).show();
                    //Log.e("Login", e.toString());
                }
            });
        }
        else{
            loginEmail.setError("Please Enter a Correct Email Address");
            loginEmail.requestFocus();
        }
    }
}