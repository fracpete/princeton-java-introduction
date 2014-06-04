package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Banner.java
 *  Execution:    java Banner s
 *  Dependencies: StdDraw.java
 *
 *  Plots the String s, and moves it across the screen, left-to-right,
 *  wrapping around when it reaches the border.
 *
 *  % java Banner "Hello, World"
 *
 *
 *************************************************************************/

import java.awt.Font;

public class Banner { 

    public static void main(String[] args) { 
        String s = args[0];

        // remove the 5% border
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);

        // set the font
        Font f = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(f);
        StdDraw.setPenColor(StdDraw.WHITE);

        for (double i = 0.0; true; i += 0.01) {
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.text((i % 1.0),       0.5, s);
            StdDraw.text((i % 1.0) - 1.0, 0.5, s);
            StdDraw.text((i % 1.0) + 1.0, 0.5, s);
            StdDraw.show(60);
        }

    }

}
