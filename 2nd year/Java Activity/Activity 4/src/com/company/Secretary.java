package com.company;

public class Secretary extends Employee{

    String department;

    Secretary(Long id, String name, Double salary, int day, String month, int year, String department) {
        super(id, name, salary, day, month, year);
        this.department = department;
    }
    void getDetails() {
        super.getDetails();
        System.out.print("Department: " + department);
    }
}
