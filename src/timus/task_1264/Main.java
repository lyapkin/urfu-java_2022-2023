package timus.task_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int numOfPossible = in.nextInt()+1;

        System.out.println(length * numOfPossible);

        in.close();
    }
}
