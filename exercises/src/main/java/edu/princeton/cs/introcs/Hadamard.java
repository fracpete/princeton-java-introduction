package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Hadamard.java
 *  Execution:    java Hadamard 16
 *  
 *  Prints the Hadamard matrix of order N. Assumes N is a power of 2.
 *
 *  % java Hadamard 2
 *  * * 
 *  * . 
 *
 *  % java Hadamard 4
 *  * * * * 
 *  * . * . 
 *  * * . . 
 *  * . . * 
 *
 *************************************************************************/

public class Hadamard { 
   public static void main(String[] args) { 
      int N = Integer.parseInt(args[0]);
      boolean[][] H = new boolean[N][N];

      // initialize Hadamard matrix of order N
      H[0][0] = true;
      for (int n = 1; n < N; n += n) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               H[i+n][j]   =  H[i][j];
               H[i][j+n]   =  H[i][j];
               H[i+n][j+n] = !H[i][j];
            }
         }
      }

      // print matrix
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {
            if (H[i][j]) System.out.print("* ");
            else         System.out.print(". ");
         }
         System.out.println();
      }
   }

}
