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

        gt.appChild(elena, lyudmila);
        gt.appChild(elena, lyubov);
        gt.appChild(elena, sergey);
        gt.appChild(lyudmila, ekaterina);
        gt.appChild(anatoliy, olga);
        gt.appChild(lyubov, olga);
        gt.appChild(sergey, irina);
        gt.appChild(olga, roman);
        gt.appChild(olga, arseniy);
        gt.appChild(olga, viktoria);

        View.viewChildren(olga, gt);
        View.viewParents(olga, gt);
    }
}
