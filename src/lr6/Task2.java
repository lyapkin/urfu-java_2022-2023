package lr6;

public class Task2 {
    public static void main(String[] args) {
        Class.showValue();
        Class.showValue();
        Class.showValue();
    }

    class Class {
        private static int i = 0;

        static void showValue() {
            System.out.println(i++);
        }
    }
}
