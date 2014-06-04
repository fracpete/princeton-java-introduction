package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac McCarthy.java
 *  Execution:    java McCarthy N
 *  
 *  Read in a command line parameter N and compute McCarthy's 91
 *  function at N.
 *
 *  % java McCarthy  java McCarthy 0
 *  91
 *
 *  % java McCarthy  java McCarthy 10
 *  91
 *
 *  % java McCarthy  java McCarthy 90
 *  91
 *
 *  % java McCarthy  java McCarthy 91
 *  91
 *
 *  % java McCarthy  java McCarthy 99
 *  91
 *
 *  % java McCarthy  java McCarthy 100
 *  91
 *
 *  % java McCarthy  java McCarthy 101
 *  91
 *
 *  % java McCarthy  java McCarthy 102
 *  92
 *
 *  % java McCarthy  java McCarthy 103
 *  93
 *
 *  % java McCarthy  java McCarthy 104
 *  94
 *
 *
 *************************************************************************/


public class McCarthy {

   public static int mcCarthy(int n) {
      if (n > 100)
         return n - 10;
      return mcCarthy(mcCarthy(n+11));
   }

   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);
      System.out.println(mcCarthy(N));
   }
}
