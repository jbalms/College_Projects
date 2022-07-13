package com.company;
import java.util.Scanner;

public class TestDog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Dog d=new Dog();
        System.out.println("Dog d’s weight is :" + d.getWeight());
        d.setWeight(42);
        int dognew_Weight;
        do {
            System.out.println("Enter a new Dog's weight or (Enter '0' to exit): ");
            dognew_Weight = scan.nextInt();
            if (dognew_Weight < 0) {
                System.out.println("Dog's new weight is :" + d.getWeight());
                d.setWeight(42);
            } else if (dognew_Weight > 0) {
                System.out.println("Dog's new weight is :" + dognew_Weight);
            }   
        }   while (dognew_Weight != 0);
        System.out.println("Dog d's weight is: " + d.getWeight());
    }
}
