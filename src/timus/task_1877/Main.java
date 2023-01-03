package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lock1 = in.nextInt();
        int lock2 = in.nextInt();

        if (lock1 % 2 == 0 || lock2 % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
