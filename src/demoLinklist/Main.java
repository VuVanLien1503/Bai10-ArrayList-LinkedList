package demoLinklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(3);
        myLinkedList.add(0, 2);
        myLinkedList.add(3, 5);
        myLinkedList.add(0, 0);
//        myLinkedList.add(0, 3);

        myLinkedList.printList();
        System.out.println("size = " + myLinkedList.size());
        myLinkedList.remove(0);
        myLinkedList.printList();
        System.out.println("new size " + myLinkedList.size());

        myLinkedList.set(1,4);
        myLinkedList.printList();
        System.out.println("new size " + myLinkedList.size());
        myLinkedList.add(5, 7);
        myLinkedList.add(4, 8);
        myLinkedList.printList();
        System.out.println("new size " + myLinkedList.size());
    }
}
