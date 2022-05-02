package Recursion;

import java.util.Arrays;

public class RecursiveSumm {
    public static void main(String[] args) {
        int[] numArr = {5, 3, 9, 2, 15, 10};
        int result = getSummary(numArr);
        System.out.println("SUM OF ARRAY (recursive method) = " + result);
    }

    private static int getSummary(int[] numArr) {
        if (numArr.length == 0)
            return 0;
        else {
            return numArr[0] + getSummary(Arrays.copyOfRange(numArr, 1, numArr.length));
        }
    }
}
