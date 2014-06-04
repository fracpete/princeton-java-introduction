package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Spirograph.java
 *  Execution:    java Spirograph R r a
 *  Dependencies: StdDraw.java
 *
 *  Draw a curve formed by rolling a smaller circle of radius r inside
 *  a larger circle or radius R. If the pen offset of the pen point in
 *  the moving circle is a, then the equation of the resulting curve
 *  at time t is
 *
 *     x = (R+r)*cos(t) - (r+a)*cos(((R+r)/r)*t)
 *     y = (R+r)*sin(t) - (r+a)*sin(((R+r)/r)*t)
 *
 *  % java Spirograph 180 40 15
 *
 *  % java Spirograph 100 55 20
 *
 *  Credits: idea suggested by Diego Nehab
 *  Reference: http://www.math.dartmouth.edu/~dlittle/java/SpiroGraph
 *  Reference: http://www.wordsmith.org/~anu/java/spirograph.html
 *
 *************************************************************************/

public class Spirograph {

    public static void main(String[] args) {
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        StdDraw.setXscale(-300, +300);
        StdDraw.setYscale(-300, +300);
        StdDraw.clear(StdDraw.BLACK);

        for (double t = 0.0; t < 100; t += 0.01) {
            double x = (R+r) * Math.cos(t) - (r+a) * Math.cos(((R+r)/r)*t);
            double y = (R+r) * Math.sin(t) - (r+a) * Math.sin(((R+r)/r)*t);
            double degrees = -Math.toDegrees((R+r)/r)*t;
            StdDraw.picture(x, y, "earth.gif", degrees);
            // StdDraw.rotate(+Math.toDegrees((R+r)/r)*t);
            StdDraw.show(20);
        }

    }
   
}
