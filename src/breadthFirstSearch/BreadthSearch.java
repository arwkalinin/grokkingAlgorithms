package breadthFirstSearch;

import java.sql.Array;
import java.util.*;

public class BreadthSearch {
    public static void main(String[] args) {
        Person p1 = new Person("Mihail", "firstLevel", 25, "Miner", "first city");
        Person p2 = new Person("Nikita", "firstLevel", 19, "Engineer", "first city");
        Person p3 = new Person("Dmitry", "firstLevel", 21, "Cooker", "first city");

        Person p4 = new Person("Elena", "secondLevel", 18, "unemployed", "second city");
        Person p5 = new Person("Mariya", "secondLevel", 15, "unemployed", "second city");
        Person p6 = new Person("Svetlana", "secondLevel", 55, "Driver", "second city");
        Person p7 = new Person("Irina", "secondLevel", 35, "Freelancer", "second city");

        Person p10 = new Person("Bob", "thirdLevel", 38, "Soldier", "third city");
        Person p11 = new Person("Mike", "thirdLevel", 21, "Another job", "third city");
        Person p12 = new Person("Stan", "thirdLevel", 12, "Another job", "third city");

        List<Person> myFriends = new ArrayList<>();
        myFriends.add(p1);
        myFriends.add(p2);
        myFriends.add(p3);
        System.out.println("MY FRIENDS: " + myFriends);

        List<Person> p1Friends = new ArrayList<>();
        p1Friends.add(p4);
        p1Friends.add(p5);
        System.out.println("P1 FRIENDS: " + p1Friends);

        List<Person> p2Friends = new ArrayList<>();
        p2Friends.add(p5);
        p2Friends.add(p6);
        System.out.println("P2 FRIENDS: " + p2Friends);

        List<Person> p3Friends = new ArrayList<>();
        p3Friends.add(p6);
        p3Friends.add(p7);
        System.out.println("P3 FRIENDS: " + p3Friends);

        List<Person> p5Friends = new ArrayList<>();
        p5Friends.add(p10);
        p5Friends.add(p11);
        System.out.println("P5 FRIENDS: " + p3Friends);

        List<Person> p6Friends = new ArrayList<>();
        p6Friends.add(p11);
        p6Friends.add(p12);
        System.out.println("P6 FRIENDS: " + p3Friends);

        Map<Person, List<Person>> friendConnections = new HashMap<>();
        friendConnections.put(p1, p1Friends);
        friendConnections.put(p2, p2Friends);
        friendConnections.put(p3, p3Friends);
        friendConnections.put(p5, p5Friends);
        friendConnections.put(p6, p6Friends);

        // THEY DON'T HAVE FRIENDS ;(. Is needed to findWorker() work correctly.
        friendConnections.put(p4, new ArrayList<>());
        friendConnections.put(p7, new ArrayList<>());
        friendConnections.put(p10, new ArrayList<>());
        friendConnections.put(p11, new ArrayList<>());
        friendConnections.put(p12, new ArrayList<>());

        System.out.println();

        // WORKER TO FIND
        System.out.println("WORKER FOUND: " + findWorker("Soldier", myFriends, friendConnections));
        // ===============================
    }

    private static Person findWorker(String jobToFind, List<Person> myFriends, Map<Person, List<Person>> friendConnections) {
        Queue<Person> checkQueue = new LinkedList<>(myFriends);
        Person nullWorker = new Person();
        int counter = 0;

        while (!checkQueue.isEmpty()) {
            if (checkQueue.peek().getJob().equals(jobToFind)) {
                System.out.println("STEPS TO FIND = " + counter);
                return checkQueue.peek();
            }
            else {
                for (Person p:friendConnections.get(checkQueue.peek())) {
                    checkQueue.offer(p);
                }
                checkQueue.poll();
            }
            counter++;
        }
        System.out.println("STEPS TO FIND = " + counter);
        return nullWorker;
    }
}