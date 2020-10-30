import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void whenCallWelcomeMethod_shouldReturnTrue() {
        boolean welcomeReturns = MyLinkedList.printWelcomeMsg();
        Assert.assertEquals(true, welcomeReturns);
    }
}

