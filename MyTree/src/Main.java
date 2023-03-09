public class Main {
    public static void main(String[] args) {
        GeoTree geoTree = new GeoTree();
        Family ogarkov = new Family("Огарковы", "Александр", "Ольга", "Роман", "Арсений", "Виктория");
        Family ashichmin = new Family("Ашихмины", "Леонид", "Любовь", "Ольга");
        Inheritage ashOga = new Inheritage(ashichmin, ogarkov);

        geoTree.add(ashOga);
        ogarkov.viewFamily();
        ogarkov.viewGrandparents(geoTree);

    }
}