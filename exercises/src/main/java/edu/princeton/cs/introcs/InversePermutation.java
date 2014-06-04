package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac InversePermutation.java
 *  Execution:    java InversePermutation 5 0 2 3 1 4
 *  
 *  Read in a permutation from the command line and print out the inverse
 *  permutation.
 *
 *    % java InversePermutation 5 0 2 3 1 4
 *    2 3 4 5 1 0 
 *
 *************************************************************************/

public class InversePermutation { 
   public static void main(String[] args) { 

      int N = args.length;

      // read in permutation
      int[] a    = new int[N];
      for (int i = 0; i < N; i++)
         a[i] = Integer.parseInt(args[i]);

      // check if valid
      boolean[] exists = new boolean[N];
      for (int i = 0; i < N; i++) {
         if (a[i] < 0 || a[i] >= N || exists[a[i]])
             throw new RuntimeException("Input is not a permutation.");
         exists[a[i]] = true;
      }

      // invert
      int[] ainv = new int[N];
      for (int i = 0; i < N; i++)
         ainv[a[i]] = i;


      // print out
      for (int i = 0; i < N; i++)
         System.out.print(ainv[i] + " ");
      System.out.println();
   }
}
