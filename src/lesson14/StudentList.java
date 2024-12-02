package lesson14;

import java.util.ArrayList;

public class StudentList {
    private final ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
        students.add(new Student("Mikhalishin", "IVBO-20-23"));
        students.add(new Student("Burenchev", "IVBO-20-23"));
        students.add(new Student("Petrosyanc", "IVBO-20-23"));
        students.add(new Student("Nikhavana", "IVBO-20-23"));
    }

    private class ListIterator implements Iterator<Student> {
        int index = 0;
        public boolean hasNext() {return index < students.size();}
        public Student next() {return students.get(index++);}
    }

    public Iterator<Student> getIterator() {
        return new ListIterator();
    }
}
