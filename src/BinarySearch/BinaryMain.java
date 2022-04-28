package BinarySearch;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinaryMain {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList(Arrays.asList(1, -30, 50, 19, 28, 10, 11, 12, 13, 14, 90, 91, 15, -58, 20, -99, -150, -503, 509));
        Collections.sort(intList);
        for (int num:intList) {
            System.out.print(num + " ");
        }
        System.out.println();
        Object result = searchIntBS(intList, -99);
        System.out.println("Index of searching element is [" + result + "]");
    }

    public static Object searchIntBS(ArrayList<Integer> numList, int item) {
        int low = 0;
        int high = numList.size() - 1;
        int mid, guess;

        // finding input item in numList:
        while (low <= high) {
            mid = (low + high) / 2;
            guess = numList.get(mid);
            if (guess == item)
                return mid;
            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;
        }

        // if we cannot find input item:
        return null;
    }
}
