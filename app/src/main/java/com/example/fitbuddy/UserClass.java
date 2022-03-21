package com.example.fitbuddy;

public class UserClass {

    String userID, username, firstName, lastName, birthday, email, currentWeight, targetWeight, imageURL;

    //String firstName, lastName, birthday, email, currentWeight, targetWeight;

    public UserClass() {}

    public UserClass(String userID, String username, String firstName, String lastName, String birthday, String email, String currentWeight, String targetWeight, String imageURL) {
        this.userID = userID;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.currentWeight = currentWeight;
        this.targetWeight = targetWeight;
        this.imageURL = imageURL;
    }

    /*public UserClass(String username, String firstName, String lastName, String birthday, String email, String currentWeight, String targetWeight, String imageURL) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.currentWeight = currentWeight;
        this.targetWeight = targetWeight;
        this.imageURL = imageURL;
    }*/

    /*public UserClass(String firstName, String lastName, String birthday, String email, String currentWeight, String targetWeight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.currentWeight = currentWeight;
        this.targetWeight = targetWeight;
    }*/

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getUserID() { return userID; }

    public void setUserID(String userID) { this.userID = userID; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(String currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(String targetWeight) {
        this.targetWeight = targetWeight;
    }

    public String getImageURL() { return imageURL; }

    public void setImageURL(String imageURL) { this.imageURL = imageURL; }
}