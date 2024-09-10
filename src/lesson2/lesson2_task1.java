package lesson2;

public class lesson2_task1 {
    public static void main(String[] args) {
        Car porscheCayenne = new Car("Porsche Cayenne", "Михалишин Максим", "Черный", 2020);
        System.out.println(porscheCayenne);

        porscheCayenne.setColor("Красный");
        System.out.println(porscheCayenne);

        Car skodaOctavia = new Car("Skoda Octavia", 2014);
        System.out.println(skodaOctavia);

        Car defaultCar = new Car();
        System.out.println(defaultCar);
    }
}
