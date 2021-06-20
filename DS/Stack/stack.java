import java.util.NoSuchElementException;

import javax.xml.namespace.QName;

public class Stack{

    private ListNode top;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    Stack(){
        this.top=null;
        this.length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode temp= new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
        System.out.println("Element Inserted");
    }

    public void pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int res = top.data;
        top = top.next;
        length--;
        System.out.println("Element removed = "+res);
    }

    public void peek(){
        System.out.println(top.data);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.peek();
        st.pop();
        st.pop();
        st.pop();
        st.peek();
    }


}