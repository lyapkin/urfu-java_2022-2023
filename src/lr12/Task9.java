package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String str = "кипиш ниша , 9закатило баня к?лава гарнизон покрышка";

        List<String> strings = List.of(str.split(" "));
        System.out.println("\n" + "Строки:");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> onlyLetters = getOnlyLetters(strings);

        System.out.println(("\n" + "Строки сдержащие только буквы:"));
        for (String e: onlyLetters) {
            System.out.println(e);
        }
    }

    public static List<String> getOnlyLetters (List<String> list) {
        return list.stream()
                .filter(s -> s.chars()
                        .allMatch(c -> Character.isLetter(c))
                       )
                .collect(Collectors.toList());
    }
}
