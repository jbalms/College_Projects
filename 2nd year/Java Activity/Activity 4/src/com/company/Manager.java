package com.company;

class Manager extends Employee{

     String department = "Product Designer";

    Manager(Long id, String name, Double salary, int day, String month, int year, String department) {
        super(id, name, salary, day, month, year);
        this.department = this.department;
    }

    void getDetails() {
        super.getDetails();
        System.out.print("Department: " + department);
    }
}
