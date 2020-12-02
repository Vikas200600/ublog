package com.upgrad.ublog.dtos;

public class User {
    private int userId;
    private String emailId;
    private String password;

    public int getUserId() { return userId; }

    public String getEmailId() { return emailId; }

    public String getPassword() { return password; }

    public void setUserId(int userId) { this.userId = userId; }

    public void setEmailId(String emailId) { this.emailId = emailId; }

    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
