package lesson5;

public class FibonachiArray {
    private int[] basedArray;

    public FibonachiArray(int size) {
        this.basedArray = new int[size];
        basedArray[0] = 0;
        basedArray[1] = 1;
        for (int i = 2; i < basedArray.length; i++) {
            basedArray[i] = basedArray[i - 1] + basedArray[i - 2];
        }
    }

    public int get(int n){
        return basedArray[n];
    }
}
