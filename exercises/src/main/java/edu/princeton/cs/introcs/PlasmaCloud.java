package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac PlasmaCloud.java 
 *  Execution:    java Plasma N
 *  Dependencies: StdDraw.java
 *
 *  Create an N-by-N plasma fractal using the midpoint displacement method.
 *  Also called a fractal cloud. Try different colors to get a cloud.
 *  Also used to generate random terrain where "color" becomes the
 *  altitude.
 *
 *  % java PlasmaCloud 500
 *
 * 
 *  Remarks
 *  -------
 *  - it's possible that the color c does not stay between 0 and 1;
 *    this is not disastorous since the HSB color routine uses only
 *    the fractional part
 *
 **************************************************************************/

import java.awt.Color;

public class PlasmaCloud { 

    // centered at (x, y), of given size, using given standard deviation for computing the
    // displacement, and with upper left, upper right, lower lower, and lower right hues c1, c2, c3, c4
    public static void plasma(double x,  double y,  double size, double stddev,
                              double c1, double c2, double c3,   double c4) {

        // base case
        if (size <= 0.001) return;

        // calculate new color of midpoint using random displacement
        double displacement = StdRandom.gaussian(0, stddev);
        double cM = (c1 + c2 + c3 + c4) / 4.0 + displacement;

        // draw a colored square
        Color color = Color.getHSBColor((float) cM, .8f, .8f);
        StdDraw.setPenColor(color);
        StdDraw.filledSquare(x, y, size);

        double cT = (c1 + c2) / 2.0;    // top
        double cB = (c3 + c4) / 2.0;    // bottom
        double cL = (c1 + c3) / 2.0;    // left
        double cR = (c2 + c4) / 2.0;    // right

        plasma(x - size/2, y - size/2, size/2, stddev/2, cL, cM, c3, cB);
        plasma(x + size/2, y - size/2, size/2, stddev/2, cM, cR, cB, c4);
        plasma(x - size/2, y + size/2, size/2, stddev/2, c1, cT, cL, cM);
        plasma(x + size/2, y + size/2, size/2, stddev/2, cT, c2, cM, cR);
    }



    public static void main(String[] args) {
        int SIZE = Integer.parseInt(args[0]);

        // choose intial corner colors at random betwen 0 and 1
        double c1 = Math.random();
        double c2 = Math.random();
        double c3 = Math.random();
        double c4 = Math.random();

        // controls variation in color
        double stddev = 1.0;

        plasma(.5, .5, .5, stddev, c1, c2, c3, c4);
    }
}
