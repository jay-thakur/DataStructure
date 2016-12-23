package LinkedList;

import java.util.LinkedList;
import java.util.List;

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

        //Search elements in linked list
        boolean isElementFound = linkedList.contains("F");
        if (isElementFound)
            System.out.println("List contains element 'F' ");
        else
            System.out.println("List does not contains element 'F' ");

        List<String> list = new LinkedList<>();
        list.add("F");
        list.add("G");

        boolean isAllListElementFound = linkedList.containsAll(list);
        if (isAllListElementFound)
            System.out.println("List contains element 'F' & 'G' ");
        else
            System.out.println("List does not contains element 'F' & 'G' ");

        //Length of linked list
        int size = linkedList.size();
        System.out.println("Linked list has "+size+" elements");

        //Get & set elements of linked list
        Object element = linkedList.get(2);
        System.out.println("Element " +element + " is returned by get()");

        linkedList.set(4, "F");
        System.out.println("Linked List after setting a value : "+linkedList );

        //Delete/Remove elements
        linkedList.remove(4);
        linkedList.removeLast();
        linkedList.removeFirst();
        System.out.println("Linked List after removing elements : "+linkedList );
    }
}
