package lr11.task5;

import lr11.task4.Node;

public class TailList {
    public Node head;

    TailList(int[] arr) {
        if (arr.length < 1) return;

        for (int i = arr.length-1; i >= 0; i--) {
            head = new Node(arr[i], head);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,9};
        TailList list = new TailList(arr);

        Node ref = list.head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
