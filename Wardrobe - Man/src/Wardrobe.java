public class Wardrobe {

    private String model;
    public Wardrobe(String model) {
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
        return model;
    }
    public String script() {
        return this.model + " скрипит";
    }
}
