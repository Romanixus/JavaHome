import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(ArrayList<Node> geoTree) {
        this.tree = geoTree;
    }

    public ArrayList<String> get(Person person, Relationship relationship) {
        for (Node node : tree) {
            if (node.person1.getName().equals(person.getName()) && node.relationship == relationship) {
                result.add(node.person2.getName());
            }
        }
        return result;
    }
}
