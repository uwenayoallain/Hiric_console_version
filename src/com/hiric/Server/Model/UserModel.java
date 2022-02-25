package com.hiric.Server.Model;
import java.io.*;

public class UserModel implements  Serializable{
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String telephone;

    public UserModel(){

    }
    public UserModel(Integer userId , String firstName , String lastName , String email , String password , String telephone){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }


}
