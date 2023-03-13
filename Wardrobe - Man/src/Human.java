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
    public void open(Wardrobe model){
        System.out.println(this.name + " открывает " + model);
    }

    public void get(Clothes clothes, Wardrobe wardrobe){
        open(wardrobe);
        for (Clothes clothes1 : wardrobe.within) {
            if (clothes1.equals(clothes)) {
                System.out.println(this.name + " берёт " + clothes);
            }
        }
        wardrobe.within.removeIf(clothes2 -> clothes2.equals(clothes));
        close(wardrobe.getModel());
        wardrobe.scrip();
        System.out.println();
    }

    public void close(String model){
        System.out.println(this.name + " закрывает " + model);
    }

}
