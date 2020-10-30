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
        HeadTailPlacement linkedList = new HeadTailPlacement();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
                && linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
}

