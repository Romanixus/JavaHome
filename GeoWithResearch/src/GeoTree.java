import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendChild(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.child, child));
        tree.add(new Node(child, Relationship.parent, parent));
    }
}
