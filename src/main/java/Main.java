import com.github.pemistahl.lingua.api.LanguageDetector;

public class Main {
    public static <Lingua> void main(String[] args) {
        Lingua lingua = new Lingua();

        for (int i = 0; i <10; i++) {
            System.out.println(lingua.l);

        }
    }
}
/*public static void main(String[] args) {
        Faker faker = new Faker();

        for(int i = 0; i < 100; i++) {
            System.out.println(faker.address().streetAddress());
        }*/