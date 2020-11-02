public class BinaryTree<K extends Comparable<K>> {
    private BinaryTreeNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    // recursive function to add nodes
    private BinaryTreeNode<K> addRecursively(BinaryTreeNode<K> current, K key) {
        if (current == null)
            return new BinaryTreeNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(BinaryTreeNode<K> currentNode) {
        return currentNode == null ? 0
                : 1 + this.getSizeRecursively(currentNode.left) + this.getSizeRecursively(currentNode.right);
    }
    // recursive function to add nodes
    private boolean searchRecursively(BinaryTreeNode<K> current, K key) {
        if (current == null)
            return false;
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return true;
        if (compareResult < 0) {
            return searchRecursively(current.left, key);
        } else
            return searchRecursively(current.right, key);
    }
    // search a node for a given key value
    public boolean search(K key) {
        boolean isPresent = searchRecursively(this.root,key);
        return isPresent;
    }
}