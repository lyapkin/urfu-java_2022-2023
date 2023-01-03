package timus.task_1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int moves = 0;
        for (int i = 0; i < n; i++) {
            String place = in.next();
            if (place.charAt(0) - 2 >= 'a') {
                if (place.charAt(1) - 1 >= '1') {
                    moves += 1;
                }
                if (place.charAt(1) + 1 <= '8') {
                    moves += 1;
                }
            }
            if (place.charAt(0) + 2 <= 'h') {
                if (place.charAt(1) - 1 >= '1') {
                    moves += 1;
                }
                if (place.charAt(1) + 1 <= '8') {
                    moves += 1;
                }
            }
            if (place.charAt(1) - 2 >= '1') {
                if (place.charAt(0) - 1 >= 'a') {
                    moves += 1;
                }
                if (place.charAt(0) + 1 <= 'h') {
                    moves += 1;
                }
            }
            if (place.charAt(1) + 2 <= '8') {
                if (place.charAt(0) - 1 >= 'a') {
                    moves += 1;
                }
                if (place.charAt(0) + 1 <= 'h') {
                    moves += 1;
                }
            }

            System.out.println(moves);
            moves = 0;
        }

        in.close();
    }
}
