package lesson9;

public class B extends A{
    private final String NAME;


    public B(int n) {
        super(n);
        this.NAME = "B" + n;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
