import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Task {
    private String date;
    private String time;
    private String author;
    private String deadLine;
    private static int count;
    private String text;

    private int urgency;

    static {
        count = 0;
    }

    public Task(int daysToComplete, String author, int urgency, String text) {
        LocalDate localDate = LocalDate.now();
        this.author = author;
        this.time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.date = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.deadLine = localDate.plusDays(daysToComplete).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.urgency = urgency;
        this.text = text;

    }
    public Task(int daysToComplete, String author, String text) {
        LocalDate localDate = LocalDate.now();
        this.author = author;
        this.time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.date = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.deadLine = localDate.plusDays(daysToComplete).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.text = text;
    }
    public Task(String author, String text) {
        LocalDate localDate = LocalDate.now();
        this.author = author;
        this.time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.date = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.text = text;
    }

    public String getUrgency() {
        if (urgency < 0) return "низкая";
        if (urgency > 0) return "НЕМЕДЛЕННОЕ ВЫПОЛНЕНИЕ";
        return "средняя";
    }
    public void addUrgency(int urgency) {
        this.urgency = urgency;
    }


    public String getDeadLine() {
        if (deadLine != null) return deadLine;
        return "не задана";
    }

    @Override
    public String toString() {
        return "Задача №" + getId()
                + ", срочность -> " + getUrgency()
                + ", дата сдачи -> " + getDeadLine()
                + ", автор -> " + getAuthor()
                + "\n" + text + "\n"
                + "Cоздано " + date
                + " в " + time + "\n";

    }

    public int getId() {
        count += 1;
        return count;
    }


    public String getAuthor() {
        return author;
    }

    //    id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора


}
