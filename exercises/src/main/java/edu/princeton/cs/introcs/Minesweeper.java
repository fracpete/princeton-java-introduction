package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Minesweeper.java
 *  Execution:    java Minesweeper M N p
 *  
 *  Creates an MxN minesweeper game where each cell is a bomb with
 *  probability p. Prints out the MxN game and the neighboring bomb
 *  counts.
 *
 *  Sample execution:
 *
 *      % java Minesweeper  5 10 0.3
 *      * . . . . . . . . * 
 *      . . . . . . * . . . 
 *      . . . . . . . . * * 
 *      . . . * * * . . * . 
 *      . . . * . . . . . . 
 *
 *      * 1 0 0 0 1 1 1 1 * 
 *      1 1 0 0 0 1 * 2 3 3 
 *      0 0 1 2 3 3 2 3 * * 
 *      0 0 2 * * * 1 2 * 3 
 *      0 0 2 * 4 2 1 1 1 1 
 *
 *
 *************************************************************************/

public class Minesweeper { 
   public static void main(String[] args) { 
      int M = Integer.parseInt(args[0]);
      int N = Integer.parseInt(args[1]);
      double p = Double.parseDouble(args[2]);
      
      // game grid is [1..M][1..N], border is used to handle boundary cases
      boolean[][] bombs = new boolean[M+2][N+2];
      for (int i = 1; i <= M; i++)
         for (int j = 1; j <= N; j++)
            bombs[i][j] = (Math.random() < p);

      // print game
      for (int i = 1; i <= M; i++) {
         for (int j = 1; j <= N; j++)
            if (bombs[i][j]) System.out.print("* ");
            else             System.out.print(". ");
         System.out.println();
      }

      // sol[i][j] = # bombs adjacent to cell (i, j)
      int[][] sol = new int[M+2][N+2];
      for (int i = 1; i <= M; i++)
         for (int j = 1; j <= N; j++)
            // (ii, jj) indexes neighboring cells
            for (int ii = i - 1; ii <= i + 1; ii++)
               for (int jj = j - 1; jj <= j + 1; jj++)
                  if (bombs[ii][jj]) sol[i][j]++;

      // print solution
      System.out.println();
      for (int i = 1; i <= M; i++) {
         for (int j = 1; j <= N; j++)
            if (bombs[i][j]) System.out.print("* ");
            else             System.out.print(sol[i][j] + " ");
         System.out.println();
      }

   }
}
