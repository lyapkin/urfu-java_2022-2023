package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int divisor = 3;

        System.out.println("\n" + "Список:");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        System.out.println("\n" + "Делитель:" + "\n" + divisor);

        List<Integer> integersAfter = getDividableBy(integers, divisor);

        System.out.println("\n" + "Отфильтрованный список:");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> getDividableBy(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
