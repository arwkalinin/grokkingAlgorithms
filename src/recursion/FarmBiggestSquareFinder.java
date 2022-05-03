package recursion;

import java.util.Scanner;

public class FarmBiggestSquareFinder {
    public static void main(String[] args) {
        int x, y, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("...FIND THE BIGGEST EQUAL SQUARES IN ENTERED AREA...");
        System.out.print("Enter X side value (integer): ");
        x = scanner.nextInt();
        System.out.print("Enter Y side value (integer): ");
        y = scanner.nextInt();

        scanner.close();

        result = findBiggestSquareOf(x,y);
        System.out.println("\nDividing a area " + "[X=" + x + "|Y=" + y + "]" + " into area with equal squares, SQUARE = " + result);
    }

    // ===============
    // >>!! Euclid Recursive Algorithm !!<<
    // BASIC CASE (160 / 80 ==> 2/1 || 1/1)
    // if 1/1 -> square=1
    // if 2/1 -> square=2-1
    // ===============
    // 180 / 100 ==> 180-100=80/100 ==> 80/100 ==> 80/100-80=20 ==> 80/20 ==> 80-20/20 ==> 60/20 ==> 60-20/20 ==> 40/20 ==> SQUARE=20
    // ===============

    private static int findBiggestSquareOf(int x, int y) {
        if (x == y)
            return x;

        if ((x % y == 0 || y % x == 0) && (x / y == 2 || y / x == 2)) {
            if (x > y)
                return (x - y);
            else
                return (y - x);
        }

        if (x > y)
            return findBiggestSquareOf(x - y, y);
        else
            return findBiggestSquareOf(x, y - x);
    }

}
