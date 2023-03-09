public abstract class Thing {

    private String model;

    public Thing(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;

    }
}
