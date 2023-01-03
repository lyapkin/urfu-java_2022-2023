package timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] monitor = new int[n][n];
        int i = 0, j = 0;
        for (; i < n; i++) {
            for (; j < n; j++) {
                monitor[i][j] = in.nextInt();
            }
            j = 0;
        }

        i = j = 0;
        int iBound = 0;
        int jBound = 0;
        while (i != n && j != n) {
            System.out.println(monitor[i][j]);
            if (iBound == j) {
                j = iBound == n-1 ? ++jBound : 0;
                i = iBound == n-1 ? iBound : ++iBound;
            } else {
                i--;
                j++;
            }
        }

        in.close();
    }
}
