package com.hiric.Server.Controllers.UserModuleControllers;

import java.io.*;
import java.util.Properties;

public class Login {
    public Integer UserLogin(String email,String password) throws IOException {
        InputStream inputstream=new FileInputStream("config.properties");
        Properties properties=new Properties();
        Object userId=(Object) properties.getProperty("UserId");

        if(userId==null){
            InputStream input=new FileInputStream("config.properties");
            Properties props=new Properties();
            properties.load(input);
            properties.setProperty("Token","");
            properties.setProperty("UserId",String.valueOf(0));
            
            properties.store(new FileOutputStream("config.properties"),null);
            return 0;
        }
        String ret=userId.toString();
        return Integer.parseInt(ret);
    }
}
