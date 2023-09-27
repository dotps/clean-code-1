package shapes;

public abstract class MyPointDecorator implements IMyPoint {
    protected final IMyPoint point;

    protected MyPointDecorator(IMyPoint point) {
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

}
