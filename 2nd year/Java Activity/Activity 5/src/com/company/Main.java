package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        // declare an object variable
        ProgrammingLanguage_1 pl;

        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage_1();
        System.out.print("Enter a word: ");
        String word1 = scan.nextLine();
        pl.display(word1);

        // create object of Java class
        pl = new Java_1();
        System.out.print("Enter another word: ");
        String word2 = scan.nextLine();
        pl.display(word2);

        System.out.println();
        System.out.println(word1);
        System.out.println(word2);
    }
}
