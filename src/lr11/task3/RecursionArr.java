package lr11.task3;

import java.util.Scanner;

public class RecursionArr {
    private static Scanner in = new Scanner(System.in);
    private static int len;
    private static int[] arr;

    private static void inputArr(int n) {
        if (len == n) {
            System.out.println("Массив заполнен.\n");
            return;
        }

        System.out.println("Введите целое число:");
        arr[n] = in.nextInt();
        inputArr(n + 1);
    }

    private static void outputArr(int n) {
        if (len == n) return;

        System.out.print(arr[n] + " ");
        outputArr(n + 1);
    }
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        len = in.nextInt();

        arr = new int[len];

        int n = 0;
        inputArr(n);

        n = 0;
        System.out.println("Значения находящиеся в массиве:");
        outputArr(n);
    }
}
