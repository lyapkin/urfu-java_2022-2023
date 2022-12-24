package lr6;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 2, 8};
        System.out.println(getMean(arr));
    }

    static int getMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum / arr.length;
    }
}
