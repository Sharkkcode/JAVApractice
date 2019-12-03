public class Issue {
	private String opinionStatus;
	private int numPositiveReason;
	private int numNegativeReason;
	private double sentiPositive;
	private double sentiNegative;
	private int numTransition;
	private double timeSpend;
	private WordCount wordInfo = new WordCount();
	
	public Issue() {
		opinionStatus = "?";
		numPositiveReason = 0;
		numNegativeReason = 0;
		sentiPositive = 0.0;
		sentiNegative = 0.0;
		numTransition = 0;
		timeSpend = 0.0;
	}

	// setters
	public void setOpinion(String opinionStatus) {
		opinionStatus = opinionStatus.toLowerCase();
		this.opinionStatus = opinionStatus;
	}

	public void setNumPositive(int numPositiveReason) {
		this.numPositiveReason = numPositiveReason;
	}

	public void setNumNegative(int numNegativeReason) {
		this.numNegativeReason = numNegativeReason;
	}

	public void setSentiPositive(double sentiPositive) {
		this.sentiPositive = sentiPositive;
	}

	public void setSentiNegative(double sentiNegative) {
		this.sentiNegative = sentiNegative;
	}

	public void setNumTrans(int numTransition) {
		this.numTransition = numTransition;
	}

	public void setTime(double timeSpend) {
		this.timeSpend = timeSpend;
	}
	
	public void setWord(int numVowel, int numWord) {
        this.wordInfo.setNumVowel(numVowel);
        this.wordInfo.setNumWord(numWord);
    }

	// getters
	public String getOpinion() {
		return this.opinionStatus;
	}

	public int getNumPositive() {
		return this.numPositiveReason;
	}

	public int getNumNegative() {
		return this.numNegativeReason;
	}

	public double getSentiPositive() {
		return this.sentiPositive;
	}

	public double getSentiNegative() {
		return this.sentiNegative;
	}

	public int getNumTrans() {
		return this.numTransition;
	}

	public double getTime() {
		return this.timeSpend;
	}

	public boolean isOpinionPositive() {
		if(this.opinionStatus.equals("positive opinion")) {
			return this.opinionStatus.equals("positive opinion");
		} else if(this.opinionStatus.equals("negative opinion")) {
			return this.opinionStatus.equals("negative opinion");
		} else {
			// set the return value to false if opinionStatus isn't positive.
			return false;
		}
	}

	public WordCount getWord() {
        return this.wordInfo;
    }

	// toString() function
	public String toString() {
		// opinion status
		String printItOut = "\nOpinion Status:\t";
		printItOut += getOpinion();
		printItOut += "\n";

		// number of positive reasons
		printItOut += "\nNumber of Positive reasons:\t";
		printItOut += String.valueOf(getNumPositive());
		printItOut += "\n";

		// number of negative reasons
		printItOut += "\nNumber of Negative reasons:\t";
		printItOut += String.valueOf(getNumNegative());
		printItOut += "\n";

		// score of all positive sentiment
		printItOut += "\nScore of all positive sentiment:\t";
		printItOut += String.valueOf(getSentiPositive());
		printItOut += "\n";

		// number of all negative sentiment
		printItOut += "\nScore of all negative sentiment:\t";
		printItOut += String.valueOf(getSentiNegative());
		printItOut += "\n";

		// number of transition words
		printItOut += "\nNumber of Transition words:\t";
		printItOut += String.valueOf(getNumTrans());
		printItOut += "\n";
		
		// time spend
		printItOut += "\nTume Spend (mins):\t";
		printItOut += String.valueOf(getTime());
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
