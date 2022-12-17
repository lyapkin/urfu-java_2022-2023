package lr4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int row = 4, col = 5;
        int[][] arr = new int[row][col];
        Random random = new Random();

        System.out.println("The order of filling an array (indexes)");
        for (int i = 0; i < row; i++) {
            int j;
            System.out.println("Row");
            for (j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(9);
                System.out.print("[" + i + " " + j + "]" +  "  ");
            }
            j--;
            System.out.println("\nColumn");
            for (int d = i+1; d < row; d++) {
                arr[d][j] = random.nextInt(9);
                System.out.print("[" + d + " " + i + "]" +  "  ");
            }
            col--;
            System.out.println();
        }
    }
}
