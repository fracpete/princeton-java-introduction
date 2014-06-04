package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac MaxMin.java 
 *  Execution:    java MaxMin
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in integers from standard input and print out the maximum and
 *  minimum values.
 *
 *  % java MaxMin
 *  23 45 17 56 32
 *  89 10 53 32 34
 *  16
 *  Ctrl-d
 *  maximum = 89, minimum = 10
 *
 *************************************************************************/

public class MaxMin {
    public static void main(String[] args) {
    
        // first value read initialized min and max
        int max = StdIn.readInt();
        int min = max;
    
        // read in the data, keep track of min and max
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }
      
        // output
        StdOut.println("maximum  = " + max + ", minimum = " + min);
    }
}

