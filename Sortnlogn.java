import java.util.*;
import java.io.*;
import java.lang.*;

public class Sortnlogn {
    public static void main(String[] argv) {
        
        final int MAX_DATA = 50000;
        
        Scanner read = new Scanner(System.in);

        int [] numArray = new int[MAX_DATA];
        int counter;
        for(counter = 0; read.hasNextInt(); ++counter) {
            numArray[counter] = read.nextInt();
        }

        mergeSort(numArray, 0, counter - 1);

        printArray(numArray, counter);

        read.close();
    }

    static void printArray(int [] array, int len) {
        for(int i = 0; i < len; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int [] array, int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    static void merge(int [] array, int leftIndex, int middleIndex, int rightIndex) {
        int leftSubLen = middleIndex - leftIndex + 1;
        int rightSubLen = rightIndex - middleIndex; // rightIndex - (middleIndex + 1) + 1

        int [] leftSubArr = new int[leftSubLen];
        int [] rightSubArr = new int[leftSubLen];

        for(int i = 0; i < leftSubLen; ++i) {
            leftSubArr[i] = array[leftIndex + i];
        }
        for(int i = 0; i < rightSubLen; ++i) {
            rightSubArr[i] = array[middleIndex + 1 + i];
        }

        int i, j, k;
        for(i = 0, j = 0, k = leftIndex; i < leftSubLen && j < rightSubLen; ++k) {
            if(leftSubArr[i] <= rightSubArr[j]) {
                array[k] = leftSubArr[i++];
            } else {
                array[k] = rightSubArr[j++];
            }
        }

        for(; i < leftSubLen; ++k, ++i) {
            array[k] = leftSubArr[i];
        }
        for(; j < rightSubLen; ++k, ++j) {
            array[k] = rightSubArr[j];
        }
    }
}

