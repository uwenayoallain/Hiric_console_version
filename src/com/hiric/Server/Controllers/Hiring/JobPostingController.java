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

    public String viewJobPosts() {
        final String selectAllJobPosts = "SELECT id, jobTitle, jobDescription, jobRequirements, location, startDate, duration, salary FROM JobPosts";
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectAllJobPosts);) {
                //Store values in the jobPosts objects and return it.
                String[] jobPosts = {
                    int id: rs.getString("id"),
                    String title: rs.getString("jobTitle"),
                    String desc: rs.getString("jobDescription"),
                    String requirements: rs.getString("jobRequirements"),
                    String location: rs.getString("location"),
                    Date startDate: rs.getString("startDate"),
                    String duration: rs.getString("duration"),
                    int salary: rs.getInt("salary"),
                };
                return jobPosts;
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewJobPost(int id) {
        final String selectSingleJobPost = "SELECT id, jobTitle, jobDescription, jobRequirements, location, startDate, duration, salary FROM JobPosts";
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectSingleJobPost);) {

        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateJobPost() {

    }
}
