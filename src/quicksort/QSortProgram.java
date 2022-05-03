package quicksort;

import java.sql.Array;
import java.util.ArrayList;

public class QSortProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(1);
        arrList.add(-7);
        arrList.add(12);
        arrList.add(3);
        arrList.add(-2);
        arrList.add(15);
        arrList.add(10);
        System.out.println("ArrayList before quicksort: " + arrList);
        System.out.println("ArrayList after quicksort: " + getQuickSorted(arrList));
    }

    private static ArrayList<Integer> getQuickSorted(ArrayList<Integer> arrList) {
        ArrayList<Integer> newArrList = new ArrayList<>();

        if (arrList.size() < 2) return arrList;
        else {
            int pivot = arrList.get(0);

            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();

            for (int i = 1; i < arrList.size(); i++) {
                if (arrList.get(i) < pivot) {
                    less.add(arrList.get(i));
                }
                else if (arrList.get(i) > pivot) {
                    greater.add(arrList.get(i));
                }
            }

            newArrList.addAll(getQuickSorted(less));
            newArrList.add(pivot);
            newArrList.addAll(getQuickSorted(greater));

            return newArrList;
        }


    }
}