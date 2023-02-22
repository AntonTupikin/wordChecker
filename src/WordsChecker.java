import java.util.*;

public class WordsChecker {
    String string;
    String word;


    public WordsChecker(String string){
        this.string=string;

    }

    public boolean hasWord(String word){
        List<String> myList = new ArrayList<String>(Arrays.asList(string.split("\\P{IsAlphabetic}+")));

        return myList.contains(word);
    }
}
