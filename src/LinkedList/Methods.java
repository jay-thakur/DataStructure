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

    /**
     * a method to delete element from list by position
     * @param head
     * @param position
     * @return
     */
    public Node deleteElementByPosition(Node head, int position){

        if (head == null)
            return head;

        //if head node to be removed
        Node previousNode = head;
        if (position == 0){
            head = previousNode.next; // change head
            return head;
        }
        //find previous node of the node to be deleted
        for (int i=0; previousNode != null && i<position-1; i++)
            previousNode = previousNode.next;

        // Node previousNode->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node temp = previousNode.next.next;
        //Unlink the previousNode->next
        previousNode.next = temp;
        //return head
        return head;
    }

    /**
     * a method to delete element by key
     * @param head
     * @param key
     * @return head
     */
    public Node deleteElementByKey(Node head, int key){
        Node node, previousNode = null;
        node = head;
        if ( node != null && node.data == key)
            return (head = node.next);
        while (node != null && node.data != key){
            previousNode = node;
            node =node.next;
        }
        previousNode.next = node.next;
        return head;
    }

    /**
     * a method to delete linked list
     * @param head head node of list
     * @return head
     */
    public Node deleteList(Node head){
        return (head = null);
    }

    /**
     * this method will merge two sorted list
     * @param head1 head node of list1
     * @param head2 head node of list2
     * @return resultHead
     */
    public Node mergeSortedRecursive(Node head1, Node head2){
        Node resultHead;
        //Base cases
        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;

        if (head1.data <= head2.data){
            resultHead = head1;
            resultHead.next = mergeSortedRecursive(head1.next, head2);
        }else{
            resultHead = head2;
            resultHead.next = mergeSortedRecursive(head1, head2.next);
        }
        return resultHead;
    }

}
