package lesson9;

public class C extends A{
    private final String NAME;

    public C(int n) {
        super(n);
        this.NAME = "C" + n;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
