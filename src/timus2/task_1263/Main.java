package timus2.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int candidates = in.nextInt();
        int voters = in.nextInt();

        int[] votes = new int[candidates];
        for (int i = 0; i < voters; i++) {
            votes[in.nextInt()-1] += 1;
        }

        for (int i = 0; i < candidates; i++) {
            float result = ((float) votes[i]/voters) * 100;
            System.out.println(String.format("%.2f", result) + "%");
        }

        in.close();
    }
}
