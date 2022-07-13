package com.company;

public class Secretary extends Employee {

    Secretary(String firstName, String middleName, String lastName,
              String department, String position,
              int salary,
              int month, int day, int year) {
        super(firstName, middleName, lastName, department, position, salary, month, day, year);
    }

    int attributes() {
        System.out.println("Employee No. 3");
        super.attributes();
        return 3;
    }
}
