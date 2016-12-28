package LinkedList;

public class ReverseLinkedList {

    private static Node head;
    private static Methods methods = new Methods();

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.head = new Node(1);

        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        methods.printList(linkedList.head);

        System.out.println("\n******** Reverse linked list Iterative way *******");

        head = methods.reverseIterative(linkedList.head);
        methods.printList(linkedList.head);

        System.out.println("\n******** Reverse linked list Recursive way *******");

        head = methods.reverseRecursive(head);
        methods.printList(linkedList.head);

    }
}
