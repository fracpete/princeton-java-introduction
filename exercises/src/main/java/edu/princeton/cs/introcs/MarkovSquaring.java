package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac MarkovSquaring.java
 *  Execution:    java MarkovSquaring T
 *  Dependencies: StdArrayIO.java Matrix.java
 *
 *  This program reads a transition matrix from standard input and
 *  computes the probabilities that a random surfer goes from page i
 *  to page j in 2^T steps.
 *
 *  % java Transition < tinyGraph.txt | java MarkovSquaring 5
 *  5 5
 *    0.27303   0.26573   0.14619   0.24723   0.06783 
 *    0.27303   0.26573   0.14619   0.24723   0.06783 
 *    0.27303   0.26573   0.14619   0.24723   0.06783 
 *    0.27303   0.26573   0.14619   0.24723   0.06783 
 *    0.27303   0.26573   0.14619   0.24723   0.06783 
 *
 *************************************************************************/

public class MarkovSquaring {

    public static void main(String[] args) { 

        // number of iterations of power method
        int T = Integer.parseInt(args[0]);

        // Transition matrix: p[i][j] = prob. that surfer moves from page i to 
        double[][] p = StdArrayIO.readDouble2D();

        // dimension of the transition matrix
        int N = p.length;

        // initialize the pagerank vector - any unit vector will do
        double[] rank = new double[N]; 
        rank[0] = 1.0; 

        // compute p^(2^T)
        for (int t = 0; t < T; t++) {
            p = Matrix.multiply(p, p);
        } 

        StdArrayIO.print(p);
    } 
} 
