package lr11.task5;

public class HeadList {
    public Node head;

    HeadList(int[] arr) {
        if (arr.length < 1) return;

        head = new Node(arr[0], null);
        Node ref = head;
        for (int i = 1; i < arr.length; i++) {
             Node node = new Node(arr[i], null);
             ref.next = node;
             ref = node;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,9};
        HeadList list = new HeadList(arr);

        Node ref = list.head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
