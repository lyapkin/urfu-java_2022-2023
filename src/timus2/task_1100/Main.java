package timus2.task_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(in.readLine());

            int[][] scores = new int[num][2];
            for (int i = 0; i < num; i++) {
                String[] line = in.readLine().split(" ");
                scores[i][0] = Integer.parseInt(line[0]);
                scores[i][1] = Integer.parseInt(line[1]);
            }

            Arrays.sort(scores, new Sort());

            Arrays.stream(scores).forEach(arr -> System.out.println(arr[0] + " " + arr[1]));
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    static public class Sort implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return b[1] - a[1];
        }
    }

}
