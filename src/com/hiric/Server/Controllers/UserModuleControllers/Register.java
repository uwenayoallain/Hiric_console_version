package com.hiric.Server.Controllers.UserModuleControllers;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register {

    public void  registerUser(Connection connection,String email,String password, String firstname ,String lastname ,String telephone, String accountType,String role) throws Exception{
        if(checkIfUserExist(connection,email)){
            System.out.println("Email is already used Please try using another email");
            System.exit(0);
        }
        String securePassword = hashPassword(password);
        boolean matched = BCrypt.checkpw(password,securePassword);

        System.out.println(matched);
        String sql = "INSERT INTO users_table(first_name,last_name,email,password,telephone,account_type,role) values (?,?,?,?,?,?,?,?)";
        PreparedStatement insertUser = connection.prepareStatement(sql);
        insertUser.setString(1,firstname);
        insertUser.setString(2,lastname);
        insertUser.setString(3,email);
        insertUser.setString(4,securePassword);
        insertUser.setString(5,telephone);
        insertUser.setString(6,accountType);
        insertUser.setString(7,role);
        int inserted = insertUser.executeUpdate();
        if(inserted == 1){
            System.out.println("User has been registered Successfully");
        }
        else{
            System.out.println("an error occurred");
        }
    }

    private String hashPassword(String password){
        System.out.println(BCrypt.gensalt(10));
        return BCrypt.hashpw(password,BCrypt.gensalt(10));

    }

    public static boolean checkIfUserExist(Connection connection,String email) throws Exception {
        String sql = "SELECT * FROM users_table WHERE email = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,email);
        ResultSet rs = preparedStatement.executeQuery();
        return rs.next();
    }

}