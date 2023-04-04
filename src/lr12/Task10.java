package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int highLimit = 50;

        System.out.println("\n" + "Список:");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        System.out.println("\n" + "Верхняя граница:" + "\n" + highLimit);

        List<Integer> integersAfter = filterByHighLimit(integers, highLimit);

        System.out.println("\n" + "Числа меньше границы:");
        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterByHighLimit(List<Integer> list, int limit) {
        return list.stream()
                .filter(x -> x < limit)
                .collect(Collectors.toList());
    }
}
