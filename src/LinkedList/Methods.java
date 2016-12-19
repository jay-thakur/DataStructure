package LinkedList;

public class Methods {

    /* This function prints contents of linked list starting from head */
    public void printList(Node head){
        Node n = head;
        while (n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

}
