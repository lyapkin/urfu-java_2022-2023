package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        String str = "кипиш ниша баня клава";
        String substr = "иш";

        List<String> strings = List.of(str.split(" "));
        System.out.println("\n" + "Строки:");
        for (String e : strings) {
            System.out.println(e);
        }
        System.out.println("\n" + "Подстрока:" + "\n" + substr);

        List<String> subStrList = findSubStringsList(strings, substr);

        System.out.println(("\n" + "Строки содержащие подстроку:"));
        for (String e: subStrList) {
            System.out.println(e);
        }
    }

    public static List<String> findSubStringsList (List<String> list, String substr) {
        return list.stream()
                .filter(s -> s.contains(substr))
                .collect(Collectors.toList());
    }
}
