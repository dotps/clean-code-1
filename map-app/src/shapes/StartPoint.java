package shapes;

public class StartPoint extends PointDecorator {

    static final String NAME = "Старт";

    public StartPoint(IPoint point) {
        super(point);
    }

    @Override
    public void draw() {
        super.draw();
        drawStartIcon();
    }

    private void drawStartIcon() {
        System.out.println("Нарисована иконка " + NAME);
    }

    @Override
    public String getName() {
        return super.getName() + " " + NAME;
    }

}
