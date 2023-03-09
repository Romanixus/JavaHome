public class Dog extends Animal implements Actionable {
    private String name;
    public Dog(String name) {
        super("Пёс");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.name;
    }

    @Override
    public void action(String command) {
        if (command != null) {
            switch (command) {
                case "голос" -> System.out.println(name + " гавкает");
                case "лежать" -> System.out.println(name + " ложится");
                case "сидеть" -> System.out.println(name + " садится");
                case "служить" -> System.out.println(name + " встаёт на задние лапы");
                default -> System.out.println(name + " не понимает, что от него хотят");
            }
        }
    }
}
