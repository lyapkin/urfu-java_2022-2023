package timus2.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String result = "Named";
        int sum = 0;

        int[] marks = new int[num];
        for (int i = 0; i < num; i++) {
            marks[i] = in.nextInt();
            sum += marks[i];

            if (marks[i] == 3) {
                System.out.println("None");
                return;
            }
        }

        float avg = (float) sum/num;

        if (avg != 5 && avg >= 4.5) {
            result = "High";
        } else if (avg != 5) {
            result = "Common";
        }

        System.out.println(result);
    }
}
