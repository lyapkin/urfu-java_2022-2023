package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number and I'll say how many thousandths in it");
        int number = in.nextInt();

        System.out.println(number / 1000 % 10);
        in.close();
    }
}
