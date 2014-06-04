package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac BinaryToString.java
 *  Execution:    java BinaryToString N
 *  
 *  Prints out N in binary.
 * 
 *  % java BinaryToString 5
 *  101
 *
 *  % java BinaryToString 106
 *  1101010
 *
 *  % java BinaryToString 0
 *  0
 * 
 *  % java BinaryToString 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers or 0.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 *************************************************************************/

public class BinaryToString { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        String s = "";

        // repeatedly divide by two, and form the remainders backwards
        while (N > 0) {
            s = (N % 2) + s;
            N /= 2;
        }
        System.out.println(s);
   }
}
