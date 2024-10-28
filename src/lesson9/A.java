package lesson9;

public class A {
    private final String NAME;

    public A(int n){
        this.NAME = "A" + n;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
