package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Benford.java StdIn.java
 *  Execution:    java Benford < data.txt
 *  
 *  Reads in a sequence of integers and computes a frequency distribution
 *  of the number of times 1-9 is the leading (leftmost) digit.
 *
 *  Benford's law predicts that for many real-world data sets:
 *
 *   digit  frequency
 *   ----------------
 *       1       30.1
 *       2       17.6
 *       3       12.5
 *       4        9.7
 *       5        7.9
 *       6        6.7
 *       7        5.8
 *       8        5.1
 *       9        4.6
 *
 *  % java Benford < ../datafiles/princeton-files.txt
 *  1:  30.8%
 *  2:  19.3%
 *  3:  13.0%
 *  4:   9.9%
 *  5:   7.4%
 *  6:   5.9%
 *  7:   5.2%
 *  8:   4.4%
 *  9:   4.1%
 *
 *
 *************************************************************************/

public class Benford { 

   // return the leading digit of x, assuming x is positive
   public static int leadingDigit(int x) {
         while (x >= 10) {
            x = x / 10;
         }
         return x;
   }

   public static void main(String[] args) { 
      int[] count = new int[10];     // frequency of leading digit i
      int N = 0;                     // number of items read in

      while (!StdIn.isEmpty()) {
         int x = StdIn.readInt();       // read in next integer
         int digit = leadingDigit(x);   // compute leading digit
         count[digit]++;                // update frequency
         N++;
      }
   
      // print out frequency distribution
      for (int i = 1; i < 10; i++)
         StdOut.printf("%d: %6.1f%%\n", i, 100.0 * count[i] / N);
   }
}
