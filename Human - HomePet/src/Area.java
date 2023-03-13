import java.util.ArrayList;

public class Area {

    private String name;

    ArrayList<Animal> population = new ArrayList<>();

    public Area(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void collaborationHD (Human human, Dog dog, String command){
        for(Animal animal : population){
            if (animal.equals(human)) {
                human.voice(command);
                for(Animal animal2 : population){
                    if (animal2.equals(dog)) {
                        dog.action(command);
                    }
                }
            }
        }
    }
}
