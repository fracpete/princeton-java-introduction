package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac CombinationsK.java
 *  Execution:    java CombinationsK N k 
 *  
 *  Enumerates all subsets of size k on N elements in lexicographic order.
 *  Two different solutions. Uses some String library functions. 
 *
 *  % java CombinationsK 5 3
 *  abc
 *  abd
 *  abe
 *  acd
 *  ace
 *  ade
 *  bcd
 *  bce
 *  bde
 *  cde
 *
 *************************************************************************/

public class CombinationsK {

    // print all subsets that take k of the remaining elements, with given prefix 
    public  static void comb1(String s, int k) { comb1(s, "", k); }
    private static void comb1(String s, String prefix, int k) {
        if (s.length() < k) return;
        else if (k == 0) System.out.println(prefix);
        else {
            comb1(s.substring(1), prefix + s.charAt(0), k-1);
            comb1(s.substring(1), prefix, k);
        }
    }  


    // print all subsets that take k of the remaining elements, with given prefix 
    public  static void comb2(String s, int k) { comb2(s, "", k); }
    private static void comb2(String s, String prefix, int k) {
        if (k == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < s.length(); i++)
                comb2(s.substring(i + 1), prefix + s.charAt(i), k-1);
        }
    }  

    // read in N and k from command line, and print all subsets of size k from N elements
    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
       int k = Integer.parseInt(args[1]);
       String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String elements = alphabet.substring(0, N);

       comb1(elements, k);
       System.out.println();
       comb2(elements, k);
    }

}


