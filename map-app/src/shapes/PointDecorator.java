package shapes;

public abstract class PointDecorator implements IPoint {
    protected final IPoint point;

    protected PointDecorator(IPoint point) {
        this.point = point;
    }

    @Override
    public void draw() {
        point.draw();
    }

    @Override
    public String getName() {
        return point.getName();
    }

    public String toString() {
        return point.toString();
    }

}
