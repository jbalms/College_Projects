package com.company;

public class Employee {

    private Long id;
    private String firstName, middleName, lastName;
    private Double salary;
    private String birthdate;


   public Employee(long id, String firstName, String middleName, String lastName, Double salary, String birthdate) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Double getSalary() {
       return salary;
    }
    public void setSalary(Double salary) {
       this.salary = salary;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void getDetails() {
        System.out.println("Employee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + middleName + ", " + lastName);
        System.out.println("Salary: " + salary);
        System.out.println("Birthdate: " + birthdate);
    }
}
