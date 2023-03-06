public class Human extends Animal {
    private String name;
    public static String command;
    public Human(String name) {
        super("Человек");
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
    public void voice (String command) {
        System.out.println(this.name + " говорит: '" + command + "'");
    }
}
