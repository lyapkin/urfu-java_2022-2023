package lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");
        int a = in.nextInt();
        System.out.println("Input one more number");
        int b = in.nextInt();

//        Первая версия. С оператором цикла for
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for ( ; min <= max; min++) {
            System.out.print(min + " ");
        }

//        Вторая версия. С оператором цикла do while
        System.out.println();
        min = Math.min(a, b);
        do {
            System.out.print(min + " ");
            min++;
        } while (min <= max);

        in.close();
    }
}
