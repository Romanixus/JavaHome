public class Clothes extends Thing {
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
        String thingClass = super.toString();
        return thingClass + " " + this.model;
    }
}
