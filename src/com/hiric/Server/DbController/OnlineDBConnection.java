package com.hiric.Server.DbController;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class OnlineDBConnection {
    public Connection getConnection() throws Exception{

        Connection connection = null;

        //read db connection properties from file
        FileReader reader  = new FileReader("dbConfig.properties");
        Properties storedProperties = new Properties();
        storedProperties.load(reader);

        try {
            String url = storedProperties.getProperty("dbUrl");
            String username = storedProperties.getProperty("dbUsername");
            String password = storedProperties.getProperty("dbPassword");

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection");

            return connection;
        }
        catch (SQLException e) {
            System.out.println("sql connection exception is occurring ... ");
            System.out.println( "" +e);
        }

        catch (Exception e) {
            System.out.println("High level failure of the system .... ");
            System.out.println(e);
        }
        return connection;
    }

    /*
    CREATE NEW DATABASE CONNECTION
    * */

    public void checkDbConnection(Connection connection) throws Exception{
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select  * from test_tb");
        System.out.println(" -------------------------- TEST TABLE DATA  ------------------------- ");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("user");
            System.out.println(" Id : " + id + "\t\t name: " + name);
            System.out
                    .println(" ------------------------------------------------------------------------------------ ");
        }
    }

//    public static void main(String[] args) throws Exception {
//        OnlineDBConnection db = new OnlineDBConnection();
//        System.out.println(db.getConnection());
//    }
}
