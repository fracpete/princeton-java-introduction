package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac RandomWalkers.java
 *  Execution:    java RandomWalker N
 *
 *  Simulates how long it takes N random walkers starting at the center
 *  of an N-by-N grid to visit every cell in the grid.
 *
 *************************************************************************/

public class RandomWalkers {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] x = new int[N];         // x positions
        int[] y = new int[N];         // y positions
        int cellsToVisit = N*N;       // cells left to visit
        int steps = 0;                // number of steps taken
        double r;
        boolean[][] visited = new boolean[N][N];  // has the i-j been visited?

        // start at center
        for (int i = 0; i < N; i++) {
            x[i] = N/2;
            y[i] = N/2;
        }
        visited[N/2][N/2] = true;
        cellsToVisit--;


        // repeat until all cells have been visited
        while (cellsToVisit > 0) {
            steps++;

            // move random walker i
            for (int i = 0; i < N; i++) {
                r = Math.random();
                if      (r <= 0.25) {  x[i]++;  }
                else if (r <= 0.50) {  x[i]--;  }
                else if (r <= 0.75) {  y[i]++;  }
                else if (r <= 1.00) {  y[i]--;  }

                // check if (x[i], y[i]) is inside N-by-N boundary and has been visited
                if (x[i] < N && y[i] < N && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
                    cellsToVisit--;
                    visited[x[i]][y[i]] = true;
                }
            }
        }

        System.out.println(steps);
    }

}
