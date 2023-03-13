public class Main {
    public static void main(String[] args) {
    Human human = new Human("Виталик");
    Dog dog = new Dog("Марат");
    Area yard = new Area("Дворик");

    System.out.println(human);
    System.out.println(dog);

    yard.population.add(human);
    yard.collaborationHD(human, dog, "лежать");
    }
}