package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac FunctionGrowth.java
 *  Execution:    java FunctionGrowth
 *
 *  Print out ln N, N, N log N, N^2, N^3 for N = 2, 4, 8, ..., 2048.
 *
 *  % java FunctionGrowth
 *  log N   N       N log N N^2     N^3
 *  0       2       1       4       8
 *  1       4       5       16      64
 *  2       8       16      64      512
 *  2       16      44      256     4096
 *  3       32      110     1024    32768
 *  4       64      266     4096    262144
 *  4       128     621     16384   2097152
 *  5       256     1419    65536   16777216
 *  6       512     3194    262144  134217728
 *  6       1024    7097    1048576 1073741824
 *  7       2048    15615   4194304 8589934592
 *  
 *************************************************************************/

public class FunctionGrowth {

   public static void main(String[] args) { 
      System.out.println("log N \tN \tN log N\tN^2 \tN^3");
      for (long i = 2; i <= 2048; i *= 2) {
         System.out.print((int) Math.log(i));
         System.out.print('\t');             // tab character
         System.out.print(i);
         System.out.print('\t');             
         System.out.print((int) (i * Math.log(i)));
         System.out.print('\t');             
         System.out.print(i * i);
         System.out.print('\t');             
         System.out.print(i * i * i);
         System.out.println();
      }
   }
}
