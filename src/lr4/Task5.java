package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
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

        System.out.println("Transposed array");
        int[][] arr2 = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++){
                arr2[i][j] = arr[j][i];
            }
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
