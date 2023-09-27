package shapes;

public class Point implements IPoint {

    private float x;
    private float y;

    static final String NAME = "Точка";

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(NAME + ". Объект нарисован");
    }

    @Override
    public String getName() {
        return NAME;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
