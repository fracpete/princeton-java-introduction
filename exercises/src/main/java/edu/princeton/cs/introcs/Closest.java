package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Closest.java 
 *  Execution:    java Closest x y z
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Takes three command-line arguments x, y, z; reads from standard input a
 *  sequence of point coordinates (xi, yi, zi), and prints the coordinates
 *  of the point closest to (x, y, z).
 *
 *  % java Closest 1.0 5.0 2.0
 *  1.0 3.0 9.0
 *  5.0 3.0 2.5
 *  9.0 6.0 2.0
 *  2.0 6.0 3.0
 *  5.0 6.0 5.0
 *  <Ctrl-d>
 *  Closest point = (2.000000, 6.000000, 3.000000)  
 *
 *************************************************************************/

public class Closest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double bestx = Double.NaN;
        double besty = Double.NaN;
        double bestz = Double.NaN;
        double bestDist2 = Double.POSITIVE_INFINITY;

        while (!StdIn.isEmpty()) {
            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double zi = StdIn.readDouble();
            double dist2 = (x - xi) * (x - xi) + (y - yi) * (y - yi) + (z - zi) * (z - zi);
            if (dist2 < bestDist2) {
                bestx = xi;
                besty = yi;
                bestz = zi;
                bestDist2 = dist2;
            }
        }

        // output
        StdOut.printf("Closest point = (%f, %f, %f)\n", bestx, besty, bestz);
    }
}

