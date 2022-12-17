package lr4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int row = 11, col = 23;
        System.out.println("Rectangle of 2s " + row + "x" + col);

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                arr[i][j] = 2;
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
