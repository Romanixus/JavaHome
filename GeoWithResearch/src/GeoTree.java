import java.util.ArrayList;

public class GeoTree {
    private final ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addChild(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.child, child));
        tree.add(new Node(child, Relationship.parent, parent));
    }


    public void view(Person person, Relationship relationship){
        if (relationship == Relationship.child)
            System.out.println(person.getName() + " дети: " + new Research(tree).get(person, Relationship.child));
        if (relationship == Relationship.parent)
            System.out.println(person.getName() + " родители: " + new Research(tree).get(person, Relationship.parent));
    }
}
