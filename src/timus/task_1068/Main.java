package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        if (n > 0) {
            for(; n > 0; n--) {
                sum += n;
            }
        } else {
            for(; n <= 1; n++) {
                sum += n;
            }
        }

        System.out.println(sum);

        in.close();
    }
}
