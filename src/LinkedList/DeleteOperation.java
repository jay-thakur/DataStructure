package LinkedList;

public class DeleteOperation {

    private static Node head;
    private static Methods methods = new Methods();

    public static void main(String[] args) {
        DeleteOperation linkedList = new DeleteOperation();
        linkedList.head = new Node(1);

        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        methods.printList(linkedList.head);

        System.out.println("\n********** Deletion by position ***********");
        int position = 2;
        int listLength = methods.getCount(head);
        if (position >= listLength){
            System.out.println("There is no element at position "+position);
        }else{
            head = methods.deleteElementByPosition(head, position);
            System.out.println("\n------ After Deleting element at position "+position+" ------");
            methods.printList(head);
        }

        System.out.println("\n------ After Deleting ------");
        head = methods.deleteList(head);
        if (head == null)
            System.out.println("List deleted");
        else
            methods.printList(head);
    }
}
