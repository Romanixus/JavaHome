import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(ArrayList<Node> geoTree) {
        this.tree = geoTree;
    }

    public ArrayList<String> get(Person p, Relationship re) {
        for (Node node : tree) {
            if (Objects.equals(node.person1.getName(), p.getName()) && node.relationship == re) {
                result.add(node.person2.getName());
            }
        }
        return result;
    }
}
