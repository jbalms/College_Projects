//importing packages
package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    //Initializing Class for BorderExample
    public static class BorderExample {

        //Declaration of Objects
        private final JFrame f;
        private final JButton leftButton, centerButton, rightButton, topButton, bottomButton;

       //Constructor for Frame and Button
       public BorderExample() {

            f = new JFrame("Border Layout");
            centerButton = new JButton("CENTER");
            leftButton = new JButton("LEFT");
            rightButton= new JButton("RIGHT");
            topButton = new JButton("TOP");
            bottomButton = new JButton("BOTTOM");
        }

        //Method
        public void launchFrame() {

            f.add(leftButton, BorderLayout.WEST);
            f.add(rightButton, BorderLayout.EAST);
            f.add(centerButton, BorderLayout.CENTER);
            f.add(topButton, BorderLayout.NORTH);
            f.add(bottomButton, BorderLayout.SOUTH);

            f.pack();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        //Main Class
        public static void main(String[] args) {

            BorderExample guiWindow2 = new BorderExample();
            guiWindow2.launchFrame();
        }
    }
}
