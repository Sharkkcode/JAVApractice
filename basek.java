import java.util.*;
import java.io.*;

public class basek {
    public static void main(String[] argv) {
        
        final int MAX_DATA = 1000000;
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for(int i = 0; i < n; ++i) { 
            
            int k = read.nextInt();
            int base10 = read.nextInt();
            
            if(base10 == 0) {
                System.out.println('0');
                continue;
            }

            int [] baseK = new int[MAX_DATA];
            int j;
            for(j = 0; base10 != 0; ++j, base10 /= k)
                baseK[j] = base10 % k;

            for(int p = 0; p < j; ++p)
                System.out.print(baseK[j - 1 - p]);

            System.out.println();
        }

        read.close();
    }
}
