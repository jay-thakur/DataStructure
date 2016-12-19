package LinkedList;

public class BasicLinkedList {
    Node head;
    Methods methods;

    public static void main(String[] args) {
        BasicLinkedList linkedList = new BasicLinkedList();
        //creating head node
        linkedList.head = new Node(1);

        //creating other nodes
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        //connecting head node to second node & second node to third node.
        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        //printing linked list
        System.out.println("*********** Linked List Elements are ***********");
        new Methods().printList(linkedList.head);
    }
}
