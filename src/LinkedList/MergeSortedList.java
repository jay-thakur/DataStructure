package LinkedList;

/**
 * This class is an implementation of merging two sorted list.
 */
public class MergeSortedList {

    Node head;
    static Methods methods = new Methods();

    public static void main(String[] args) {
        MergeSortedList list1 = new MergeSortedList();
        list1.head = new Node(5);
        Node secondList1 = new Node(10);
        Node thirdList1 = new Node(15);

        list1.head.next = secondList1;
        secondList1.next = thirdList1;
        System.out.println("First list --");
        methods.printList(list1.head);

        MergeSortedList list2 = new MergeSortedList();
        list2.head = new Node(2);
        Node secondList2 = new Node(12);
        Node thirdList2 = new Node(20);

        list2.head.next = secondList2;
        secondList2.next = thirdList2;
        System.out.println("\nSecond list --");
        methods.printList(list2.head);

        System.out.println("\n--------- After merging -- Recursive Way ----------");
        MergeSortedList resultList = new MergeSortedList();
        resultList.head = methods.mergeSortedRecursive(list1.head, list2.head);
        methods.printList(resultList.head);
    }
}
