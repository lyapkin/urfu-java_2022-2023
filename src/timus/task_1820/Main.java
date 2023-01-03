package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int capacity = in.nextInt();
        int fullPans = n / capacity;
        int rest = n % capacity;

        if (capacity >= n) {
            System.out.println(2);
        } else if (n % capacity == 0) {
            System.out.println((n/capacity) * 2);
        } else if ((capacity / 2) >= rest) {
            System.out.println(fullPans * 2 + 1);
        } else {
            System.out.println(fullPans * 2 + 2);
        }

        in.close();
    }
}
