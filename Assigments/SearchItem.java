import java.util.Scanner;

public class SearchItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The sentence to search
        String sentence = "the quick brown fox jumps over the lazy dog";

        // Prompt the user to enter a word
        System.out.print("Enter a word to search: ");
        String word = scanner.nextLine();
        // Search for the word in the sentence
        int index = sentence.indexOf(word);

        if (index != -1) {
            System.out.println("Found at index: " + index);

        } else {
            System.out.println("Not found");
        }

    }
}
