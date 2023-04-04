package lr11.taks1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fib(7, "\'start\'"));
    }

    public static int fib(int n, String parent) {
        if (n == 0) {
            System.out.println("родитель fib " + parent + " -> " + "потомок fib " + n);
            return 0;
        } else if (n == 1) {
            System.out.println("родитель fib " + parent + " -> " + "потомок fib " + n);
            return 1;
        } else {
            System.out.print("родитель fib " + parent + " -> " + "потомок fib " + n + " | ");
            return fib(n - 2, "" + n) + fib(n - 1, "" + n);
        }
    }
}
