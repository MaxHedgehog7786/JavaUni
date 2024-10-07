package lesson6;

public class Person {
    private String FIO;

    public Person(String FIO) throws Exception {
        if (FIO.split(" ").length < 3){
            throw new Exception("Вы не ввели фамилию, имя или отчество!");
        }

        String name = FIO.split(" ")[0];
        for (char c : name.toCharArray()) {
            if (((int) c < 1040 || (int) c > 1105) && (int) c != 1025) {
                throw new Exception("Имя должно состоять из букв!");
            }
        }
        if ((int) name.toCharArray()[0] > 1072){
            throw new Exception("Имя должно начинаться с заглавной буквы!");
        }
        if (name.length() < 3){
            throw new Exception("Имя должно состоять минимум из трех букв!");
        }
        if (name.length() > 15){
            throw new Exception("Имя должно состоять максимум из 15 букв!");
        }

        String surname = FIO.split(" ")[1];
        for (char c : surname.toCharArray()) {
            if (((int) c < 1040 || (int) c > 1105) && (int) c != 1025) {
                throw new Exception("Фамилия должна состоять из букв!");
            }
        }
        if ((int) surname.toCharArray()[0] > 1072){
            throw new Exception("Фамилия должна начинаться с заглавной буквы!");
        }
        if (surname.length() < 3){
            throw new Exception("Фамилия должна состоять минимум из трех букв!");
        }
        if (surname.length() > 15){
            throw new Exception("Фамилия должна состоять максимум из 15 букв!");
        }

        String fatherName = FIO.split(" ")[2];
        for (char c : fatherName.toCharArray()) {
            if (((int) c < 1040 || (int) c > 1105) && (int) c != 1025) {
                throw new Exception("Отчество должно состоять из букв!");
            }
        }
        if ((int) fatherName.toCharArray()[0] > 1072){
            throw new Exception("Отчество должно начинаться с заглавной буквы!");
        }
        if (fatherName.length() < 3){
            throw new Exception("Отчество должно состоять минимум из трех букв!");
        }
        if (fatherName.length() > 15){
            throw new Exception("Отчество должно состоять максимум из 15 букв!");
        }

        if (name.equals(surname) || surname.equals(fatherName) || fatherName.equals(name)){
            throw new Exception("Все три слова должны быть различны!");
        }

        this.FIO = FIO;
    }
}
