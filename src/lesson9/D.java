package lesson9;

public class D extends C{
    private final String NAME;

    public D(int n) {
        super(n);
        this.NAME = "D" + n;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
