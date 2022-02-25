package com.hiric.Server.Model;

import java.io.IOException;
import java.util.Date;

public class AdminDashboard {

    private String employeeReports;
    private String employerReports;
    private int statisticsNumbers;
    private Date lastDated;
    private int deposits;
    private int withdrawals;
    private String names;

    public String getEmployeeReports() {
        return employeeReports;
    }

    public String getEmployerReports() {
        return employerReports;
    }

    public int getStatisticsNumbers() {
        return statisticsNumbers;
    }

    public Date getLastDated() {
        return lastDated;
    }

    public int getDeposits() {
        return deposits;
    }

    public int getWithdrawals() {
        return withdrawals;
    }

    public String getNames() {
        return names;
    }

    public void setEmployeeReports(String employeeReports) {
        this.employeeReports = employeeReports;
    }

    public void setEmployerReports(String employerReports) {
        this.employerReports = employerReports;
    }

    public void setStatisticsNumbers(int statisticsNumbers) {
        this.statisticsNumbers = statisticsNumbers;
    }

    public void setLastDated(Date lastDated) {
        this.lastDated = lastDated;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public void setWithdrawals(int withdrawals) {
        this.withdrawals = withdrawals;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public static void main(String[] args) throws IOException{

    }
}
