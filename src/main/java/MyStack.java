public class MyStack<K extends Comparable<K>> {
    private final LinkedListUtils linkedList;

    public MyStack() {
        this.linkedList = new LinkedListUtils<>();
    }

    public void push(INode myNode) {
        linkedList.add(myNode);
    }

    public INode peek() {
        return linkedList.head;
    }
    public void pop() {
        linkedList.pop();
        System.out.println("after stack pop");
        linkedList.printLinkedList();
    }

    public boolean isStackEmpty() {
        if (linkedList.getSize() >0) {
            return false;
        }
        return true;
    }

}
