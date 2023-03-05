package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int length;
        int[] arr;
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите длину массива (целое положительное число):");

            length = in.nextInt();
            arr = new int[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Введите целое число:");
                arr[i] = in.nextInt();
            }

            int sum = 0, count = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] >= 0) {
                    sum += arr[i];
                    count++;
                }
            }

            System.out.println("Среднее значение положительных чисел -- " + sum/count);
        } catch (InputMismatchException e) {
            System.out.println(e + " Введенное значение не является целым числом.");
        } catch (NegativeArraySizeException e) {
            System.out.println(e + " Введенное число не является положительным.");
        } catch (ArithmeticException e) {
            System.out.println("В массиве нет положительных чисел.");
        } finally {
            in.close();
        }
    }
}
