package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac HugeArray.java
 *  Execution:    java HugeArray
 *
 *  Attempts to create an array of size N^4 for N = 1000.
 *
 *  This program compiles cleans.
 *  When N is 1000, it leads to the following error
 *
 *      java.lang.NegativeArraySizeException
 * 
 *  because 1000^4 overflows an int and results in a negative integer.
 *
 * 
 *
 *  When N is 200, it leads to the following error
 *
 *      java.lang.OutOfMemoryError: Requested array size exceeds VM limit
 *
 *
 *************************************************************************/

public class HugeArray { 

    public static void main(String[] args) { 
        int N = 1000;
        int[] a = new int[N*N*N*N];
    }
}
