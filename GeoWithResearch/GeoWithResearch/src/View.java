public class View {
    public static void viewChildren(Person person, GeoTree geoTree){
        System.out.println(person.getName() + " дети: " + new Research(geoTree).get(person, Relationship.child));
    }
    public static void viewParents(Person person, GeoTree geoTree){
        System.out.println(person.getName() + " родители: " + new Research(geoTree).get(person, Relationship.parent));
    }
}
