import org.junit.Before;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void getMappedWordsWithLongerText(){

        Map<Character,Set<String>> mappedWords = new TreeMap<>();
        mappedWords.put('a', new TreeSet<>(Arrays.asList("ala","javie","kota","ma")));
        mappedWords.put('d',new TreeSet<>(Arrays.asList("koduje")));
        mappedWords.put('e',new TreeSet<>(Arrays.asList("javie","koduje")));
        mappedWords.put('i',new TreeSet<>(Arrays.asList("javie")));
        mappedWords.put('j',new TreeSet<>(Arrays.asList("javie","koduje")));
        mappedWords.put('k',new TreeSet<>(Arrays.asList("koduje","kot","kota")));
        mappedWords.put('l',new TreeSet<>(Arrays.asList("ala")));
        mappedWords.put('m',new TreeSet<>(Arrays.asList("ma")));
        mappedWords.put('o',new TreeSet<>(Arrays.asList("koduje","kot","kota")));
        mappedWords.put('t',new TreeSet<>(Arrays.asList("kot","kota")));
        mappedWords.put('u',new TreeSet<>(Arrays.asList("koduje")));
        mappedWords.put('v',new TreeSet<>(Arrays.asList("javie")));
        mappedWords.put('w',new TreeSet<>(Arrays.asList("w")));

        assertEquals(mappedWords,algorithm.getMappedWords("ala ma kota, kot koduje w Javie kota"));

    }
}
