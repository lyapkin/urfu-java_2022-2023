package timus2.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int offer1 = in.nextInt();
        int step1 = in.nextInt();
        int offer2 = in.nextInt();
        int step2 = in.nextInt();

        if (offer1 >= offer2) {
            System.out.println(offer1);
            return;
        }
        if (offer1 + step1 >= offer2) {
            System.out.println(offer2);
            return;
        }

        int i = 1;
        while (offer1 < offer2) {
            if (i % 2 != 0) {
                offer1 += step1;
                if (offer1 > offer2 - step2) {
                    System.out.println(offer1);
                    return;
                }
            } else {
                offer2 -= step2;
                if (offer1 + step1 > offer2) {
                    System.out.println(offer2);
                    return;
                }
            }

            i++;

        }


        System.out.println(offer1);
    }
}
