package lr11.comparison;

import java.util.*;

public class Get {
    static int n = 11 * 1000000;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            treeMap.put(i, i);
            arrayList.add(i);
        }

        System.out.println("Время выполнения операции получения по индексу arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции получения по индексу treeMap = " + getRunningTime(treeMap));
    }

    private static long getRunningTime(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.get(n/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTime(TreeMap<Integer, Integer> treeMap){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        treeMap.get(n/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
