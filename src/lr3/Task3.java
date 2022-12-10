package lr3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number for Fibonacci sequence");
        int number = in.nextInt();

//        Первая версия. С оператором цикла while
        int i = 1, prev2 = 0, prev1 = 1, sum = 1;
        System.out.print(sum + " ");
        while (i < number) {
            sum = prev1 + prev2;
            System.out.print(sum + " ");

            prev2 = prev1;
            prev1 = sum;

            i++;
        }

//        Вторая версия. С оператором цикла do while
        System.out.println();
        i = 1;
        prev2 = 0;
        prev1 = 1;
        sum = 1;
        System.out.print(sum + " ");
        do {
            sum = prev1 + prev2;
            System.out.print(sum + " ");

            prev2 = prev1;
            prev1 = sum;

            i++;
        } while (i < number);

        in.close();
    }
}
