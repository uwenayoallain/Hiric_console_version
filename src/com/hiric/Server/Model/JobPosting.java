package com.hiric.Server.Model;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobPosting {
    private String jobTitle;
    private String jobDescription;
    private String jobRequirements;
    private String location;
    private Date startDate;
    private String duration;
    private int salary;
    static final String DB_URL = "https://remotemysql.com/phpmyadmin/index.php?db=ZKZ7qI2OW3";
    static final String USER = "ZKZ7qI2OW3";
    static final String PASS = "pWgWkTztns";

    public void createTableJobPosts() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE TABLE JobPosts " +
                    "(id INTEGER not NULL auto_increment, " +
                    " jobTitle VARCHAR(255), " +
                    " jobDescription VARCHAR(255), " +
                    " jobRequirements text, " +
                    " location VARCHAR(255), " +
                    " startDate date, " +
                    " duration time, " +
                    " salary int, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
