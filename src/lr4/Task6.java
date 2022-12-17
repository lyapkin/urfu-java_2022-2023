package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int row = 3, col = 5;
        int[][] arr = new int[row][col];
        Random random = new Random();

        System.out.println("Initial array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(9);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] arr2 = new int[row-1][col-1];
        int drow = random.nextInt(row), dcol = random.nextInt(col);
        System.out.printf("Delete %s's row and %s's column\n", drow, dcol);
        for (int i = 0, i2 = 0; i < row; i++) {
            if (i == drow) {
                continue;
            }
            for (int j = 0, j2 = 0; j < col; j++) {
                if (j == dcol) {
                    continue;
                }
                arr2[i2][j2] = arr[i][j];
                j2++;
            }
            System.out.println(Arrays.toString(arr2[i2]));
            i2++;
        }
    }
}
