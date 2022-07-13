//importing packages
package com.company;
import java.awt.*;
import javax.swing.*;

public class Main2 {

    //Main Class
    public static void main (String []args) {

        FlowExample guiWindow2 = new FlowExample();
        guiWindow2.launchFrame();
    }
         //Initializing Class for FlowExample
         public static class FlowExample {

         //Declaration of the Objects
         private final JFrame f;
         private final JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

         //Constructor for the Frame and Button
         public FlowExample() {

             f = new JFrame("FlowLayout Example");
             b1 = new JButton("Button 1");
             b2 = new JButton("Button 2");
             b3 = new JButton("Button 3");
             b4 = new JButton("Button 4");
             b5 = new JButton("Button 5");
             b6 = new JButton("Button 6");
             b7 = new JButton("Button 7");
             b8 = new JButton("Button 8");
             b9 = new JButton("Button 9");
             b10 = new JButton("Button 10");
             }

         //Method
         public void launchFrame() {

             f.setLayout(new FlowLayout());
             f.add(b1);
             f.add(b2);
             f.add(b3);
             f.add(b4);
             f.add(b5);
             f.add(b6);
             f.add(b7);
             f.add(b8);
             f.add(b9);
             f.add(b10);
             f.pack(); //for the setting to take effect
             f.setVisible(true);
             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             }
    }
}
