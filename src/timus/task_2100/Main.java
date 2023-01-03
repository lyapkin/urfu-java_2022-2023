package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int peopleCount = 2;
        for (int i = 0; i < n; i++) {
            String answer = in.next();
            if (answer.contains("+one")) {
                peopleCount += 2;
            } else {
                peopleCount += 1;
            }
        }
        peopleCount = peopleCount == 13 ? peopleCount+1 : peopleCount;

        System.out.println(peopleCount * 100);

        in.close();
    }
}
