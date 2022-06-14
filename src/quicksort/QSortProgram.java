package quicksort;

import java.util.ArrayList;
import java.util.List;

public class QSortProgram {
    public static void main(String[] args) {
        List<Integer> arrList = List.of(5, 1, -7, 12, 3, 2, 5);
        System.out.println("ArrayList before quicksort: " + arrList);
        System.out.println("ArrayList after quicksort: " + getQuickSorted(arrList));
    }

    private static List<Integer> getQuickSorted(List<Integer> arrList) {
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