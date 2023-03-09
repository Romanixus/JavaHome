public class Main {
    public static void main(String[] args) {
        GeoTree gt = new GeoTree();

        Person elena = new Person("Елена");
        Person lyudmila = new Person("Людмила");
        Person anatoliy = new Person("Анатолий");
        Person lyubov = new Person("Любовь");
        Person sergey = new Person("Сергей");
        Person ekaterina = new Person("Екатерина");
        Person olga = new Person("Ольга");
        Person irina = new Person("Ирина");
        Person roman = new Person("Роман");
        Person arseniy = new Person("Арсений");
        Person viktoria = new Person("Виктория");

        gt.addChild(elena, lyudmila);
        gt.addChild(elena, lyubov);
        gt.addChild(elena, sergey);
        gt.addChild(lyudmila, ekaterina);
        gt.addChild(anatoliy, olga);
        gt.addChild(lyubov, olga);
        gt.addChild(sergey, irina);
        gt.addChild(olga, roman);
        gt.addChild(olga, arseniy);
        gt.addChild(olga, viktoria);

        gt.view(olga, Relationship.parent);
        gt.view(olga, Relationship.child);

    }
}
