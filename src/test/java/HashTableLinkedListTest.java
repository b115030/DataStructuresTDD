import org.junit.Assert;
import org.junit.Test;

public class HashTableLinkedListTest {
    @Test
    public void givenPara_whenWordsAdded_shouldReturnWordFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but "
                + "because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTableLinkedList<String, Integer> myLinkedHashMap = new HashTableLinkedList();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(3, frequency);
    }
}
