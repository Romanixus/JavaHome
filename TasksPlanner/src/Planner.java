import java.util.ArrayList;

public class Planner<Task> {

    private final ArrayList<Task> planner = new ArrayList<>();


    public void add (Task task) {
        planner.add(task);
    }


    @Override
    public String toString() {
        return planner.toString();
    }
}
