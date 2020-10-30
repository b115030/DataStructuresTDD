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
        boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode) && linkedList.tail.equals(thirdNode);
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
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(secondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenKeyValue_shouldReturnNodeWithKey() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils<Integer> linkedList = new LinkedListUtils<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        INode<Integer> resultNode = linkedList.findNode(30);
        boolean result = resultNode.equals(secondNode);
        Assert.assertTrue(result);
    }
    // UC8 find the node with given key value and insert a new node
    @Test
    public void givenThreeNodes_findANode_shoudlInsertNewNode() {
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(70);
        LinkedListUtils<Integer> linkedList = new LinkedListUtils<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        INode<Integer> nodeFound = linkedList.findNode(30);
        MyLinkedList<Integer> newNode = new MyLinkedList<>(40);
        linkedList.insert(nodeFound, newNode);
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.head.getNext().getNext().equals(newNode) && linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    // UC9 find the node delete it and print the size of final linked list
    @Test
    public void givenFourNodes_findANode_deleteIt_shouldReturnSizeOfLinkedList() {
        LinkedListUtils<Integer> linkedList = new LinkedListUtils<>();
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(40);
        MyLinkedList<Integer> fourthNode = new MyLinkedList<>(70);
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.append(fourthNode);

        INode<Integer> nodeFound = linkedList.findNode(40);
        linkedList.deleteGivenNode(nodeFound);
        int size = linkedList.getSize();
        Assert.assertEquals(size, 3);
    }
    // UC10 make a sorted linked list
    @Test
    public void givenFourNodes_shouldAddNodeInAscendingOrder() {
        LinkedListUtils<Integer> linkedList = new LinkedListUtils<>();
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(40);
        MyLinkedList<Integer> fourthNode = new MyLinkedList<>(70);
        linkedList.addInAscendingOrder(firstNode);
        linkedList.addInAscendingOrder(secondNode);
        linkedList.addInAscendingOrder(thirdNode);
        linkedList.addInAscendingOrder(fourthNode);

        boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode) && linkedList.head.getNext().getNext().equals(firstNode) && linkedList.tail.equals(fourthNode);
        Assert.assertTrue(result);
    }
    //UC1 create stack
    @Test
    public void given3NumbersAddedInStackShouldHaveLastAddedNode () {
        MyLinkedList<Integer> myThirdNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(70);
        MyStack stack = new MyStack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        INode peek = stack.peek();
        Assert.assertEquals(myThirdNode, peek);
    }
    // UC2 pop an element stack
    @Test
    public void givenThreeNumbersAddedInStack_shouldDeleteLastAddedNode() {
        MyLinkedList<Integer> thirdNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> secondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> firstNode = new MyLinkedList<>(70);
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.pop();
        stack.pop();
        stack.pop();
        boolean isEmpty = stack.isStackEmpty();
        Assert.assertEquals(true, isEmpty);
    }
}

