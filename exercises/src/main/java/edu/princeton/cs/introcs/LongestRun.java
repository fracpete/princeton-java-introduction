package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac LongestRun.java 
 *  Execution:    java LongestRun
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of integers and prints out both the integer
 *  that appears in a longest consecutive run and length of the run.
 *
 *  % java LongestRun
 *  1 2 2 1 5 1 1 7 7 7 7 1 1
 *  Ctrl-d
 *  Longest run: 4 consecutive 7s
 *
 *************************************************************************/

public class LongestRun {
    public static void main(String[] args) {

        // degenerate case with no input integers
        if (StdIn.isEmpty()) {
            StdOut.println("no longest consecutive run");
            return;
        }

        int prev = StdIn.readInt();
        int count = 1;
        int best      = prev;
        int bestCount = count;

        while (!StdIn.isEmpty()) {
            // read in the next value
            int current = StdIn.readInt();

            // update current run
            if (current == prev) count++;
            else {
                prev = current;
                count = 1;
            }

            // update champion values
            if (count > bestCount) {
                bestCount = count;
                best      = current;
            }
        }
      
        // output
        StdOut.println("Longest run: " + bestCount + " consecutive " + best + "s");
    }
}

