package LinkedList;

/**
 * A class for searching element in linked list
 */
public class SearchElement {

    private static Node head;
    private static Methods methods = new Methods();

    public static void main(String[] args) {
        SearchElement linkedList = new SearchElement();
        linkedList.head = new Node(11);

        Node secondNode = new Node(2);
        Node thirdNode = new Node(31);
        Node fourthNode = new Node(49);

        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        boolean isElementFound = methods.searchElement(head, 31);
        if (isElementFound)
            System.out.println("Element is found");
        else
            System.out.println("Element is not found");
    }
}
