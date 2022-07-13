package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        Long id = sc.nextLong();

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Day: ");
        int day = sc.nextInt();

        System.out.print("Month: ");
        String month = scan.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.println("");

    Employee e = new Employee(id,name,salary,day,month,year);
    Manager m = new Manager(id,name,salary,day,month,year,"");
    Secretary s = new Secretary(id,name,salary,day,month,year,"");

    s.getDetails();
    }
}
