package timus.task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int left = number.charAt(0)-48 + number.charAt(1)-48 + number.charAt(2)-48;
        int right = number.charAt(3)-48 + number.charAt(4)-48 + number.charAt(5)-48;

        if (left > right && number.charAt(5)-48 != 9) {
            System.out.println("Yes");
        } else if (right > left && number.charAt(5)-48 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        in.close();
    }
}
