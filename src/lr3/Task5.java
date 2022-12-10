package lr3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input an amount of numbers for sum");
        int amount = in.nextInt();

//        Первая версия. С оператором цикла for
        System.out.println("Sum of");
        int sum = 0;
        for (int i = 1, j = 0; j < amount; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
                j++;
            }
        }
        System.out.println();
        System.out.println("is " + sum);

//        Вторая версия. С оператором цикла while
        System.out.println("Sum of");
        sum = 0;
        int i = 1, j = 0;
        while (j < amount) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
                j++;
            }
            i++;
        }
        System.out.println();
        System.out.println("is " + sum);
    }
}
