package com.company;

public class Employee {

    protected long id;
    protected String name,month;
    protected double salary;
    protected int day, year;

    public Employee(Long id,String name, Double salary, int day, String month, int year) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Birthdate: " + month + " " + day + ", " + year);
    }

}


