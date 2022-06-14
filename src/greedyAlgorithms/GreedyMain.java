package greedyAlgorithms;

import java.util.*;

/**
 * Find optimal set of stations to translate conditional broadcast to all states what is needed.
 */

public class GreedyMain {

    public static void main(String[] args) {
        Set<String> statesNeeded = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca"));
        System.out.println(statesNeeded);

        Map<String, Set<String>> stationsTranslateToStates = new HashMap<>();
        stationsTranslateToStates.put("kOne", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stationsTranslateToStates.put("kTwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stationsTranslateToStates.put("kThree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stationsTranslateToStates.put("kFour", new HashSet<>(Arrays.asList("nv", "ut")));
        stationsTranslateToStates.put("kFive", new HashSet<>(Arrays.asList("ca", "az")));

        // result will be putting here.
        Set<String> selectedStations = new HashSet<>();


    }
}
