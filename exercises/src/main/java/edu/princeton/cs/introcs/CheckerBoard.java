package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac CheckerBoard.java 
 *  Execution:    java CheckerBoard N
 *  Dependencies: StdDraw.java
 *
 *  Plots an N-by-N checker board.
 *
 *************************************************************************/

public class CheckerBoard { 

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else                  StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledSquare(i + .5, j + .5, .5);
            }
        }
        StdDraw.show();
    }

}
