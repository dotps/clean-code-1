package shapes;

public class TransferPoint extends PointDecorator {

    static final String NAME = "Пересадка";

    public TransferPoint(IPoint point) {
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
