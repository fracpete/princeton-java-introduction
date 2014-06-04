package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac WordCount.java 
 *  Execution:    java WordCount
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of strings from standard input and print out
 *  the number of strings read in.
 *
 *  % java WordCount
 *  it was the best of times
 *  it was the worst of times
 *  number of words  = 12
 *  Ctrl-d
 *
 *  % java WordCount < tale.txt 
 *  number of words  = 139043
 *
 *************************************************************************/

public class WordCount {
    public static void main(String[] args) {

        int count = 0;    
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
        }
      
        // output
        StdOut.println("number of words  = " + count);
    }
}

