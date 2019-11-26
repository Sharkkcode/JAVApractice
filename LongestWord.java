import java.util.*;
import java.io.*;

public class LongestWord
{
	public static void main(String[] argv)
	{
		// 1. read input
		final int MAX_DATA = 10000;
		Scanner read = new Scanner(System.in);
		int countWord = 0;
		String [] properStr = new String[MAX_DATA];
		while(read.hasNextLine()) {
			for(String element: read.nextLine().split(" |\"|\'|&|,|\\.|:|;|-|\\(|\\)|\\[|\\]|\\{|\\}"))
				properStr[countWord++] = element.toLowerCase();
		}

		// 2. find max length
		int maxLen = findMaxLen(properStr, countWord);

		// 3. if there is not only one word with max length
		//    then count how many
		String [] maxProperStr = new String[MAX_DATA];
		int maxStrNum = 0;
		for(int i = 0; i < countWord; ++i)
			if(properStr[i].length() == maxLen)
				maxProperStr[maxStrNum++] = properStr[i];

		// 4. minIndex
		int minIndex = findMinIndex(maxProperStr, maxStrNum);

		System.out.println(maxProperStr[minIndex] + ", " + maxLen);

		read.close();
	}

	static int findMinIndex(String [] x, int len)
	{
		int minIndex = 0;
		for(int i = 0; i < len; ++i)
			if(x[i].compareTo(x[minIndex]) < 0)
				minIndex = i;
		return minIndex;
	}

	static int findMaxLen(String [] x, int len)
	{
		int maxLen = 0;
		for(int i = 0; i < len; ++i)
			if(x[i].length() > maxLen)
				maxLen = x[i].length();
		return maxLen;
	}
}
