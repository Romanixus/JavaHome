import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        this.tree = geoTree.getTree();
    }


    public ArrayList<String> get(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getName() == p.getName() && t.re == re) {
                result.add(t.p2.getName());
            }
        }
        return result;
    }


}