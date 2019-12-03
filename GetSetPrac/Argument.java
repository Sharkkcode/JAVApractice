public class Argument
{
    private boolean logicalSoundness;
    private int numWeakness;
    private int numReasonProvided;
    private int numParagraph;
    private WordCount wordInfo = new WordCount();

    public Argument() {
        logicalSoundness = false;
        numWeakness = 0;
        numReasonProvided = 0;
        numParagraph = 0;
    }

    // setters
    public void setLogical(boolean logicalSoundness) {
        this.logicalSoundness = logicalSoundness;
    }

    public void setNumWeak(int numWeakness) {
        this.numWeakness = numWeakness;
    }

    public void setNumReason(int numReasonProvided) {
        this.numReasonProvided = numReasonProvided;
    }

    public void setNumPara(int numParagraph) {
        this.numParagraph = numParagraph;
    }

    public void setWord(int numVowel, int numWord) {
        this.wordInfo.setNumVowel(numVowel);
        this.wordInfo.setNumWord(numWord);
    }

    // getters
    public boolean getLogical() {
        return this.logicalSoundness;
    }

    public int getNumWeak() {
        return this.numWeakness;
    }

    public int getNumReason() {
        return this.numReasonProvided;
    }

    public int getNumPara() {
        return this.numParagraph;
    }

    public WordCount getWord() {
        return this.wordInfo;
    }

    // toSting() function
    public String toString() {
        // logical soundness
        String printItOut = "\nLogical Soundness:\t";
        if(getLogical()) {
            printItOut += "true";
        } else {
            printItOut += "false";
        }
        printItOut += "\n";

        // number of weakness
        printItOut += "\nNumber of weakness:\t";
        printItOut += String.valueOf(getNumWeak());
        printItOut += "\n";

        // number of reasons
        printItOut += "\nNumber of reasons:\t";
        printItOut += String.valueOf(getNumReason());
        printItOut += "\n";

        // number of paragraphs
        printItOut += "\nNumber of paragraphs:\t";
        printItOut += String.valueOf(getNumPara());
        printItOut += "\n";

        // number of vowels
        printItOut += "\nNumber of vowels:\t";
        printItOut += String.valueOf(getWord().getNumVowel());
        printItOut += "\n";

        // number of words
        printItOut += "\nNumber of words:\t";
        printItOut += String.valueOf(getWord().getNumWord());
        printItOut += "\n";

        return printItOut;
    }
}
