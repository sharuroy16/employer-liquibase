package com.example.employer.DTO;

public class EmployerSaveDTO {
    
    private String employerName;
    private String employerEmail;
    private int employerAge;

    public EmployerSaveDTO(String employerName, String employerEmail, int employerAge) {
        this.employerName = employerName;
        this.employerEmail = employerEmail;
        this.employerAge = employerAge;
    }

    public EmployerSaveDTO() {
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
            " employerName='" + getEmployerName() + "'" +
            ", employerEmail='" + getEmployerEmail() + "'" +
            ", employerAge='" + getEmployerAge() + "'" +
            "}";
    }
}
