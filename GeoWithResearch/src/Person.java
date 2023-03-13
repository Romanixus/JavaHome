public class Person {
    private String name;
    private int birthdate;
    private boolean died;
    static int currentDate;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public Person(String name, int birthdate, boolean died) {
        this.name = name;
        this.birthdate = birthdate;
        this.died = died;
    }
    public Person(String name, boolean died) {
        this.name = name;
        this.died = died;
    }

    public Person() {

    }

    public int getAge() {
        if (birthdate == 0) return 0;
        if (died) return 0;
        return (currentDate - birthdate) /10000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isDied() {
        return died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    @Override
    public String toString() {
        return name;
    }
}
