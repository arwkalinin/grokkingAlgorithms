package breadthFirstSearch;

public class Person {
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
    }
    Person(String _name, String _surname, int _age, String _job, String _cityOfResidence) {
        this._name = _name;
        this._surname = _surname;
        this._age = _age;
        this._job = _job;
        this._cityOfResidence = _cityOfResidence;
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
    // ===========

    // setters --->
    public String getCityOfResidence() {
        return _cityOfResidence;
    }
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
}
