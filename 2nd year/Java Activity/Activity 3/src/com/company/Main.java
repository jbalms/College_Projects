package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

        System.out.print("ID: " );
        Long id = sc.nextLong();

        System.out.print("First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scan.nextLine();

        System.out.print("Last Name: ");
        String lastName = scan.nextLine();

        System.out.print("Salary: ");
        Double salary = sc.nextDouble();

        System.out.print("Birhtdate: ");
        String birthdate = scan.nextLine();
        System.out.println("");

        Manager m = new Manager(id,firstName,middleName,lastName,salary,birthdate,"");
        m.getDetails();

    }
}

