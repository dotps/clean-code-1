package shapes;

public class StartPoint extends PointDecorator {

    static final String NAME = "Старт";

    public StartPoint(IPoint point) {
        super(point);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public String getName() {
        return super.getName() + " " + NAME;
    }

}
