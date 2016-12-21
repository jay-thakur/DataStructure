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

    /**
     * A method to insert node at the tail
     * @param head head node of linked list
     * @param data, to insert
     */
    public void insertNodeAtTheTail(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public Node insertNodeAtFront(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

}
