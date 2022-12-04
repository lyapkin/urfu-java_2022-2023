package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number which can be divided by 5 and is not less than 10");
        int number = in.nextInt();

        boolean dividedBy4 = (number % 4 == 0);
        boolean ge10 = (number >= 10);

        if (dividedBy4 && ge10) {
            System.out.println("The number is correct");
        } else if (dividedBy4 && !ge10) {
            System.out.println("The number is less than 10");
        } else if (!dividedBy4 && ge10) {
            System.out.println("The number can't be divided by 4");
        } else {
            System.out.println("Both conditions hasn't been met");
        }
        in.close();
    }
}
