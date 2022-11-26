package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");
        int number = in.nextInt();

        System.out.printf("%d, %d, %d, %d", number-1, number, number+1, (int) Math.pow(number, 2));
        in.close();
    }
}
