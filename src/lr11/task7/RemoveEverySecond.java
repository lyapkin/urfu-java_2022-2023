package lr11.task7;

import java.time.Instant;
import java.util.*;

public class RemoveEverySecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество человек:");
        int n = in.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        Instant start;
        Instant end;

        start = Instant.now();
        iterate(linkedList);
        end = Instant.now();
        System.out.println("list - " + end.compareTo(start)/1000000);

        start = Instant.now();
        iterate(arrayList);
        end = Instant.now();
        System.out.println("array - " + end.compareTo(start)/1000000);

        // ArrayList работает медленее поскольку при удалении элемента из середины или начала
        // ему приходдиться сдвигать все элементы следующие за удаленным, в отличии от LinkedList.
    }

    private static void iterate(List<Integer> list) {
        Iterator<Integer> it = list.listIterator();
        int i = 0;
        while (list.size() > 1) {
            i++;
            it.next();

            if (i % 2 == 0) {
                it.remove();
            }

            if (!it.hasNext()) it = list.listIterator();
        }
    }
}
