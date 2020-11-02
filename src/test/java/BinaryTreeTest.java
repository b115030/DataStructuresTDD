import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    // add elements in BST using binary tree node and calculating size of BST
    @Test
    public void givenThreeNumbers_whenAddedToBST_shouldReturnSizeThree() {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }
    //UC3 searching elements in BST
    @Test
    public void givenANumberPresentInBST_whenSearchedInBST_shouldReturnTrue() {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        Integer[] elements = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
        for (Integer element : elements) {
            myBinaryTree.add(element);
        }
        boolean isPresent = myBinaryTree.search(63);
        Assert.assertEquals(true, isPresent);
    }

    @Test
    public void givenANumberAbsentInBST_whenSearchedInBST_shouldReturnFalse() {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        Integer[] elements = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
        for (Integer element : elements) {
            myBinaryTree.add(element);
        }
        boolean isPresent = myBinaryTree.search(77);
        Assert.assertEquals(false, isPresent);
    }
}
