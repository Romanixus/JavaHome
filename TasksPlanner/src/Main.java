public class Main {
    public static void main(String[] args) {
        Planner<Task> taskPlanner = new Planner<>();

        Task task = new Task( 7, "Кирилл А.О.", "Выучить стих");
        Task task1 = new Task(3, "Магдалена К.Ю", 1, "Написать домашнюю работу");
        Task task2 = new Task("Игорь Д.З.", "Поменять резину");
        task2.addUrgency(-1);

        taskPlanner.add(task);
        taskPlanner.add(task1);
        taskPlanner.add(task2);

        System.out.println(taskPlanner);



    }
}