package alghs.minValueSearch;

public class Runner {

    public static void main(String[] args) {
        int[] inputArray = new int[] { 64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36 };

        int minResult = inputArray[0];
        int minIndex = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (minResult > inputArray[i]) {
                minResult = inputArray[i];
                minIndex = i;
            }
        }

        System.out.println("Min result: " + minResult + "\nMin index: " + minIndex);
    }
}
