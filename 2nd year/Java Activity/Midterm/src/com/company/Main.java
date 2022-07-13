package com.company;
//importing java.util.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaring of Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                -----MENU-----
                1. Enter New Data
                2. Display Employee Information
                3. Exit
                ---------------""");
        try {
        System.out.print("Select a number from the MENU: ");
        int choice = scan.nextInt();
        scan.nextLine();
        //declaring of ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Engineer("Noah","Curtis","Locked" ,
                "Electrical Engineering","Engineer",35500, 3,15,1982));

        employees.add(new Manager("Steph","Smith","Butler" ,
                "Human Resource","Manager",25000, 10,23,1980));

        employees.add(new Secretary("Camille","Eliseo","Bondovich",
                "Operation","Secretary",15000, 3,26,1994));

        //initializing loop and statement for User Input
        Employee[] employee = new Employee[choice];

            for (int i = 0; i < employee.length; i++) {

                if (choice == 1) {
                    System.out.println("New Data Entry");
                } else if (choice == 2) {
                    System.out.println(employees.get(0).attributes());
                    System.out.println(employees.get(1).attributes());
                    System.out.println(employees.get(2).attributes());
                    break;
                } else if(choice == 3){
                    System.out.println("PROGRAM FINISHED! ");
                    return;
                } else {
                    System.out.println("Invalid Input");
                    return;
                }
                System.out.print("First Name: ");
                String firstName = scan.nextLine();

                System.out.print("Middle Name: ");
                String middleName = scan.nextLine();

                System.out.print("Last Name: ");
                String lastName = scan.nextLine();

                System.out.print("Department: ");
                String department = scan.nextLine();

                System.out.print("Position: ");
                String position = scan.nextLine();

                System.out.print("Salary: ");
                int salary = scan.nextInt();

                System.out.print("Birth Month: ");
                int month = scan.nextInt();

                System.out.print("Birth Day: ");
                int day = scan.nextInt();

                System.out.print("Birth Year: ");
                int year = scan.nextInt();
                System.out.println();
                System.out.println();

                //Creating object
                Employee e = new Employee(firstName, middleName, lastName, department, position, salary, month, day, year);
                System.out.println(e.attributes());
                //declaration of each Arraylist object
                System.out.println(employees.get(0).attributes());
                System.out.println(employees.get(1).attributes());
                System.out.println(employees.get(2).attributes());
            }
        } catch (Exception e) {
            System.out.println("INVALID INPUT ");
            System.out.println("PLEASE ENTER A VALID INPUT TO PROCEED ");
        }
    }
}
