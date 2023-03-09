public class Main {
    public static void main(String[] args) {
        Human human = new Human("Кирилл");
        Wardrobe wardrobe = new Wardrobe("Шкаф");
        Door doorR = new Door("Правая");
        Door doorL = new Door("Левая");
        Clothes shirt = new Clothes("Рубашка");
        Clothes pants = new Clothes("Брюки");

        System.out.println(human);
        System.out.println(doorR);
        System.out.println(doorL);
        System.out.println(wardrobe);
        System.out.println(shirt);
        System.out.println(pants);

        human.open(doorR.toString());
        human.get(shirt.toString());
        human.close(doorR.toString());
        wardrobe.scrip();
        human.open(doorL.toString());
        human.get(pants.toString());
        human.close(doorL.toString());
    }
}