package lr11.task3;

import java.util.Scanner;

public class RecursionArr {
    final private static Scanner in = new Scanner(System.in);
    private static int len;
    private static int[] arr;

    private static void inputArr(int index) {
        if (len == index) {
            System.out.println("Массив заполнен.\n");
            return;
        }

        System.out.println("Введите целое число:");
        arr[index] = in.nextInt();
        inputArr(index + 1);
    }

    private static void outputArr(int index) {
        if (len == index) return;

        System.out.print(arr[index] + " ");
        outputArr(index + 1);
    }
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        len = in.nextInt();

        arr = new int[len];

        int n = 0;
        inputArr(n);

        System.out.println("Значения находящиеся в массиве:");
        outputArr(n);
    }
}
