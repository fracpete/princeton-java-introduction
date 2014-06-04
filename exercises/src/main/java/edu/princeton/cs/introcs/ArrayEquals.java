package edu.princeton.cs.introcs;

/************************************************************************
 *  Compilation:  javac ArrayEquals.java
 *  Execution:    java ArrayEquals
 *
 *  The function eq() takes two integer array arguments and returns
 *  true if they have the same length and all corresponding pairs
 *  of integers are equal.
 *
 *  % java ArrayEquals
 *  true
 *  false
 *  true
 *  false
 *  
 *************************************************************************/

public class ArrayEquals {

    // return true if two integer arrays have same length and all
    // corresponding pairs of integers are equal
    public static boolean eq(int[] a, int[] b) {

        // same length?
        if (a.length != b.length) return false;

        // check each corresponding pair
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        // all elements must be equal
        return true;
    }


    // test client
    public static void main(String[] args) {
        int[] a = { 3, 1, 4, 1, 5 };
        int[] b = { 3, 1, 4, 1 };
        int[] c = { 3, 1, 4, 1, 5 };
        int[] d = { 2, 7, 1, 8, 2 };

        StdOut.println(eq(a, a));
        StdOut.println(eq(a, b));
        StdOut.println(eq(a, c));
        StdOut.println(eq(a, d));
    } 
} 
