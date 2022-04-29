package SortingByChoice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SByChoice {
    public static void main(String[] args) {

        ArrayList<MusicBand> bandsList = new ArrayList<>();
        bandsList.add(new MusicBand("RAMMSTEIN", 350));
        bandsList.add(new MusicBand("LINKIN PARK", 425));
        bandsList.add(new MusicBand("RADIOHEAD", 50));
        bandsList.add(new MusicBand("KISHORE KUMAR", 13));
        bandsList.add(new MusicBand("BECK", 2));
        bandsList.add(new MusicBand("WILCO", 25));
        bandsList.add(new MusicBand("NEUTRAL MILK HOTEL", 17));
        bandsList.add(new MusicBand("THE BLACK KEYS", 39));

        System.out.println(bandsList);

        MusicBand[] bandsListArray = bandsList.toArray(new MusicBand[bandsList.size()]);
        MusicBand selectedBand = null;
    }
}