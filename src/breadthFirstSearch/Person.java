package breadthFirstSearch;

import java.util.*;

public class Person {
    public static Map<Person, List<Person>> friendConnections = new HashMap<>();
    private String _name;
    private String _surname;
    private String _job;
    private int _age;
    private String _cityOfResidence;

    // constructors --->
    Person() {
        this._name = "Unnamed";
        this._surname = "Anon";
        this._age = 0;
        this._job = "unemployed";
        this._cityOfResidence = "Milky Way";
        friendConnections.put(this, new ArrayList<>());
    }
    Person(String _name, String _surname, int _age, String _job, String _cityOfResidence) {
        this._name = _name;
        this._surname = _surname;
        this._age = _age;
        this._job = _job;
        this._cityOfResidence = _cityOfResidence;
        friendConnections.put(this, new ArrayList<>());
    }
    Person(String _name, String _surname, int _age, String _job, String _cityOfResidence, ArrayList<Person> friends) {
        this._name = _name;
        this._surname = _surname;
        this._age = _age;
        this._job = _job;
        this._cityOfResidence = _cityOfResidence;
        friendConnections.put(this, friends);
    }
    // ===========

    // getters --->
    public String getName() {
        return _name;
    }
    public String getSurname() {
        return _surname;
    }
    public String getJob() {
        return _job;
    }
    public int getAge() {
        return _age;
    }
    public String getCityOfResidence() {
        return _cityOfResidence;
    }
    // ===========

    // setters --->
    public void setName(String _name) {
        this._name = _name;
    }
    public void setSurname(String _surname) {
        this._surname = _surname;
    }
    public void setJob(String _job) {
        this._job = _job;
    }
    public void setAge(int _age) {
        this._age = _age;
    }
    public void setCityOfResidence(String _cityOfResidence) {
        this._cityOfResidence = _cityOfResidence;
    }
    // ===========

    // overrides --->
    @Override
    public String toString() {
        return "Person{" +
                "name='" + _name + '\'' +
                ", surname='" + _surname + '\'' +
                ", job='" + _job + '\'' +
                ", age=" + _age +
                ", cityOfResidence='" + _cityOfResidence + '\'' +
                '}';
    }
    // ===========

    public static Person findWorker(String jobToFind, List<Person> myFriends, Map<Person, List<Person>> friendConnections) {
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
