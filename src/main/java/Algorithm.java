import java.util.*;

public class Algorithm {

    private final String regexOnlyWords = "[^a-z']+";

    private String[] splitToWordsArray(String text){
        return text.toLowerCase().split(regexOnlyWords);
    }

    private Set<String> addWordToSetCollection( Set<String> distinctWords, String word){
        if (distinctWords == null)
            distinctWords = new TreeSet<>();

        distinctWords.add(word);
        return distinctWords;
    }

    public Map<Character, Set<String>> getMappedWords(String text){
        Map<Character, Set<String>> wordsMap = new TreeMap<>();

        String[] words = splitToWordsArray(text);
        Set<String> wordsSet = new HashSet<>(Arrays.asList(words));

        for (String word : wordsSet) {
            for (int i = 0; i < word.length(); i++) {
                Character key = word.charAt(i);
                Set<String> wordsSetCollection = addWordToSetCollection(wordsMap.get(key), word);
                wordsMap.put(key, wordsSetCollection);
            }
        }

        return wordsMap;
    }
}
