public class AWATester {
    public static void main(String args[]) {
        Issue issue = new Issue();
        Argument argument = new Argument();
        //Issue Tester
        issue.setOpinion("Positive opinion");
        issue.setNumNegative(123);
        issue.setNumPositive(456);
        issue.setNumTrans(789);
        issue.setSentiNegative(12.3);
        issue.setSentiPositive(45.6);
        issue.setTime(78.9);
        //WordCount Tester
        
        issue.setWord(2222, 3333);
        WordCount wordissue = issue.getWord();
        System.out.println("\nwordissue.getNumVowel()[issue]: " + wordissue.getNumVowel());
        System.out.println("\nwordissue.getNumWord()[issue]: " + wordissue.getNumWord());
        
        System.out.println("\nissue.getOpinion(): " + issue.getOpinion());
        System.out.println("\nissue.getNumNegative(): " + issue.getNumNegative());
        System.out.println("\nissue.getNumPositive(): " + issue.getNumPositive());
        System.out.println("\nissue.getNumTrans(): " + issue.getNumTrans());
        System.out.println("\nissue.getSentiNegative(): " + issue.getSentiNegative());
        System.out.println("\nissue.getSentiPositive(): " + issue.getSentiPositive());
        System.out.println("\nissue.getTime(): " + issue.getTime());
        System.out.println("\nissue.isOpinionPositive(): " + issue.isOpinionPositive());
        System.out.println("\n------------------------------------------");
        System.out.println("\nissue.toString(): " + issue.toString());
        System.out.println("\n------------------------------------------");
        //Argument Tester
        argument.setLogical(true);
        argument.setNumWeak(321);
        argument.setNumReason(654);
        argument.setNumPara(987);
        //WordCount Tester
        
        argument.setWord(4444, 5555);
        WordCount wordargument = argument.getWord();
        System.out.println("\nwordargument.getNumVowel()[argument]: " + wordargument.getNumVowel());
        System.out.println("\nwordargument.getNumWord()[argument]: " + wordargument.getNumWord());
        
        System.out.println("\nargument.getLogical: " + argument.getLogical());
        System.out.println("\nargument.getNumWeak(): " + argument.getNumWeak());
        System.out.println("\nargument.getNumReason(): " + argument.getNumReason());
        System.out.println("\nargument.getNumPara(): " + argument.getNumPara());
        System.out.println("\n------------------------------------------");
        System.out.println("\nargument.toString(): " + argument.toString());
        System.out.println("\n------------------------------------------");
    }
}