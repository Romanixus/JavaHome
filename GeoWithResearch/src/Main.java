public class Main {
    public static void main(String[] args) {
        GeoTree gt = new GeoTree();
        Person.currentDate = 2023_03_11;

        Person elena = new Person("Елена", 1925_06_03, true);
        Person lyudmila = new Person("Людмила", 1954_06_16);
        Person lyubov = new Person("Любовь", 1960_06_23);
        Person sergey = new Person("Сергей", 1956_06_14, true);
        Person ekaterina = new Person("Екатерина", 1976_06_20);
        Person olga = new Person("Ольга", 1979_10_29);
        Person irina = new Person("Ирина", 1980_04_08);
        Person natalia = new Person("Наталья", 1987_01_06);
        Person viktoria = new Person("Виктория", 1998_03_27);
        Person aleksandra = new Person("Александра", 1998_09_02);
        Person varvara = new Person("Варвара", 2007_04_04);
        Person saveliy = new Person("Савелий", 2016_03_21);
        Person roman = new Person("Роман", 2001_05_05);
        Person arseniy = new Person("Арсений", 2010_08_16);
        Person viktoria2 = new Person("Виктория", 2020_04_01);
        Person kirill = new Person("Кирилл", 2016_05_13);
        Person ulyana = new Person("Ульяна", 2018_04_01);

        gt.addChild(elena, lyudmila);
        gt.addChild(elena, lyubov);
        gt.addChild(elena, sergey);
        gt.addChild(lyudmila, ekaterina);
        gt.addChild(lyubov, olga);
        gt.addChild(sergey, irina);
        gt.addChild(sergey, natalia);
        gt.addChild(ekaterina, viktoria);
        gt.addChild(irina, aleksandra);
        gt.addChild(irina, varvara);
        gt.addChild(irina, saveliy);
        gt.addChild(olga, roman);
        gt.addChild(olga, arseniy);
        gt.addChild(olga, viktoria2);
        gt.addChild(natalia, kirill);
        gt.addChild(natalia, ulyana);

        gt.view(elena, Relationship.isChild);
        gt.view(olga, Relationship.isParent);

        System.out.println(elena.isDied());
        System.out.println(roman.getAge());
        System.out.println(gt.viewAll());
        System.out.println(gt.viewLineage(elena));

    }
}
