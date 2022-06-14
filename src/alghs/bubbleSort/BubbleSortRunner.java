package alghs.bubbleSort;

public class BubbleSortRunner {

    public static void main(String[] args) {
        int[] inputArray = new int[] { 64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36 };

        showArray(inputArray);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < inputArray[i - 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i - 1];
                    inputArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        showArray(inputArray);

    }

    private static void showArray(int[] array) {
        System.out.println();
        for (int j : array) {
            System.out.print(" " + j + " ");
        }
    }
}
