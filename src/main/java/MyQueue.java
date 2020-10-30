public class MyQueue<K extends Comparable<K>> {
    private final LinkedListUtils<K> linkedList;

    public MyQueue() {
        this.linkedList = new LinkedListUtils<>();
    }

    public void enqueue(INode<K> newNode) {
        linkedList.append(newNode);
    }

    public INode<K> peek() {
        return linkedList.head;
    }
}
