package lr11.taks1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fib(7, 0));
    }

    public static int fib(int n, int step) {
        space(step);
        System.out.println("fib " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2, step + 1) + fib(n - 1, step + 1);
        }
    }

    public static void space(int step) {
        for (int i = 0; i < step; i++) {
            System.out.print("|  ");
        }
    }
}
