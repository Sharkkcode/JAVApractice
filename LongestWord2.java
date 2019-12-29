import java.util.*;

public class LongestWord2 {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("[^a-zA-Z]+");

        int maxLen = 0;
        String ans = "";
        while(in.hasNext()) {
            String word = in.next().toLowerCase();
            if(word.length() > maxLen) {
                maxLen = word.length();
                ans = word;
            } else if(word.length() == maxLen) {
                if(word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }

        System.out.println(ans + ", " + maxLen);

        in.close();
    }
}