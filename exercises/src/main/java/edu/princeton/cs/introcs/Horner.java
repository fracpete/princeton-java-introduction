package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Horner.java
 *  Execution:    java Horner
 *  
 *  A static method for evaluating a polynomial using Horner's method.
 *
 *  The test client takes a command-line argument N, computes N terms
 *  of the Taylor series e^x = 1 + x + x^2/2! + ..., and reads in
 *  values x from standard input, and prints out the polynomial
 *  evaluates at x (and compares it against Math.exp(x)).
 *
 *  % java java Horner 30
 *  0
 *  1.0
 *  1.0
 *
 *  1
 *  2.718281828459045
 *  2.7182818284590455
 *
 *  2
 *  7.38905609893065
 *  7.38905609893065
 * 
 *  .5
 *  1.6487212707001282
 *  1.6487212707001282
 *
 *  -.1
 *  0.9048374180359595
 *  0.9048374180359595
 *
 *************************************************************************/

public class Horner { 

    // use Horner's method to compute and return the polynomial evaluated at x
    // p[0] + p[1] x^1 + p[2] x^2 + ... + p[N-1] x^N-1 
    public static double eval(double x, double[] p) {
        double result = 0;
        for (int i = p.length - 1; i >= 0; i--)
            result = p[i] + (x * result);
        return result;
    }

    public static void main(String[] args) { 
        int N  = Integer.parseInt(args[0]);

        // compute coeffients for Taylor series e^x = 1 + x + x^2/2! + x^3/3! + ...
        double[] p = new double[N];
        p[0] = 1;
        for (int i = 1; i < N; i++) {
            p[i] = p[i-1] / i;
        }

        // evaluate the polynomial at values x read from standard input
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            StdOut.println(eval(x, p));
            StdOut.println(Math.exp(x));
            StdOut.println();
        }
    }
}
