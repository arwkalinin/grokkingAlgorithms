package Recursion;

public class RecursionAlgorithm {
    public static void main(String[] args) {
        System.out.println(factorialOf(2));
    }

    private static int factorialOf(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorialOf(num - 1);
    }
}
