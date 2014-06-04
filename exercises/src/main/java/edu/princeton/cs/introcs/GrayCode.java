package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac GrayCode.java
 *  Execution:    java GrayCode N
 *  
 *  Print the N-bit binary reflected Gray code using recursion.
 *
 *  % java GrayCode 3
 *  000 
 *  001
 *  011
 *  010
 *  110 
 *  111
 *  101
 *  100
 *
 *************************************************************************/

public class GrayCode {

    // append reverse of order n gray code to prefix string, and print
    public static void yarg(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
    }  

    // append order n gray code to end of prefix string, and print
    public static void gray(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
    }  


    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        gray("", N);
    }

}


