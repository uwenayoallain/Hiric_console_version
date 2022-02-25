package com.hiric.Server.DbController;

import java.io.FileWriter;
import java.util.Properties;

/**
*@author : DABAGIRE Valens - Project Manager
*@description: : database configuration variables
*/

public class PropertyVariables {
    private String databaseUrl;
    private String databaseUsername;
    private String databasePassword;
    private String databasePort;
    private long port;

    public PropertyVariables(String dbUrl, String dbUsername, String dbPassword, String dbPort, long port){
        this.databaseUrl = dbUrl;
        this.databaseUsername = dbUsername;
        this.databasePassword = dbPassword;
        this.databasePort = dbPort;
        this.port = port;
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getDatabasePort() {
        return databasePort;
    }

    public void setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public void savePropertiesInFile() throws Exception{
        Properties properties = new Properties();
        properties.setProperty("dbUrl", getDatabaseUrl());
        properties.setProperty("dbUsername", getDatabaseUsername());
        properties.setProperty("dbPassword", getDatabasePassword());
        properties.setProperty("dbPort", getDatabasePort());
        properties.setProperty("serverPort", getPort()+"");

        properties.store(new FileWriter("dbConfig.properties"), null);
    }

}
