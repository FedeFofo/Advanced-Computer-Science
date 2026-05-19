import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList<Word> {
    // instance variables
    private AbstractList<Word> wordList;

    // constructors
    public AnagramList() {
        wordList = new ArrayList<Word>();
    }

    // methods
    @Override
    public Word get(int index) {
        return wordList.get(index);
    }

    @Override
    public int size() {
        return wordList.size();
    }

    @Override
    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        return word1.getSortedWord().equals(word2.getSortedWord());
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> anagrams = new ArrayList<Word>();
        Word keyWord = new Word(key);

        for (Word word : wordList) {
            if (checkAnagram(keyWord, word)) {
                anagrams.add(word);
            }
        }
        return anagrams;
    }
}
