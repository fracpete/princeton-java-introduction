package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac PercolationDirectedNonrecursive.java
 *  Execution:    java PercolationDirectedNonrecursive < input.txt
 *  Dependencies: StdArrayIO.java StdOut.java
 *
 *  % java PercolationDirectedNonrecursive < testT.txt
 *  6 6
 *  0 1 1 0 0 0 
 *  0 0 1 1 1 1 
 *  0 0 0 1 1 0 
 *  0 0 0 0 1 1 
 *  0 1 1 1 1 1 
 *  1 1 0 1 0 0 
 *  true
 *
 *  % java PercolationDirectedNonrecursive < testF.txt
 *  6 6
 *  0 1 0 1 0 0 
 *  1 1 1 0 0 0 
 *  1 0 1 1 0 0 
 *  0 0 0 1 1 1 
 *  0 0 0 0 0 1 
 *  0 0 0 0 0 0 
 *  false
 *
 *************************************************************************/

public class PercolationDirectedNonrecursive { 

    // given an N-by-N matrix of open sites, return an N-by-N matrix
    // of sites reachable from the top
    public static boolean[][] flow(boolean[][] open) {
        int N = open.length;
        boolean[][] full = new boolean[N][N];
        for (int j = 0; j < N; j++)
            full[0][j] = open[0][j];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean fill = false;
                for (int k = j; (k < N) && open[i][k]; k++)
                    fill = fill || full[i-1][k];
                for (         ; (j < N) && open[i][j]; j++)
                    if (fill) full[i][j] = true;
            }
        }
        return full;
    }

    // does the system percolate down
    public static boolean percolates(boolean[][] open) {
        boolean[][] full = flow(open);
        int N = full.length;
        for (int j = 0; j < N; j++)
            if (full[N-1][j]) return true;
        return false;
    }

    // draw the N-by-N boolean matrix to standard draw
    public static void show(boolean[][] a, boolean which) {
        int N = a.length;
        StdDraw.setXscale(-1, N);
        StdDraw.setYscale(-1, N);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (a[i][j] == which)
                    StdDraw.filledSquare(j, N-i-1, .5);
    }

    // return a random N-by-N boolean matrix, where each entry is
    // true with probability p
    public static boolean[][] random(int N, double p) {
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = StdRandom.bernoulli(p);
        return a;
    }

    // test client
    public static void main(String[] args) {
        boolean[][] open = StdArrayIO.readBoolean2D();
        StdArrayIO.print(flow(open));
        StdOut.println(percolates(open));
    }
} 
