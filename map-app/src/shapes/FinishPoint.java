package shapes;

public class FinishPoint extends PointDecorator {

    static final String NAME = "Финиш";

    public FinishPoint(IPoint point) {
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
