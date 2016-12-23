package LinkedList;

import java.util.LinkedList;

/**
 * A class to implement LinkedList class of java
 * LinkedList class implements list interface
 */
public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //Adding element to the linked list
        linkedList.add("B"); //add() - it appends the elements at the end of the list.
        linkedList.add("D");

        linkedList.addFirst("A"); //addFirst() - it appends the elements at the beginning of the list.
        linkedList.addLast("E"); //addLast() - it appends the elements at the end of the list.

        linkedList.add(2, "C"); //add(index, element) - it inserts the element at the given index.

        System.out.println("Linked List : "+linkedList );
    }
}
