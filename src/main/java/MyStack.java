public class MyStack {
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

}
