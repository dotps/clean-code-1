package shapes;

public class StartPoint extends MyPointDecorator {

    static final String NAME = "Старт";

    public StartPoint(IMyPoint point) {
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
