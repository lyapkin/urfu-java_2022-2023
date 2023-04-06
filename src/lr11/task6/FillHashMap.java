package lr11.task6;

import java.util.HashMap;

public class FillHashMap {
    static int product = 1;
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(10);

        hashMap.put(3, "Дом");
        hashMap.put(5, "Валидация");
        hashMap.put(12, "Исток");
        hashMap.put(2, "Два");
        hashMap.put(7, "Классика");
        hashMap.put(22, "Переправа");
        hashMap.put(1, "Право");
        hashMap.put(0, "Шаг");
        hashMap.put(9, "Салют");
        hashMap.put(31, "Дорога");

        hashMap.forEach((key, value) -> {
            if (key > 5) System.out.print("Строка с ключем > 5: " + value + "\n");
            if (key == 0) System.out.println(String.join(", ", hashMap.values()));
            if (value.length() > 5) product *= key;
        });

        System.out.println("\n" + "Произведение ключей с длиной строки > 5 - " + product);
    }
}
