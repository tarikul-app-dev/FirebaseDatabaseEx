package com.example.tarikul.firebasedatabaseexample;

public class ModelClass {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ModelClass(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
    public ModelClass( ) {

    }
    String userName;
    String phoneNumber;
}