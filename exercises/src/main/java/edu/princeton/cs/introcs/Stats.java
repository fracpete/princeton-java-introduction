package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Stats.java
 *  Execution:    java Stats N
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a command-line integer N, a sequence of N real numbers from
 *  standard input, and prints the mean and standard deviation.
 *
 *  % java Stats 6
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  <Ctrl-d>
 *  Mean               = 10.5
 *  Standard deviation = 4.822862220714997
 *
 *  Note <Ctrl-d> signifies the end of file on Unix.
 *  On windows use <Ctrl-z>.
 *
 *************************************************************************/

public class Stats { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        double[] a = new double[N];

        // read data and compute statistics
        for (int i = 0; i < N; i++) {
            a[i] = StdIn.readDouble();
        }

        // compute mean
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        double mean = sum / N;

        // compute standard deviation
        double sum2 = 0.0;
        for (int i = 0; i < N; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stddev = Math.sqrt(sum2) / (N - 1);

        // print results
        StdOut.println("Mean               = " + mean);
        StdOut.println("Standard deviation = " + stddev);
    }
}
