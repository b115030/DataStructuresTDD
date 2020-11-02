public class HashTable<K extends Comparable<K>, V> {
    LinkedListUtils<K> myLinkedList;

    public HashTable() {
        this.myLinkedList = new LinkedListUtils<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.findNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.findNode(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + myLinkedList + "}" ;
    }
}
