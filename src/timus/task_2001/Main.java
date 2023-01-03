package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        in.nextInt();
        int bucketB = in.nextInt();
        int bucketA = in.nextInt();
        in.nextInt();

        System.out.println((a-bucketA) + " " + (b-bucketB));

        in.close();
    }
}
