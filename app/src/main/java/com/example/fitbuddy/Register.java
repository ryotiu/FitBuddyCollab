package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitbuddy.Model.UserClass;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class Register extends AppCompatActivity {

    DatePickerDialog datePickDialog;
    EditText firstName, lastName, registerEmail, registerPassWD, currentWeight, targetWeight;
    Button registerBtn, birthdayBtn;
    TextView haveAccount;

    FirebaseAuth firebaseAuth;
    FirebaseDatabase root;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initDatePicker();

        firstName = (EditText) findViewById(R.id.FirstName);
        lastName = (EditText) findViewById(R.id.LastName);
        registerEmail = (EditText) findViewById(R.id.RegisterEmail);
        registerPassWD = (EditText) findViewById(R.id.RegisterPasswd);
        currentWeight = (EditText) findViewById(R.id.CurrentWeight);
        targetWeight = (EditText) findViewById(R.id.TargetWeight);
        haveAccount = (TextView) findViewById(R.id.HaveAccount);
        registerBtn = (Button) findViewById(R.id.RegisterBtn);
        birthdayBtn = (Button) findViewById(R.id.BirthdayBtn);
        birthdayBtn.setText(getTodayDate());

        //Get Firebase Auth Instance
        firebaseAuth = FirebaseAuth.getInstance();

        //Get Firebase Database Root Instance
        root = FirebaseDatabase.getInstance();

        birthdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickDialog.show();
            }
        });

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

    //Initialize Custom Date Picker Button
    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int Year, int Month, int Day) {
                Month = Month + 1;
                String Birthday = makeDateString(Month, Day, Year);
                birthdayBtn.setText(Birthday);
            }
        };

        Calendar calendarToday = Calendar.getInstance();
        int calMonth = calendarToday.get(Calendar.MONTH);
        int calDay = calendarToday.get(Calendar.DAY_OF_MONTH);
        int calYear = calendarToday.get(Calendar.YEAR);

        int style = AlertDialog.THEME_HOLO_LIGHT;
        datePickDialog = new DatePickerDialog(this, style, dateSetListener, calYear, calMonth, calDay);
    }

    //Make a date String out of these numbers
    private String makeDateString(int month, int day, int year){
        return month + "/" + day + "/" + year;
    }

    //Get Today's Date
    private String getTodayDate() {
        Calendar calendarToday = Calendar.getInstance();
        int calMonth = calendarToday.get(Calendar.MONTH);
        calMonth = calMonth + 1;
        int calDay = calendarToday.get(Calendar.DAY_OF_MONTH);
        int calYear = calendarToday.get(Calendar.YEAR);
        return makeDateString(calMonth, calDay, calYear);
    }

    //Create a User
    private void createUser(){
        //Get Users Reference path
        ref = root.getReference("Users");

        //Then save all the input values as string

        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        String rBirthday = birthdayBtn.getText().toString();
        String rEmail = registerEmail.getText().toString();
        String rPassword = registerPassWD.getText().toString();
        String rCWeight = currentWeight.getText().toString();
        String rTWeight = targetWeight.getText().toString();
        //String[] splitEmail = rEmail.split("@");
        //String username = splitEmail[0];
        String imageURL = "default";

        //Check if first name, last name, email, password, current weight, target weight field is empty
        if(!fName.isEmpty() && !lName.isEmpty() && !rEmail.isEmpty() && !rPassword.isEmpty() && !rCWeight.isEmpty() && !rTWeight.isEmpty()) {
            //Check if password is at least 6 characters
            if (Patterns.EMAIL_ADDRESS.matcher(rEmail).matches()) {
                //Check password length for minimum Firebase length
                if (rPassword.length() >= 6) {
                    //Check current & target weight is higher than 0 and lower than 1400
                    if((Integer.parseInt(rCWeight) > 0 && Integer.parseInt(rCWeight) <= 1400) && (Integer.parseInt(rTWeight) > 0 && Integer.parseInt(rTWeight) <= 1400)){
                        //Put all the strings into a UserClass for Firebase Storage Upload
                        //UserClass User = new UserClass(username, fName, lName, rBirthday, rEmail, rCWeight, rTWeight, imageURL);

                        //Register User
                        //RegisterUser(User, rEmail, rPassword);
                        RegisterUser(fName, lName, rBirthday, rEmail, rPassword, rCWeight, rTWeight, imageURL);
                    }
                    else if((Integer.parseInt(rCWeight) <= 0 || Integer.parseInt(rCWeight) > 1400)){
                        currentWeight.setError("Impossible Weight entered");
                        currentWeight.requestFocus();
                    }
                    else if((Integer.parseInt(rTWeight) <= 0 || Integer.parseInt(rTWeight) > 1400)){
                        targetWeight.setError("Impossible Weight entered");
                        targetWeight.requestFocus();
                    }
                }
                else{
                    registerPassWD.setError("Must be at least 6 characters");
                    registerPassWD.requestFocus();
                }
            }
            else{
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
        else if (rEmail.isEmpty()) {
            registerEmail.setError("Must enter an Email Address");
            registerEmail.requestFocus();
        }
        else if (rPassword.isEmpty()){
            registerPassWD.setError("Must enter a password");
            registerPassWD.requestFocus();
        }
        else if(rCWeight.isEmpty()){
            currentWeight.setError("Your current weight is required!");
            currentWeight.requestFocus();
        }
        else{
            targetWeight.setError("Your target weight is required!");
            targetWeight.requestFocus();
        }
    }

    private void RegisterUser(String firstName, String lastName, String Birthday, String email, String password, String CWeight, String TWeight, String imageURL){
    //private void RegisterUser(UserClass userInfo, String email, String password){
        //Create user in Firebase Auth and Storage
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            //Create a Username for Firebase Storage
                            String[] splitEmail = email.split("@");
                            String username = splitEmail[0];

                            //Create a User Account by UID
                            FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                            String userID = firebaseUser.getUid();
                            UserClass userInfo = new UserClass(userID, username, firstName, lastName, Birthday, email, CWeight, TWeight, imageURL);
                            ref.child(userID).setValue(userInfo);

                            Toast.makeText(Register.this, "Successfully Registered User", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Register.this, Login.class));
                            finish();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                if(e instanceof FirebaseAuthUserCollisionException){
                    //Email Exist in Firebase, display Error
                    registerEmail.setError("Email Already Exists");
                    registerEmail.requestFocus();
                }
                else if(e instanceof FirebaseAuthInvalidUserException){
                    String ExceptionErrorCode = ((FirebaseAuthInvalidUserException) e).getErrorCode();
                    if (ExceptionErrorCode.equals("ERROR_USER_NOT_FOUND")) {
                        registerEmail.setError("No Such Account Exist");
                        registerEmail.requestFocus();
                    } else if (ExceptionErrorCode.equals("ERROR_USER_DISABLED")) {
                        registerEmail.setError("User Email has been banned");
                        registerEmail.requestFocus();
                    } else {
                        registerEmail.setError(e.getLocalizedMessage());
                        registerEmail.requestFocus();
                    }
                }
            }
        });
    }

    /*
    private void emailVerification(){
        FirebaseUser RegisteredUser = firebaseAuth.getCurrentUser();
        RegisteredUser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(Register.this, "Verification Email Sent.", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Register.this, "Unable to Send Verification Email", Toast.LENGTH_SHORT).show();
            }
        });
    }
    */
}