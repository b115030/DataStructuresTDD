public class MyLinkedList<K> {
    private K key;
    private MyLinkedList next;

    // constructor
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

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    public static boolean printWelcomeMsg() {
        System.out.println("Welcome to the find maximum using generics problem.");
        return true;
    }
}
