package timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long row = in.nextInt();
        long column = in.nextInt();

        if (row <= column) {
            System.out.println(2 * row - 2);
        } else {
            System.out.println(2 * column - 1);
        }
        in.close();
    }
}
