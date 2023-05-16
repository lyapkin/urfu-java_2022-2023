package timus2.task_2111;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int citiesNum = in.nextInt();

        long sum = 0;
        int[] lengths = new int[citiesNum];
        for (int i = 0; i < citiesNum; i++) {
            lengths[i] = in.nextInt();
            sum += lengths[i];
        }

        Arrays.sort(lengths);

        long result = 0;
        for (int i = 0; i < citiesNum; i++) {
            result += lengths[i] * sum + lengths[i] * (sum -= lengths[i]);
        }

        System.out.println(result);
    }
}
