package lesson14;

public class Student {
    private final String surname;
    private final String group;

    public Student(String surname, String group) {
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
