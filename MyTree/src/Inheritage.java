import java.util.ArrayList;

public class Inheritage {
    private ArrayList<Family> inheritage = new ArrayList<>();
    public Inheritage() {
    }

    public ArrayList<Family> getInheritage() {
        return inheritage;
    }
    public void setInheritage(ArrayList<Family> inheritage) {
        this.inheritage = inheritage;
    }

    public Inheritage(Family ancestor, Family heir1) {
        inheritage.add(0, ancestor);
        inheritage.add(1, heir1);
    }
    public void viewInheritage () {
        Family ancestor = inheritage.get(0);
        System.out.println("Предшественник: " + ancestor.get());
        System.out.print("Наследники: ");
        for (int i = 1; i < inheritage.size(); i+=1) {
            Family heir = inheritage.get(i);
            System.out.print(heir.get() + "  ");
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return inheritage.toString();
    }

    protected Family get(int i) {
        return inheritage.get(i);
    }
}
