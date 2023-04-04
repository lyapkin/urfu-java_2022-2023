package lr11.task8;

import java.util.Arrays;

public class OneLinkedList {
    Node head;
    Node tail;
    int length;

    OneLinkedList(Node head, Node tail, int length) {
        this.head = head;
        this.tail = tail;
        this.length = length;
    }

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    static public OneLinkedList createHead(int[] arr) {
        if (arr.length > 0) {
            Node head = new Node(arr[0], null);
            Node ref = head;
            for (int i = 1; i < arr.length; i++) {
                ref.next = new Node(arr[i], null);
                ref = ref.next;
            }
            Node tail = ref;

            return new OneLinkedList(head, tail, arr.length);
        }

        return new OneLinkedList(null, null, 0);
    }

    static public OneLinkedList createTail(int[] arr) {
        if (arr.length > 0) {
            Node tail = new Node(arr[0], null);
            Node head = tail;
            for (int i = 1; i < arr.length; i++) {
                head = new Node(arr[i], head);
            }

            return new OneLinkedList(head, tail, arr.length);
        }

        return new OneLinkedList(null, null, 0);
    }

    @Override
    public String toString() {
        Node ref = this.head;
        String result = "";
        while (ref != null) {
            result = result.concat(ref.value + " ");
            ref = ref.next;
        }

        return result.stripTrailing();
    }

    public void addFirst(int value) {
        Node node = new Node(value, this.head);
        if (this.length > 0) {
            this.head = node;
        } else if (this.length == 0) {
            this.head = node;
            this.tail = node;
        }
        this.length++;
    }

    public void addLast(int value) {
        Node node = new Node(value, null);
        if (this.length > 0) {
            this.tail.next = node;
            this.tail = node;
        } else if (this.length == 0) {
            this.head = node;
            this.tail = node;
        }
        this.length++;
    }

    public void insert(int value, int index) {
        if (index > this.length || index < 0) {
            System.out.println("Невозможно вставить элемент за пределами списка.");
            return;
        }
        if (index == 0) {
            this.addFirst(value);
            return;
        }
        if (index == this.length) {
            this.addLast(value);
            return;
        }

        int current = 0;
        Node currentNode = this.head;
        Node prevNode = null;
        boolean done = false;
        while (!done && currentNode != null) {
            if (index == current) {
                prevNode.next = new Node(value, currentNode);
                this.length++;
                done = true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            current++;
        }
    }

    public void removeFirst() {
        if (this.length == 0) return;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.length--;
    }

    public void removeLast() {
        if (this.length == 0) return;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node node = this.head;
            while (node.next != this.tail) {
                node = node.next;
            }
            this.tail = node;
            node.next = null;
        }
        this.length--;
    }

    public void remove(int index) {
        if (index > this.length || index < 0) {
            System.out.println("Невозможно улаоить элемент за пределами списка.");
            return;
        }
        if (index == 0) {
            this.removeFirst();
            return;
        }
        if (index == this.length) {
            this.removeLast();
            return;
        }

        int current = 0;
        Node currentNode = this.head;
        Node prevNode = null;
        boolean done = false;
        while (!done && currentNode != null) {
            if (index == current) {
                prevNode.next = currentNode.next;
                this.length--;
                done = true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            current++;
        }
    }

    static public OneLinkedList createHeadRec(int[] arr) {
        if (arr.length == 0) return new OneLinkedList(null, null, 0);

        if (arr.length == 1) {
            Node node = new Node(arr[0], null);
            return new OneLinkedList(node, node, 1);
        }

        OneLinkedList list = createHeadRec(Arrays.copyOfRange(arr, 1, arr.length));
        list.head = new Node(arr[0], list.head);
        list.length++;

        return list;
    }

    static public OneLinkedList createTailRec(int[] arr) {
        if (arr.length == 0) return new OneLinkedList(null, null, 0);

        if (arr.length == 1) {
            Node node = new Node(arr[0], null);
            return new OneLinkedList(node, node, 1);
        }

        OneLinkedList list = createTailRec(Arrays.copyOfRange(arr, 1, arr.length));
        list.tail.next = new Node(arr[0], null);
        list.tail = list.tail.next;
        list.length++;

        return list;
    }

    public String toStringRec(Node ref) {
        if (ref == null) return "";

        String result = this.toStringRec(ref.next)
                            .concat(ref.value + " ");

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Используется массив: " + Arrays.toString(arr) + "\n");

        OneLinkedList headList = createHead(arr);
        System.out.println("Результат creatHead: " + headList);

        headList.addFirst(0);
        System.out.println("Результат addFirst(value: 0): " + headList);

        headList.insert(10, 1);
        System.out.println("Результат insert(value: 10, index: 1): " + headList);

        System.out.println("Результат insert(value: 10, index: -1): ");
        headList.insert(10, -1);

        headList.insert(-1, 0);
        System.out.println("Результат insert(value: -1, index: 0): " + headList);

        headList.removeFirst();
        System.out.println("Результат removeFirst(): " + headList);

        headList.remove(1);
        System.out.println("Результат remove(index: 1): " + headList);


        System.out.println();


        OneLinkedList tailList = createTail(arr);
        System.out.println("Результат creatTail: " + tailList);

        tailList.addLast(0);
        System.out.println("Результат addLast(value: 0): " + tailList);

        tailList.insert(10, 2);
        System.out.println("Результат insert(value: 10, index: 2): " + tailList);

        System.out.println("Результат insert(value: 10, index: 6): ");
        tailList.insert(10, 6);

        tailList.insert(-1, 5);
        System.out.println("Результат insert(value: -1, index: 5): " + tailList);

        tailList.removeLast();
        System.out.println("Результат removeLast(): " + tailList);

        tailList.remove(2);
        System.out.println("Результат remove(index: 2): " + tailList);


        System.out.println();


        OneLinkedList headListRec = createHeadRec(arr);
        System.out.println("Результат createHeadRec с использованием toStringRec: " + headListRec.toStringRec(headListRec.head));


        System.out.println();


        OneLinkedList tailListRec = createTailRec(arr);
        System.out.println("Результат createHeadRec с использованием toStringRec: " + tailListRec.toStringRec(tailListRec.head));
    }
}