class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
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

    public void length(){
        if (head==null){
            System.out.println('0');
        }
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        System.out.println(count);
    }

    public void insertNodeAtBeginning(int data){
        ListNode newnode = new ListNode(data);
        newnode.next=head;
        head=newnode;
        System.out.println("Inserted at beginning");
    }

    

    public void insertNodeAtEnd(int data){
        ListNode newnode = new ListNode(data);
        if (head==null){
            head=newnode;
            System.out.println("Inserted at end");
        }
        ListNode current = head; 
        while(null!=current.next){
               current= current.next;
        }
        current.next= newnode;
        System.out.println("Inserted at end");
    }

    public void insertnodeAtgivenposition(int data , int pos){
        ListNode newnode = new ListNode(data);
        if (pos==1){
            newnode.next=head;
            head=newnode;
            System.out.println("Inserted at 0 position");
        }
        else{
            ListNode previous = head;
            int count=1;
            while(count<pos-1){
                previous= previous.next;
                count++;
            }
            ListNode current = previous.next;
            newnode.next = current;
            previous.next=newnode;
            System.out.println("Inserted at pos "+pos);
        }
    }

    public void  deletefirst(){
        if (head==null){
            System.out.println("Empty List");
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        System.out.println("deleted 1st data successfully");
    }
    
    public void deleteLast(){
        if (head==null || head.next==null){
            System.out.println("Empty List");
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous=current;  
            current = current.next;
        }
        previous.next=null;
        System.out.println("Deleted last element");
    }

    public void deletenodeatgivenPosition(int pos){
        if (pos==1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count=1;
            while(count<pos-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            System.out.println("Deleted node at given pos");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.insertNodeAtBeginning(20);

        sll.insertNodeAtEnd(30);

        sll.insertnodeAtgivenposition(100, 3);

        sll.deletefirst();

        sll.deleteLast();

        sll.deletenodeatgivenPosition(2);
        
        sll.display();

        sll.length();
    }
    
}
    