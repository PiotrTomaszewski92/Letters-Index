import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();

        System.out.println("~~~Welcome in program, which index each letter in text and map to the words in which it occurs ~~~\n");

        System.out.println("Enter the text: ");
        String text = new Scanner(System.in).nextLine();

        Map<Character, Set<String>> map = algorithm.getMappedWords(text);

        map.entrySet().stream().forEach(key-> {
            String values = key.getValue().toString().replace("[","").replace("]","").trim();

            System.out.println(key.getKey()+": "+ values);
        });
    }
}
