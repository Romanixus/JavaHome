public class Main {
    public static void main(String[] args) {
    Human human = new Human("Виталик");
    Dog dog = new Dog("Марат");

    System.out.println(human);
    System.out.println(dog);

    String command = "дай лапу";
    human.voice(command);
    dog.action(command);

    }
}