import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode tail;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    CircularSinglyLinkedList() {
        this.length = 0;
        this.tail = null;
    }

    public void print() {
        if (tail == null) {
            return;
        }
        ListNode head = tail.next;
        while (head != tail) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.println(head.data + "-->null");
    }

    public void insertAtbeginning(int data) {
        ListNode newnode = new ListNode(data);
        if (tail == null) {
            tail = newnode;
        } else {
            newnode.next = tail.next;
        }
        tail.next = newnode;
        length++;
        System.out.println("Data Inserted at Beginning");
    }

    public void insertAtEnd(int data) {
        ListNode newnode = new ListNode(data);
        if (tail == null) {
            tail = newnode;
            tail.next = tail;
        } else {
            newnode.next = tail.next;
            tail.next = newnode;
            tail = newnode;
        }
        length++;
        System.out.println("Data Inserted at End");
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void removefirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail.next;
        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = temp.next;
        }
        temp.next = null;
        length--;
        System.out.println("removed = " + temp.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        cll.tail = fourth;

        cll.insertAtbeginning(0);
        cll.insertAtEnd(5);
        cll.removefirst();
        cll.print();
    }
}
