public class Node {
    Person person1;
    Relationship relationship;
    Person person2;

    public Node(Person p1, Relationship re, Person p2) {
        this.person1 = p1;
        this.relationship = re;
        this.person2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relationship, person2);
    }

}
