public class Human extends Animal {
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
    public String open(String model){
        return this.name + " открывает " + model;
    }
    public String get(String model){
        return this.name + " берёт " + model;
    }
    public String close(String model){
        return this.name + " закрывает " + model;
    }

}
