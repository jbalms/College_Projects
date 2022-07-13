package com.company;

public class Employee {
    
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String department;
    private final String position;
    private final int salary;
    private final int month;
    private final int day;
    private final int year;

    public Employee(String firstName, String middleName, String lastName,
                    String department, String position,
                    int salary,
                    int month, int day, int year) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    int attributes() {
        System.out.println("Name       : " + firstName + " " + middleName + ", " + lastName);
        System.out.println("Department : " + department);
        System.out.println("Position   : " + position);
        System.out.println("Salary     : " + salary);
        System.out.println("Birth Date : " +month + " " + day + ", " + year);
        System.out.println();
        return 0;
    }
}
