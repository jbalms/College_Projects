//importing packages
package com.company;
import javax.swing.*;
import java.awt.*;

public class Main3 {

    //Main Class
    public static void main (String []args) {
        GridExample guiWindow2 = new GridExample();
        guiWindow2.launchFrame();
    }

    //Initializing Class for GridExample
    public static class GridExample{

        //Declaration of the Objects
        private final JFrame f;
        private final JButton topLeft, topRight, leftCenter, rightCenter, bottomLeft, bottomRight;

        //Constructor for the Frame and Button
        public GridExample() {
             f = new JFrame("Grid Layout");
             topLeft = new JButton("Top Left Button");
             topRight = new JButton("Top Right Button");
             leftCenter = new JButton("Left Center Button");
             rightCenter = new JButton("Right Center Button");
             bottomLeft = new JButton("Bottom Left Button");
             bottomRight = new JButton("Bottom Right Button");
        }

        //Method
        public void launchFrame() {

            f.setLayout(new GridLayout(3,3));
            f.add(topLeft);
            f.add(topRight);
            f.add(leftCenter);
            f.add(rightCenter);
            f.add(bottomLeft);
            f.add(bottomRight);
            f.pack();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
