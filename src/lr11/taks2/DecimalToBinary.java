package lr11.taks2;

import java.util.Scanner;

public class DecimalToBinary {
    private static String bin(int x) {
        int result = x / 2;
        int reminder = x % 2;
        if (result == 0) return String.valueOf(reminder);
        return bin(result) + reminder;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int n = in.nextInt();

        System.out.println("Двоичное представление числа - " + bin(n));
    }
}
