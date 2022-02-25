package com.hiric.Server.Model;

import java.util.Date;

public class JobPosting {
    private String jobTitle;
    private String jobDescription;
    private String[] jobRequirements;
    private String location;
    private Date startDate;
    private int duration;
    private int salary;

    public JobPosting(String jobTitle, String jobDescription, String[] jobRequirements, String location, Date startDate, int duration) {

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

    public String[] getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String[] jobRequirements) {
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
