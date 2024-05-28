package com.ghi;
import model.Person;
class Employee extends Person{
    private String password;
    private String jobId;
    private float wage;
    private String title;
    private String startingDate;
    private boolean accountStatus;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public float getWage() {
        return wage;
    }
    public void setWage(float wage) {
        this.wage = wage;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStartingDate() {
        return startingDate;
    }
    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }
    public boolean isAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    public Employee(String name, String lastName, String emailAddress, String dateOfBirth, String id, char gender){
        super(name,lastName,emailAddress,dateOfBirth,id,gender);
        this.password = password;
        this.jobId = jobId;
        this.wage =wage;
        this.title = title;
        this.startingDate = startingDate;
        this.accountStatus = accountStatus;

    }
}