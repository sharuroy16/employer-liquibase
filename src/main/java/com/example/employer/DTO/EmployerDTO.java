package com.example.employer.DTO;

public class EmployerDTO {
    
    private int employerID;
    private String employerName;
    private String employerEmail;
    private int employerAge;

    public EmployerDTO(int employerID, String employerName, String employerEmail, int employerAge) {
        this.employerID = employerID;
        this.employerName = employerName;
        this.employerEmail = employerEmail;
        this.employerAge = employerAge;
    }

    public EmployerDTO() {
    }

    public int getEmployerID() {
        return employerID;
    }

    public void setEmployerID(int employerID) {
        this.employerID = employerID;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public int getEmployerAge() {
        return employerAge;
    }

    public void setEmployerAge(int employerAge) {
        this.employerAge = employerAge;
    }

    @Override
    public String toString() {
        return "{" +
            " employerID='" + getEmployerID() + "'" +
            ", employerName='" + getEmployerName() + "'" +
            ", employerEmail='" + getEmployerEmail() + "'" +
            ", employerAge='" + getEmployerAge() + "'" +
            "}";
    }
}