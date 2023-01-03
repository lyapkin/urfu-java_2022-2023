package timus.task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < n; i++) {
            String penguin = in.next() + " " + in.next();
            if (penguin.contains("Emperor")) {
                arr[0] += 1;
            } else if (penguin.contains("Macaroni")) {
                arr[1] += 1;
            } else if (penguin.contains("Little")) {
                arr[2] += 1;
            }
        }

        int maxIndx = 0;
        int max = -1;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndx = i;
            }
        }

        switch (maxIndx) {
            case 0:
                System.out.println("Emperor Penguin");
                break;
            case 1:
                System.out.println("Macaroni Penguin");
                break;
            case 2:
                System.out.println("Little Penguin");
        }

        in.close();
    }
}
