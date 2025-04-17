package task.collection;

public class Student {
    int age;
    String name;

    // Создание списка студентов:
//- Создайте класс Student с полями name и age.
//- Создайте метод, который будет принимать список студентов и выводить их на экран.
//- Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}