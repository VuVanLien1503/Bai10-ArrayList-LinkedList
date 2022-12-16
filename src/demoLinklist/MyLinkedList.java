package demoLinklist;

import java.util.LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    class Node{
        private Object data; // element/ value
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data) {
         Node temp = head;
         if(index > 0 ){
             for(int i=0; i<index-1 && temp.next!=null; i++){
                 temp = temp.next;
             }

             Node holder = temp.next; // index 1 = null
             temp.next = new Node(data); // moi
             temp.next.next = holder; // null
         }
         else {
             head = new Node(data);
             head.next = temp;
         }
         numNodes++;
    }
    public void set(int index ,Object data){
        Node temp=head;
        if (index>0){
            for(int i=0; i<index && temp.next!=null; i++){
                    temp= temp.next;
            }
            Node holder=new Node(data);
            temp.next=holder;
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index){
        Node temp = head;
        if(index > 0) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        else {
            head = head.next;
        }
        numNodes--;
    }

    public int size(){
        return numNodes;
    }


}
