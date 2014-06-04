package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Combinations.java
 *  Execution:    java Combinations N
 *  
 *  Enumerates all subsets of N elements using recursion.
 *  Uses some String library functions.
 *
 *  Both functions (comb1 and comb2) print them in alphabetical
 *  order; comb2 does not include the empty subset.
 *
 *  % java Combinations 3
 *  
 *  a
 *  ab
 *  abc
 *  ac
 *  b
 *  bc
 *  c
 *
 *  a
 *  ab
 *  abc
 *  ac
 *  b
 *  bc
 *  c
 *
 *  Remark: this is, perhaps, easier by counting from 0 to 2^N - 1 by 1
 *  and looking at the bit representation of the counter. However, this
 *  recursive approach generalizes easily, e.g., if you want to print
 *  out all combinations of size k.
 *
 *************************************************************************/

public class Combinations {

    // print all subsets of the characters in s
    public static void comb1(String s) { comb1("", s); }

    // print all subsets of the remaining elements, with given prefix 
    private static void comb1(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }  

    // alternate implementation
    public static void comb2(String s) { comb2("", s); }
    private static void comb2(String prefix, String s) {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++)
            comb2(prefix + s.charAt(i), s.substring(i + 1));
    }  


    // read in N from command line, and print all subsets among N elements
    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
       String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String elements = alphabet.substring(0, N);

       // using first implementation
       comb1(elements);
       System.out.println();

       // using second implementation
       comb2(elements);
       System.out.println();
    }

}


