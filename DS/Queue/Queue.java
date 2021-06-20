import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (front == null) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
        System.out.println("Element Inserted");
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        int res = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        System.out.println("Element removed = " + res);
    }

    public void printQueue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void first() {
        System.out.println(front.data);
    }

    public void last() {
        System.out.println(rear.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.first();
        q.last();
        q.printQueue();
    }
}
