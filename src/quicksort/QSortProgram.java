package quicksort;

import java.io.File;
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
        arrList.add(5);
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
            ArrayList<Integer> middle = new ArrayList<>();

            for (int i:arrList) {
                if (i < pivot) less.add(i);
                else if (i > pivot) greater.add(i);
                else middle.add(i);
            }
            
            newArrList.addAll(getQuickSorted(less));
            newArrList.addAll(middle);
            newArrList.addAll(getQuickSorted(greater));
            return newArrList;
        }
    }

}