package lesson14;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Iterator<Student> iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
