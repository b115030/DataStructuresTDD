public class MyLinkedList<K> implements INode<K>{
    private K key;
    private INode<K> next;

    public MyLinkedList(K key) {
        this.key = key;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }

    public static boolean printWelcomeMsg() {
        System.out.println("Welcome Linked List");
        return true;
    }
}
