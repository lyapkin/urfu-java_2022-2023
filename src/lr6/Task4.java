package lr6;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(calcDoubleFactorial(6));
    }

    static int calcDoubleFactorial(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int result = n * calcDoubleFactorial(n - 2);

        return result;
    }
}
