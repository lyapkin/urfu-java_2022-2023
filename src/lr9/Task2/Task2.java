package lr9.Task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int column;
        int[][] arr = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = i+j;
            }
        }

        try {
            System.out.println("Введите номер столбца:");
            column = in.nextInt();
            int[] value = arr[column];
            System.out.println("Значение выбранного столбца -- " + Arrays.toString(value));
        } catch (InputMismatchException e) {
            System.out.println("Введенное значение не является целым положительным числом.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " Нет столбца с таким номером.");
        } finally {
            in.close();
        }
    }
}
