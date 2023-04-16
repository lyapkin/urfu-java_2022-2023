package lr11.comparison;

import java.util.*;

public class Remove {
    static int n = 11 * 1000000;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            treeMap.put(i, i);
            arrayList.add(i);
            arrayDeque.add(i);
        }

        System.out.println("Время выполнения операции удаления в начале arrayList = " + getRunningTimeBegin(arrayList));
        System.out.println("Время выполнения операции удаления в начале arrayDeque = " + getRunningTimeBegin(arrayDeque));
        System.out.println("Время выполнения операции удаления в начале treeMap = " + getRunningTimeBegin(treeMap));

        System.out.println("Время выполнения операции удаления в конеце arrayList = " + getRunningTimeEnd(arrayList));
        System.out.println("Время выполнения операции удаления в конеце arrayDeque = " + getRunningTimeEnd(arrayDeque));
        System.out.println("Время выполнения операции удаления в конеце treeMap = " + getRunningTimeEnd(treeMap));

        System.out.println("Время выполнения операции удаления в середине arrayList = " + getRunningTimeMid(arrayList));
        System.out.println("Время выполнения операции удаления в середине treeMap = " + getRunningTimeMid(treeMap));
    }

    private static long getRunningTimeBegin(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.remove(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeBegin(Deque<Integer> deque){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        deque.removeFirst();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeBegin(TreeMap<Integer, Integer> treeMap){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        treeMap.pollFirstEntry();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeEnd(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.remove(list.size() - 1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeEnd(Deque<Integer> deque){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        deque.removeLast();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeEnd(TreeMap<Integer, Integer> treeMap){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        treeMap.pollLastEntry();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeMid(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.remove(n/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeMid(SortedMap<Integer, Integer> treeMap){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        treeMap.remove(n/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
