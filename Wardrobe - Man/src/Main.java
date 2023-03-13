public class Main {
    public static void main(String[] args) {
        Human human = new Human("Кирилл");
        Wardrobe wardrobe = new Wardrobe("Шкаф");
        Clothes shirt = new Clothes("Рубашка");
        Clothes pants = new Clothes("Брюки");

        wardrobe.within.add(shirt);
        wardrobe.within.add(pants);

        human.get(shirt, wardrobe);
        human.get(pants, wardrobe);

        System.out.println(wardrobe.within);
    }
}