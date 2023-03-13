import java.util.ArrayList;

public class Wardrobe{

    private String model;
    ArrayList<Clothes> within = new ArrayList<>();
    public Wardrobe(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return this.model;
    }
    public void scrip() {
        System.out.println(model + " скрипит");
    }
}
