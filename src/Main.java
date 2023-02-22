import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker wordsChecker = new WordsChecker(string);
        Scanner scanner= new Scanner(System.in);
        String word = scanner.nextLine();
        if (wordsChecker.hasWord(word)) {
            System.out.println("Слово " + word + " содержится в тексте");
        } else {
            System.out.println("Слово " + word + " НЕ содержится в тексте");
        }

    }
}