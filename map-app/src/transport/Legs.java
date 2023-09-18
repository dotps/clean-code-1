package transport;

public class Legs extends Transport {
    static final String NAME = "Пешком";
    static final float SPEED = 2;

    public Legs() {
        super(NAME, SPEED);
    }
}
