import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void whenCallWelcomeMethod_shouldReturnTrue() {
        boolean welcomeReturns = MyLinkedList.printWelcomeMsg();
        Assert.assertEquals(true, welcomeReturns);
    }

    //UC1 test case to create simple linked list
    @Test
    public void givenThreeElements_whenInALinkedList_shouldPassLinkedListTest() {
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode = new MyLinkedList<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    // UC2 test cases to add elements to Linked list
    @Test
    public void given3elementsWhenLinkedShouldBeAddedToTop() {
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(70);
        LinkedListUtils linkedList = new LinkedListUtils();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenThreeElements_whenLinked_shouldBeAddedAtEnd() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils linkedList = new LinkedListUtils();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    // UC4 insert a node between two nodes
    @Test
    public void givenTwoNodes_shouldInsertThirdNodeBetweenThem() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils linkedList = new LinkedListUtils();
        linkedList.append(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    //UC5 delete first node of linked list
    @Test
    public void givenThreeNode_shouldDeleteFirstNode() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils linkedList = new LinkedListUtils();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.pop();
        boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode)
                && linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    // UC6 delete last node of linked list
    @Test
    public void givenThreeNode_shouldDeleteLastNode() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils linkedList = new LinkedListUtils();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.popLastNode();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
                && linkedList.tail.equals(secondNode);
        Assert.assertTrue(result);
    }
}

