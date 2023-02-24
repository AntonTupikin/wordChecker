import java.util.*;

public class WordsChecker {
    protected String string;
    protected String word;
    protected Set<String> text = new HashSet<>();


    public WordsChecker(String string) {
        this.string = string;

    }

    public boolean hasWord(String word) {
        text = new HashSet<>(Arrays.asList(string.split("\\P{IsAlphabetic}+")));
        return text.contains(word);
    }
}
