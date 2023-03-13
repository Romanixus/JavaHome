import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class GeoTree {
    private final ArrayList<Node> tree = new ArrayList<>();
    LinkedHashSet<String> lineageSet = new LinkedHashSet<>();
    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addChild(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.isParent, child));
        tree.add(new Node(child, Relationship.isChild, parent));
    }


    public void view(Person person, Relationship relationship){
        if (relationship == Relationship.isParent)
            System.out.println(person.getName() + " дети: " + new Research(tree).get(person, Relationship.isParent));
        if (relationship == Relationship.isChild)
            System.out.println(person.getName() + " родители: " + new Research(tree).get(person, Relationship.isChild));
    }

    public HashSet<String> viewAll(){
        HashSet<String> viewSet = new HashSet<>();
        for (Node node : tree) {
            if (node.person1.isDied()) viewSet.add(node.person1.getName() + " x" );
            else viewSet.add(node.person1.getName() + " " + node.person1.getAge());
        }
        return viewSet;
    }

    public LinkedHashSet<String> viewLineage(Person person){
        for (Node node : tree) {
            if (node.person1.getName() == person.getName() && node.relationship == Relationship.isParent) {
                lineageSet.add(node.person1.getName() + " " + new Research(tree).get(person, Relationship.isParent));
                viewLineage(node.person2);
                }
            }
        return lineageSet;
    }
}
