public class LinkedListUtils {
    public INode head;
    public INode tail;

    public LinkedListUtils() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    // append node to the linked List
    public void append(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    // Insert nodes between nodes
    public void insert(INode firstNode, INode newNode) {
        INode tempNode = firstNode.getNext();
        firstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    // Delete first node
    public void pop() {
        if (this.head == null) {
            System.out.println("Empty linked list");
        } else {
            INode tempNode = this.head;
            this.head = tempNode.getNext();
        }
    }
    // delete last node
    public void popLastNode() {
        if (this.head == null && this.tail == null) {
            System.out.println("Empty linked list");
        } else {
            INode tempNode = this.head;
            while (tempNode.getNext() !=  this.tail) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            this.tail = tempNode;
        }
    }
}
