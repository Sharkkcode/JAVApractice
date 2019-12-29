import java.util.*;
import java.io.*;

public class basek2 {
    public static void main(String[] argv) {
        final int MAX_LEN = 100;
        Scanner in = new Scanner(System.in);

        try {
            int times = in.nextInt();
            for(int i = 0; i < times; ++i) {
                int k = in.nextInt();
                int n = in.nextInt();

                if(n == 0) {
                    System.out.println(0);
                    continue;
                }
                
                int [] ans = new int[MAX_LEN];
                int j;
                for(j = 0; n != 0; ++j) {
                    ans[j] = n % k;
                    n /= k;
                }

                for(int p = 0; p < j; ++p) {
                    System.out.print(ans[j - 1 - p]);
                }
                System.out.println();
            }
        } catch(Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        } finally {
            in.close();
        }
    }
}