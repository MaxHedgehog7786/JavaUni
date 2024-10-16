package lesson7.Wares;

public class MidWares {
    private static int remains = 0;

    public void addWare(){
        remains++;
    }

    public void removeWare(){
        if (remains == 0){
            System.out.println("Товаров нет на складе, убирать нечего!");
            return;
        }
        remains--;
    }

    public void getRemainsInfo(){
        System.out.println("Осталось " + remains + " товаров среднего размера.");
    }
}
