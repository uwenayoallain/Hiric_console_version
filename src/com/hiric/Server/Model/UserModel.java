package com.hiric.Server.Model;
import java.io.*;

public class UserModel implements  Serializable{
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int telephone;
    private UserRole role;
    private String accountType;
    public UserModel(){

    }
    public UserModel(int userId , String firstName , String lastName , String email , String password ,String accountType, int telephone, UserRole role){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.telephone = telephone;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public UserRole getRole() {
        return role;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
