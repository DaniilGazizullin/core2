package task.collection;

//Управление задачами:
//    - Создайте класс Task с полями id, title и completed.
//    - Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//    - Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.
public class Task {
    int id;
    String title;
    boolean isCompleted;

    public Task(int id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

}