public class Clothes extends Wardrobe {
    private String model;
    public Clothes(String model) {
        super("Одежда");
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        String wardrobeClass = super.toString();
        return this.model + " (" + wardrobeClass + ")";
    }
}
