package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        int total = 12;
        int minutesForOneTask = 45;
        int restOfMinutes = 4 * 60;

        int neededTime = (total - amount) * minutesForOneTask;

        if (neededTime <= restOfMinutes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
