package LinkedList;

public class BasicLinkedList {

    static Node head;
    static Methods methods = new Methods();

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
        methods.printList(linkedList.head);

        System.out.println("\n---------- Inserting Node at the tail ----------");
        methods.insertNodeAtTheTail(head, 4);
        //printing linked list
        System.out.println("*********** Linked List Elements After Inserting are ***********");
        methods.printList(linkedList.head);

        System.out.println("\n---------- Inserting Node at the front ----------");
        head = methods.insertNodeAtFront(head, 0);

        System.out.println("*********** Linked List Elements After Inserting at front are ***********");
        methods.printList(linkedList.head);
    }
}
