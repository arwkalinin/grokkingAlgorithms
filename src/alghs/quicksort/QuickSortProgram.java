package alghs.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortProgram {
    public static void main(String[] args) {
        List<Integer> arrList = List.of(5, 1, -7, 12, 3, 2, 5);
        System.out.println("ArrayList before cont.quicksort: " + arrList);
        System.out.println("ArrayList after cont.quicksort: " + getQuickSorted(arrList));
    }

    private static List<Integer> getQuickSorted(List<Integer> arrList) {
        List<Integer> newArrList = new ArrayList<>();

        if (arrList.size() < 2) return arrList;
        else {
            int pivot = arrList.get(0);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            List<Integer> middle = new ArrayList<>();

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