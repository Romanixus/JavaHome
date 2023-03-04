public class Main {
    public static void main(String[] args) {
        GeoTree gt = new GeoTree();
        Person elena = new Person("Елена");
        Person lyudmila = new Person("Людмила");
        Person lyubov = new Person("Любовь");
        Person sergey = new Person("Сергей");
        Person ekaterina = new Person("Екатерина");
        Person olga = new Person("Ольга");
        Person irina = new Person("Ирина");
        Person roman = new Person("Роман");
        Person arseniy = new Person("Арсений");
        Person viktoria = new Person("Виктория");

        gt.appendChild(elena, lyudmila);
        gt.appendChild(elena, lyubov);
        gt.appendChild(elena, sergey);
        gt.appendChild(lyudmila, ekaterina);
        gt.appendChild(lyubov, olga);
        gt.appendChild(sergey, irina);
        gt.appendChild(olga, roman);
        gt.appendChild(olga, arseniy);
        gt.appendChild(olga, viktoria);

        System.out.println(new Research(gt).get(olga, Relationship.parent));
        System.out.println(new Research(gt).get(olga, Relationship.child));
    }
}
