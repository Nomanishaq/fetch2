package com.example.fetch;

public class UserList {

    String userId;
    String userName;
    String userEmail;
    String userPassword;
    String userPhone;


    public UserList(String userId, String userName, String userEmail, String userPassword, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }
}
