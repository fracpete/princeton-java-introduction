package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Fibonacci.java
 *  Execution:    java Fibonacci N
 *  
 *  Prints out the first N Fibonacci numbers.
 *
 *  % java Fibonacci 8
 *  1
 *  1
 *  2
 *  3
 *  5
 *  8
 *  13
 *  21
 *  34
 *  55
 *
 *************************************************************************/

public class Fibonacci {

   public static void main(String[] args) { 
      int N = Integer.parseInt(args[0]);
      int f = 0, g = 1;

      for (int i = 1; i <= N; i++) {
         f = f + g;
         g = f - g;
         System.out.println(f); 
      }
   }
}
