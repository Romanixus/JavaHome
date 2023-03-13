public class Clothes {
    private String model;
    public Clothes(String model) {
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
        return this.model;
    }
}
