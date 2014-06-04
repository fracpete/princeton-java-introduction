package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Transpose.java
 *  Execution:    java Transpose 9
 *  
 *  Transpose an N-by-N matrix in-place, without creating a second
 *  2D array.
 *
 *  Submitted by Christian Rubio.
 *
 *************************************************************************/


public class Transpose {

    public static void main(String[] args) {

        // create N-by-N matrix
        int N = Integer.parseInt(args[0]);
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = N*i + j;
            }
        }

        // print out initial matrix
        System.out.println("Before");
        System.out.println("------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // transpose in-place
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // print out transposed matrix
        System.out.println();
        System.out.println("After");
        System.out.println("------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }
}
