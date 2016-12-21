package LinkedList;

public class LengthOfLinkedList {

    static Node head;
    static Methods methods = new Methods();

    public static void main(String[] args) {
        LengthOfLinkedList linkedList = new LengthOfLinkedList();
        //creating head node
        linkedList.head = new Node(1);

        //creating other nodes
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        //connecting head node to second node & second node to third node.
        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        System.out.println("No of node : "+methods.getCount(head));
    }
}
