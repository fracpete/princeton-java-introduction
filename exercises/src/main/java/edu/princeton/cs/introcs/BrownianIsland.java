package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac BrownianIsland.java 
 *  Execution:    java BrownianIsland var N
 *  Dependencies: StdDraw.java
 *
 *  Plots Brownian island using the midpoint displacement method.
 *
 *  % java BrownianIsland 0.5 11
 *
 *************************************************************************/

public class BrownianIsland { 

    public static void midpoint(double x0, double y0, double x1, double y1, double var, int N) {
        if (N == 0) {
            StdDraw.line(x0, y0, x1, y1);
            return;
        }
        double xmid = 0.5 * (x0 + x1) + StdRandom.gaussian(0, Math.sqrt(var));
        double ymid = 0.5 * (y0 + y1) + StdRandom.gaussian(0, Math.sqrt(var));


        midpoint(x0, y0, xmid, ymid, var / 2.7, N-1);   // 3 seems to be a good value
        midpoint(xmid, ymid, x1, y1, var / 2.7, N-1);
    }



    public static void main(String[] args) {
        double var = Double.parseDouble(args[0]);
        int N = Integer.parseInt(args[1]);

        StdDraw.clear(StdDraw.LIGHT_GRAY);
        StdDraw.setXscale(-1, +1);
        StdDraw.setYscale(-1, +1);
        midpoint(0, 0, 0, 0, var / Math.sqrt(2), N);
    }
}

