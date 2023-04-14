package lr13;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 100;
        int[] arr = IntStream.generate(() -> random.nextInt(100))
                .limit(size)
                .toArray();

        System.out.println(Arrays.toString(arr));

        System.out.println("Максимальное значение: " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int cores = Runtime.getRuntime().availableProcessors();
        int lengthForThread = (int) Math.ceil((float) arr.length / cores);

        Thread[] threads = new Thread[cores];
        int[] maxFromThreads = new int[cores];
        for (int i = 0; i < cores; i++) {
            final int start = lengthForThread * i;
            final int end = Math.min(start + lengthForThread, arr.length);
            final int index = i;

            Thread t = new Thread(() -> {
                maxFromThreads[index] = Arrays.stream(arr, start, end)
                                             .max().getAsInt();
            });

            threads[i] = t;
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return Arrays.stream(maxFromThreads).max().orElseThrow();
    }
}
