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

    /**
     * method to count no of nodes in linked list
     * @param head node
     * @return count
     */
    public int getCount(Node head){
        int count = 0;
        Node node = head;
        while (node != null){
            node = node.next;
            count++;
        }
        return count;
    }

    /**
     * method to search element
     * @param head node
     * @param key element to search
     * @return boolean
     */
    public boolean searchElement(Node head, int key){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.data == key)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * method to reverse linked list in iterative way
     * @param head head node of linked list
     * @return previousNode
     */
    public Node reverseIterative(Node head){
        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    /**
     * method to reverse linked list in recursive way
     * @param node node of linked list
     * @return remainingNode
     */
    public Node reverseRecursive(Node node){

        if(node == null || node.next == null)
            return node;

        Node remainingNode = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return remainingNode;
    }

}
