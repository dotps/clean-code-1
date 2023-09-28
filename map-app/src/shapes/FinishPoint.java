package shapes;

public class FinishPoint extends PointDecorator {

    static final String NAME = "Финиш";

    public FinishPoint(IPoint point) {
        super(point);
    }

    @Override
    public void draw() {
        super.draw();
        drawFinishIcon();
    }

    private void drawFinishIcon() {
        System.out.println("Нарисована иконка " + NAME);
    }

    @Override
    public String getName() {
        return super.getName() + " " + NAME;
    }

}
