import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import static org.junit.Assert.*;

public class AlgorithmTest {

    private Algorithm algorithm;

    @Before
    public void createAlgorithmObject(){
        this.algorithm = new Algorithm();
    }

    @Test
    public void getMappedWordsWithShortText(){
        Set<String> ala = new TreeSet<>();
        ala.add("ala");

        Map<Character,Set<String>> mappedWords = new TreeMap<>();
        mappedWords.put('a',ala);
        mappedWords.put('l',ala);

        assertEquals(mappedWords,algorithm.getMappedWords("Ala"));

    }
}
