package com.company;

public class Manager extends Employee{

    private String department;

    public Manager(Long id,
                   String firstName,
                   String middleName,
                   String lastName,
                   Double birthdate,
                   String salary,
                   String department) {
        super(id, firstName, middleName, lastName, birthdate, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void getDetails() {
        super.getDetails();
    }
}