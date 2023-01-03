package timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        for (; n > 0; n--) {
            sum += n;
        }

        if (sum % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }

        in.close();
    }
}
