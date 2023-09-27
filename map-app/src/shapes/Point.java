package shapes;

public class Point implements IMyPoint {

    static final String NAME = "Точка";

    @Override
    public void draw() {
        System.out.println(NAME + ". Объект нарисован");
    }

    @Override
    public String getName() {
        return NAME;
    }
}
