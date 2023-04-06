package lr13;

public class Task4 {
    public static void main(String[] args) {
        int size = 10;
        Thread[] arr = new Thread[size];

        for (int i = 1; i <= size; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            });
            t.setName(String.valueOf(i));
            arr[i-1] = t;
        }

        for (Thread t : arr) {
            t.start();
        }
    }
}
