class SinglyLinkedList1 {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null; 
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

    public void deleteAgivenKey(int key){
        ListNode current = head;
        ListNode temp =null;
        while (current!=null && current.data!=key){
            temp=current;
            current = current.next;
        }
        if(current==null){
            System.out.println("No key ");
        }
        temp.next=current.next;
    }

    public void insertNodeinsortedList(int data){
        ListNode current = head;
        ListNode temp = null;
        ListNode newnode = new ListNode(data);
        while(current!=null && current.data<newnode.data){
            temp = current;
            current=current.next;
        }
        newnode.next=current;
        
        temp.next=newnode;
        System.out.println("Node Inserted");
    }
     
    public void removeDuplicatefromSortedList(){
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }

    public static boolean searchKey(int data,ListNode head){
        if(head==null){
            return false;
        }
        ListNode current = head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public static ListNode reverseList(ListNode head){
        if(head==null)
        {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }



    public static void main(String[] args) {
        SinglyLinkedList1 sll = new SinglyLinkedList1();
        sll.head=new ListNode(1);

        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

        sll.deleteAgivenKey(4);
        sll.insertNodeinsortedList(4);
        sll.insertNodeinsortedList(4);
        sll.display();
        sll.removeDuplicatefromSortedList();
        boolean s = searchKey(10,sll.head); 
        System.out.println(s);
        sll.display();
        System.out.println(reverseList(sll.head).data); 
        sll.display();
    }
    
}
