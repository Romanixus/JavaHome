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

        System.out.println(human.open(doorR.toString()));
        System.out.println(human.get(shirt.getModel()));
        System.out.println(human.close(doorR.toString()));
        System.out.println(wardrobe.script());
        System.out.println(human.open(doorL.toString()));
        System.out.println(human.get(pants.getModel()));
        System.out.println(human.close(doorL.toString()));
    }
}