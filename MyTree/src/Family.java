import java.util.ArrayList;
import java.util.Objects;

public class Family {
    private ArrayList<String> family = new ArrayList<>();

    public ArrayList<String> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<String> family) {
        this.family = family;
    }

    public Family(String string, String father, String mother, String child1) {
        family.add(0, string);
        family.add(1, father);
        family.add(2, mother);
        family.add(3, child1);
    }

    public Family(String string, String father, String mother, String child1, String child2) {
        family.add(0, string);
        family.add(1, father);
        family.add(2, mother);
        family.add(3, child1);
        family.add(4, child2);
    }

    public Family(String string, String father, String mother, String child1, String child2, String child3) {
        family.add(0, string);
        family.add(1, father);
        family.add(2, mother);
        family.add(3, child1);
        family.add(4, child2);
        family.add(5, child3);
    }

    public void viewFamily() {
        System.out.println("Семья: " + family.get(0));
        System.out.println("Родители: " + family.get(1) + " и " + family.get(2));
        System.out.print("Дети: ");
        for (int i = 3; i < family.size(); i += 1)
            System.out.print(family.get(i) + "  ");
        System.out.println();
    }

    public void viewGrandparents(GeoTree geoTree) {
        for (Inheritage inheritage : geoTree.getGeoTree())
            for (Family familyFor : inheritage.getInheritage()) {
                if (Objects.equals(family.get(0), familyFor.get())) {
                    ArrayList<String> familyA = inheritage.get(0).getFamily();
                    ArrayList<String> familyH = inheritage.get(1).getFamily();
                    System.out.print("Дедушка и бабушка: ");
                    System.out.print(familyA.get(0) + " " + familyA.get(1) + " и " + familyA.get(2));
                    for (int i = 3; i < familyA.size(); i += 1) {
                        if (familyH.get(1).equals(familyA.get(i)))
                            System.out.println(" (по линии отца)");
                        else if (familyH.get(2).equals(familyA.get(i)))
                            System.out.println(" (по линии матери)");
                    }
                }
            }
    }
    @Override
    public String toString() {
        return family.get(0);
    }

    public String get() {
        return family.get(0);
    }
}
