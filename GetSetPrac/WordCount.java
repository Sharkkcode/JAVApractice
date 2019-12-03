public class WordCount
{
    private int numVowel;
    private int numWord;

    public WordCount() {
        numVowel = 0;
        numWord = 0;
    }

    // setters
    public void setNumVowel(int numVowel) {
        this.numVowel = numVowel;
    }

    public void setNumWord(int numWord) {
        this.numWord = numWord;
    }

    // getters
    public int getNumVowel() {
        return this.numVowel;
    }

    public int getNumWord() {
        return this.numWord;
    }
}
