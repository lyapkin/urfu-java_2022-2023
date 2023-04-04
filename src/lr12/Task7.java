package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        String str = "кипиш ниша закатило баня клава гарнизон покрышка";
        int lowLimit = 6;

        List<String> strings = List.of(str.split(" "));
        System.out.println("\n" + "Строки:");
        for (String e : strings) {
            System.out.println(e);
        }
        System.out.println("\n" + "Граница длины:" + "\n" + lowLimit);

        List<String> strList = filterByLength(strings, lowLimit);

        System.out.println(("\n" + "Строки с длиной больше границы:"));
        for (String e: strList) {
            System.out.println(e);
        }
    }

    public static List<String> filterByLength (List<String> list, int limit) {
        return list.stream()
                .filter(s -> s.length() > limit)
                .collect(Collectors.toList());
    }
}
