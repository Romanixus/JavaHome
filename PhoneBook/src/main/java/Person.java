public class Person {
    private String name;
    private int number;
    private int number2;

    public Person() {
    }

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Person(String name, int number, int number2) {
        this.name = name;
        this.number = number;
        this.number2 = number2;

    }


    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public int getNumber2() {
        return number2;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return getName() + " " + getNumber() + getNumber2();
    }
}
