package shapes;

public class TransferPoint extends MyPointDecorator {

    static final String NAME = "Пересадка";

    public TransferPoint(IMyPoint point) {
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
