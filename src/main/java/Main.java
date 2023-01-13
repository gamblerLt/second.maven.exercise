import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

    public void addWord(List<String> words, String word) {

        LanguageDetector detector = LanguageDetectorBuilder.fromAllLanguages().build();

        if(words.size()==2) {
            System.out.println("Jau suvedėte " + words.size() + " žodžių");

            System.out.println(detector.detectLanguageOf(words.get(0)));


            System.exit(0);
        }

        if(words.contains(word)) {
            System.out.println("Toks žodis yra");
            return;
        }
    words.add(word);

    }
}

