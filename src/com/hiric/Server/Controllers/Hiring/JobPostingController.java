package com.hiric.Server.Controllers.Hiring;

import com.hiric.Server.Model.JobPosting;
import com.hiric.Server.DbController.PropertyVariables;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Job Posting controller
 * 
 * @author Aderline Gashugi
 */

public class JobPostingController {
    static final String DB_URL = "https://remotemysql.com/phpmyadmin/index.php?db=ZKZ7qI2OW3";
    static final String USER = "ZKZ7qI2OW3";
    static final String PASS = "pWgWkTztns";

    public void createJobPost(String jobTitle, String jobDescription, String jobRequirements, String location,
            Date startDate, String duration, int salary) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {

            String sql = "INSERT INTO JobPosts " +
                    " (jobTitle, jobDescription, jobRequirements, location, startDate, duration, salary)" +
                    "VALUES" +
                    "(" + jobTitle + ", " + jobDescription + "," + jobRequirements + "," + location + "," + startDate
                    + "," + duration + "," + salary + ")";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
