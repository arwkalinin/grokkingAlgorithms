package sortingByChoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SByChoice {
    public static void main(String[] args) {

        List<MusicBand> bandsList = new ArrayList<>();
        bandsList.add(new MusicBand("RAMMSTEIN", 650));
        bandsList.add(new MusicBand("LINKIN PARK", 425));
        bandsList.add(new MusicBand("RADIOHEAD", 50));
        bandsList.add(new MusicBand("KISHORE KUMAR", 13));
        bandsList.add(new MusicBand("BECK", 2));
        bandsList.add(new MusicBand("WILCO", 25));
        bandsList.add(new MusicBand("NEUTRAL MILK HOTEL", 17));
        bandsList.add(new MusicBand("THE BLACK KEYS", 39));

        System.out.println("INPUT LIST: " + bandsList);

        bandsList = getSortedToHigherArrayList(bandsList);

        System.out.println("SORTED LIST: " + bandsList);
    }

    private static int getIndexOfSmallestAuditionCount(List<MusicBand> inputList) {
        int smallestIndex = 0;
        for (int i = 1; i < inputList.size(); i++) {
            if (inputList.get(i).getAuditionCount() < inputList.get(smallestIndex).getAuditionCount()) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static ArrayList<MusicBand> getSortedToHigherArrayList(List<MusicBand> inputList) {
        ArrayList<MusicBand> inputListCopy = new ArrayList<>(inputList);
        ArrayList<MusicBand> newList = new ArrayList<>();
        int curSmallIndex;

        for (int i = 0; i < inputList.size(); i++) {
            curSmallIndex = getIndexOfSmallestAuditionCount(inputListCopy);
            newList.add(inputListCopy.get(curSmallIndex));
            inputListCopy.remove(curSmallIndex);
        }
        return newList;
    }

}