import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private void printMap(Map<Character, Set<String>> wordsMap) {
        wordsMap.entrySet().stream().forEach(key-> {
            String values = key.getValue().toString().replace("[","").replace("]","").trim();

            System.out.println(key.getKey()+": "+ values);
        });
    }

    private String getText(){
        System.out.println("Enter the text: ");
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Algorithm algorithm = new Algorithm();

        System.out.println("~~~Welcome in program, which index each letter in text and map to the words in which it occurs ~~~\n");

        String text = main.getText();

        Map<Character, Set<String>> wordsMap = algorithm.getMappedWords(text);

        main.printMap(wordsMap);
    }
}
