package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number which divided by 5 gives the remainder of 2 and divided by 7 gives the remainder of 1");
        int number = in.nextInt();

        int remainder5 = number % 5;
        int remainder7 = number % 7;

        if (remainder5 == 2 && remainder7 == 1) {
            System.out.println("The number is correct");
        } else if (remainder5 == 2 && remainder7 != 1) {
            System.out.println("The number can't be divided by 7 with the remainder of 1");
        } else if (remainder5 != 2 && remainder7 == 1) {
            System.out.println("The number can't be divided by 5 with the remainder of 2");
        } else {
            System.out.println("Both remainders aren't correct");
        }
        in.close();
    }
}
