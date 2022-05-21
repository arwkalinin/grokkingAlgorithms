package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AirlineRoutes {
    private final Map<String,String[]> DEPARTURES = new HashMap<>();

    AirlineRoutes() {
        DEPARTURES.put("Moscow", new String[]{"London", "Paris"});

        DEPARTURES.put("London", new String[]{"Madrid", "Rome"});
        DEPARTURES.put("Paris", new String[]{"Madrid", "Rome"});

        DEPARTURES.put("Madrid", new String[]{"Rome", "Lisbon"});
        DEPARTURES.put("Rome", new String[]{"Madrid", "Lisbon"});
    }

    public void showRoutes() {
        System.out.println("Moscow -> " + DEPARTURES.get("Moscow")[0] + "(" + getFlyTimeInMinutes("Moscow", DEPARTURES.get("Moscow")[0]) + "), "
                            + DEPARTURES.get("Moscow")[1] + '(' + getFlyTimeInMinutes("Moscow", DEPARTURES.get("Moscow")[1]) + ')');

        System.out.println("London -> " + DEPARTURES.get("London")[0] + "(" + getFlyTimeInMinutes("London", DEPARTURES.get("London")[0]) + "), "
                            + DEPARTURES.get("London")[1] + '(' + getFlyTimeInMinutes("London", DEPARTURES.get("London")[1]) + ')');
        System.out.println("Paris -> " + DEPARTURES.get("Paris")[0] + "(" + getFlyTimeInMinutes("Paris", DEPARTURES.get("Paris")[0]) + "), "
                            + DEPARTURES.get("Paris")[1] + '(' + getFlyTimeInMinutes("Paris", DEPARTURES.get("Paris")[1]) + ')');

        System.out.println("Madrid -> " + DEPARTURES.get("Madrid")[0] + "(" + getFlyTimeInMinutes("Madrid", DEPARTURES.get("Madrid")[0]) + "), "
                            + DEPARTURES.get("Madrid")[1] + '(' + getFlyTimeInMinutes("Madrid", DEPARTURES.get("Madrid")[1]) + ')');
        System.out.println("Rome -> " + DEPARTURES.get("Rome")[0] + "(" + getFlyTimeInMinutes("Rome", DEPARTURES.get("Rome")[0]) + "), "
                            + DEPARTURES.get("Rome")[1] + '(' + getFlyTimeInMinutes("Rome", DEPARTURES.get("Rome")[1]) + ')');
    }

    public int getFlyTimeInMinutes(String departCity, String arriveCity) {
        switch (departCity) {
            case "Moscow":
                if (arriveCity.equals("London")) return 180;
                else if (arriveCity.equals("Paris")) return 120;
                break;
            case "London":
                if (arriveCity.equals("Madrid")) return 200;
                else if (arriveCity.equals("Rome")) return 90;
                break;
            case "Paris":
                if (arriveCity.equals("Madrid")) return 160;
                else if (arriveCity.equals("Rome")) return 140;
                break;
            case "Madrid":
                if (arriveCity.equals("Lisbon")) return 60;
                else if (arriveCity.equals("Rome")) return 40;
                break;
            case "Rome":
                if (arriveCity.equals("Lisbon")) return 60;
                else if (arriveCity.equals("Madrid")) return 40;
                break;
        }
        // default case:
        return 0;
    }

    public void showShortestWayToLisbon() {
        Map<String,Integer> citiesPriceInMinutes = new HashMap<>();
    }


}
