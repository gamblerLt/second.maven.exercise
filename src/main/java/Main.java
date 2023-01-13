import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lingua lingua = new Lingua();
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Main main = new Main();
        //patikrinu, ar nesiduplikuoja
        boolean isWordAlreadyInArray;

        do {

            System.out.println("Iveskite 10 žodžių");
            String word = sc.nextLine();
            isWordAlreadyInArray = word.equals("Toks žodis jau yra");

            if (!isWordAlreadyInArray) {
                main.addWord(words, word);
                System.out.println(words);
            }

        } while (!isWordAlreadyInArray);

    }

    private void addWord(List<String> words, String word) {
        LanguageDetector languageDetector = new LanguageDetector( LanguageDetector(List<>));
        languageDetector.detectLanguageOf(List<String>words);

        if(words.size()==10) {

            return;
        }

        if(words.contains(word)) {
            System.out.println("Toks žodis yra");
            return;
        }
    words.add(word);

    }
}
