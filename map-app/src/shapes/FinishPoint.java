package shapes;

public class FinishPoint extends MyPointDecorator {

    static final String NAME = "Финиш";

    public FinishPoint(IMyPoint point) {
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
