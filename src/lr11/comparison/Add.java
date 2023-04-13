package lr11.comparison;

import java.util.*;

public class Add {
    static int n = 11 * 1000000;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Collections.nCopies(n, 0));
        Deque<Integer> arrayDeque = new ArrayDeque<>(Collections.nCopies(n, 0));

        System.out.println("Время выполнения операции добавления в начало arrayList = " + getRunningTimeBegin(arrayList));
        System.out.println("Время выполнения операции добавления в начало arrayDeque = " + getRunningTimeBegin(arrayDeque));

        System.out.println("Время выполнения операции добавления в конец arrayList = " + getRunningTimeEnd(arrayList));
        System.out.println("Время выполнения операции добавления в конец arrayDeque = " + getRunningTimeEnd(arrayDeque));

        System.out.println("Время выполнения операции добавления в середину arrayList = " + getRunningTimeMid(arrayList));
    }

    private static long getRunningTimeBegin(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.add(0, 0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeBegin(Deque<Integer> deque){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        deque.addFirst(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeEnd(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.add(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeEnd(Deque<Integer> deque){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        deque.add(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeMid(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.add(n/2,0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }


}
