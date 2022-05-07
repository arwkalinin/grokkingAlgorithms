package DijkstraAlgorithm;

public class RouteFinder {
    public static void main(String[] args) {
        AirlineRoutes routes = new AirlineRoutes();
        routes.showRoutes();

        int temp = routes.getFlyTimeInMinutes("Rome", "Lisbon");
        System.out.println(temp);
    }
}
