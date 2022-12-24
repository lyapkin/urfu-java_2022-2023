package lr6;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(calcSumOfSquares(5));
    }

    static int calcSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }
}
