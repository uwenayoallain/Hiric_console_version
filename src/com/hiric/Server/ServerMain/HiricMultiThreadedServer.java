package com.hiric.Server.ServerMain;

//packages
import com.hiric.Server.DbController.PropertyVariables;


/**
@author : DABAGIRE Valens
@description: Hiric server entry point to accept multiple clients
* */

public class HiricMultiThreadedServer {

    public void startServer() throws Exception{
        String url = "jdbc:mysql://remotemysql.com:3306/ZKZ7qI2OW3?"+"autoReconnect=true&useSSL=false";
        String user = "ZKZ7qI2OW3";
        String password = "pWgWkTztns";

        PropertyVariables propertyVariables = new PropertyVariables(url, user, password, "3306", 1200L);
        propertyVariables.savePropertiesInFile();

    }

    public static void main(String[] args) throws Exception {
        HiricMultiThreadedServer h = new HiricMultiThreadedServer();

        System.out.print("Accept multiple clients");
    }
}
