public class Word {
    // instance variables
    private String originalWord;
    private String sortedWord;

    // constructors
    public Word(String originalWord) {
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    // getters
    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    // setters
    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public void setSortedWord(String sortedWord) {
        this.sortedWord = sortedWord;
    }

    // methods
    public String sortWord() {
        String lowercase = originalWord.toLowerCase();
        char[] word = lowercase.toCharArray();
        selectionSort(word);
        String sortedWord = new String(word);
        return sortedWord;
    }

    public static void selectionSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < (arr[index])) {
                    index = j;
                }
            }

            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}