public class Human extends Animal implements Gettable {
    private String name;
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
        String animalClass = super.toString();
        return animalClass + " " + this.name;
    }
    public void open(String model){
        System.out.println(this.name + " открывает " + model);
    }
    public void get(String model){
        System.out.println(this.name + " берёт " + model);
    }
    public void close(String model){
        System.out.println(this.name + " закрывает " + model);
    }

}
