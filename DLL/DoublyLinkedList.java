package DLL;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length = 0;

    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int length() {
        return length;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void traverseHeadToTail() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void traverseTailToHead() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public void inserAtHead(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is already Empty!!");
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;

    }

    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertLast(1);
        DLL.insertLast(10);
        DLL.insertLast(15);
        DLL.insertLast(25);
        // DLL.inserAtHead(1);
        // DLL.inserAtHead(10);
        // DLL.inserAtHead(15);
        // DLL.inserAtHead(25);
        System.out.println("Traversing from Front to Back");
        DLL.traverseHeadToTail();
        System.out.println();

        System.out.println("Delete Frist Node");
    //    int firstNode = DLL.deleteFirst();
        DLL.deleteFirst();
        System.out.println("Traversing from Front to Back");
        DLL.traverseHeadToTail();
    }
}
