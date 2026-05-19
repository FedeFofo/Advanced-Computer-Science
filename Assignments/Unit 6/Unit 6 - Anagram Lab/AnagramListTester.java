import java.util.ArrayList;

public class AnagramListTester {
    public static void main(String[] args) {
        AnagramList list = new AnagramList();
        list.add(new Word("cinema"));
        list.add(new Word("iceman"));
        list.add(new Word("dog"));
        list.add(new Word("cat"));
        list.add(new Word("listen"));
        list.add(new Word("silent"));

        System.out.println("Are \"cinema\" and \"iceman\" anagrams? ");
        System.out.println("\t" + list.checkAnagram(list.get(0), list.get(1)));

        String key = "listen";
        ArrayList<Word> results = list.searchAnagrams(key);

        System.out.println("\nAnagrams of \"listen\":");
        for (Word word : results) {
            System.out.println("\t" + word.getOriginalWord());
        }
    }
}
