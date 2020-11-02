import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

    // UC1 HashMap find frequency
    @Test
    public void givenSentence_whenWordsAdded_shouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        HashTable<String, Integer> myHashMap = new HashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("be");
        System.out.println(myHashMap);
        Assert.assertEquals(2, frequency);
    }
}
