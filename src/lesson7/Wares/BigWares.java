package lesson7.Wares;

public class BigWares {

    private static int remains = 0;

    public void addWare(){
        remains++;
    }

    public void removeWare(){
        remains--;
    }

    public void getRemainsInfo(){
        System.out.println("Осталось " + remains + " товаров большого размера.");
    }
}
