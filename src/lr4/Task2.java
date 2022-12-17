package lr4;

public class Task2 {
    public static void main(String[] args) {
        int row = 11, col = 23;
        System.out.println("Triangle " + row + "x" + col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                if (j > i) {
                    break;
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
