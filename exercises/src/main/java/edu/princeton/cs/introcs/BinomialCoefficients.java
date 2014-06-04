package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac BinomialCoefficients.java
 *  Execution:    java BinomialCoefficients N
 *
 *  Prints out binomial coefficients such that such that a[N][k] contains 
 *  the probability that you get exactly k heads when you toss a
 *  coin N times.
 *
 *  %  java BinomialCoefficients 7
 *  1/1 
 *  1/2 1/2 
 *  1/4 2/4 1/4 
 *  1/8 3/8 3/8 1/8 
 *  1/16 4/16 6/16 4/16 1/16 
 *  1/32 5/32 10/32 10/32 5/32 1/32 
 *  1/64 6/64 15/64 20/64 15/64 6/64 1/64 
 *
 *************************************************************************/

public class BinomialCoefficients {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int[][] pascal = new int[N+1][];

        // initialize first row
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;

        // fill in Pascal's triangle
        for (int n = 2; n <= N; n++) {
            pascal[n] = new int[n + 2];
            for (int k = 1; k < pascal[n].length - 1; k++)
                pascal[n][k] = pascal[n-1][k-1] + pascal[n-1][k];
        }

        // print binomial coefficients
        int denominator = 1;
        for (int n = 1; n <= N; n++) {
            for (int k = 1; k < pascal[n].length - 1; k++) {
                System.out.print(pascal[n][k] + "/" + denominator + " ");
            }
            System.out.println();
            denominator += denominator;
        }
    }

}
