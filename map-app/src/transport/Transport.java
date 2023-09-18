package transport;

public class Transport implements ITransport {
    private String name;
    private float speed;

    public Transport(String name, float speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }
}
