package task.collection;

public class AttendanceStudent {
    String name;
    String attendance;

    public AttendanceStudent(String name, String attendance) {
        this.attendance = attendance;
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AttendanceStudent{" +
                "name='" + name + '\'' +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}