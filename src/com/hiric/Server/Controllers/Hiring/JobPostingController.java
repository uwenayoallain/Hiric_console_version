package com.hiric.Server.Controllers.Hiring;

import com.hiric.Server.Model.JobPosting;
import com.hiric.Server.DbController.PropertyVariables;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Job Posting controller
 * 
 * @author Aderline Gashugi
 */

public class JobPostingController {
    static final String DB_URL = "https://remotemysql.com/phpmyadmin/index.php?db=ZKZ7qI2OW3";
    static final String USER = "ZKZ7qI2OW3";
    static final String PASS = "pWgWkTztns";

    JobPosting jobPosting = new JobPosting();
    
    public void createJobPost(String jobTitle, String jobDescription, String jobRequirements, String location,
    Date startDate, String duration, int salary) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();) {
            
            jobPosting.createTableJobPosts();
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

    static final String QUERY = "SELECT id, jobTitle, jobDescription, jobRequirements, location, startDate, duration, salary FROM JobPosts";
    public void viewJobPosts() {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
            while(rs.next()){
                //Display values
                System.out.print(", Title : " + rs.getString("jobTile"));
                System.out.print(", Desc: " + rs.getString("jobDescription"));
                System.out.println(", Requirements: " + rs.getString("jobRequirements"));
                System.out.println(", Location: " + rs.getString("location"));
                System.out.println(", startDate: " + rs.getString("startDate"));
                System.out.println(", duration: " + rs.getString("duration"));
                System.out.println(", salary: " + rs.getString("salary"));
             }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
