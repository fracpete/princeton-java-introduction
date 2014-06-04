package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Hyperbolic.java
 *  Execution:    java Hyperbolic x
 *  
 *  Static library of hyperbolic trigonometric functions.
 *
 *  Remark
 *  ------
 *  Java 1.5 includes more robust methods Math.sinh(),
 *  Math.cosh(), and Math.tanh().
 * 
 *************************************************************************/

public class Hyperbolic {

    public static double cosh(double x) {
        return (Math.exp(x) + Math.exp(-x)) / 2.0;
    }

    public static double sinh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / 2.0;
    }

    public static double tanh(double x) {
        return sinh(x) / cosh(x);
    }


    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("sinh(%f) = %f\n", x, sinh(x));
        StdOut.printf("cosh(%f) = %f\n", x, cosh(x));
        StdOut.printf("tanh(%f) = %f\n", x, tanh(x));
    }

}
