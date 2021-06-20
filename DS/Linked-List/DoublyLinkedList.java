import java.util.NoSuchElementException;

public class DoublyLinkedList {
    
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;

        ListNode(int data){
            this.data = data;
        }
    }
    DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    } 

    public void displayForward(){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displayBackword(){
        if(head==null){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void insertFirst(int data){
        ListNode newNode  = new ListNode(data);
        if (isEmpty()) {
            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
        }
        head = newNode;
        length++; 
    }
    
    public void insertLast(int data){
        ListNode newNode  = new ListNode(data);
        if (isEmpty()) {
            head=newNode;
        } else {
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }

    public void deleteFirst(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head==tail) {
            tail=null;
        }
        else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        System.out.println("Element Reoved = "+temp.data);
    }

    public void deleteLast(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head==tail) {
            head=null;
        }
        else{
            tail.prev.next=null;
        }
        tail= tail.prev;
        temp.prev=null;
        length--;
        System.out.println("Element Reoved = "+temp.data);
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList ();
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);

        dll.deleteFirst();
        dll.deleteLast();
        dll.displayForward();
        
    }
}
