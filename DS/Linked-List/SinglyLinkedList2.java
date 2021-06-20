import java.util.List;

import javax.swing.text.html.StyleSheet.ListPainter;

public class SinglyLinkedList2 {

    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=next;
        }
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void middleElement(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println("Middle Element = "+slowPtr.data);
    }
 
    public void nthNodeFromEnd(int n){
        if (head==null){
            System.out.println("No nide present");
        }
        if(n<0){
            throw new IllegalArgumentException("Illegal arg is = "+n);
        }
        ListNode refPtr=head;
        ListNode mainPtr=head;
        int count=0;
        while(count<n){
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr=mainPtr.next;
        }
        System.out.println("nth element from end = "+mainPtr.data);
    }

    public boolean findLoop(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                System.out.println("Loop = "+true);
                return true;
            }
        }
        System.out.println("Loop = "+false);
        return false;
    }

    public ListNode startingNode(ListNode node){
        ListNode temp = head;
        ListNode slowPtr = node;
        while(temp!=slowPtr){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        return slowPtr;
    }

    public boolean findStartofLoop(){  // Floyd detection algo
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                startingNode(slowPtr);
                System.out.println("Starting point of loop = "+startingNode(slowPtr).data);
                return true;
            }
        }
        System.out.println("Loop = "+false);
        return false;
    }
    
    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr.next!=null && fastPtr!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if (slowPtr==fastPtr) {
                removeLoop(slowPtr);
                return;
            }
        }
        System.out.println("No LOOP");
    }
    public void removeLoop(ListNode slowPtr){
        ListNode temp= head;
        while(slowPtr.next!=temp.next){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=null;
        System.out.println("Loop Removed");
    }



    public static void main(String[] args) {
        SinglyLinkedList2 sll = new SinglyLinkedList2();
        sll.head=new ListNode(1);

        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
 
        sll.middleElement();
        sll.nthNodeFromEnd(1);
        sll.display();
        sll.findLoop();
        sll.findStartofLoop();
        sll.removeLoop();
     }
}
