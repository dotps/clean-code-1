package shapes;

public class TransferPoint extends PointDecorator {

    static final String NAME = "Пересадка";

    public TransferPoint(IPoint point) {
        super(point);
    }

    @Override
    public void draw() {
        drawBackgroundLayer();
        super.draw();
        startAnimation();
    }

    private void drawBackgroundLayer() {
        System.out.println("Нарисован фон " + NAME);
    }

    private void startAnimation() {
        System.out.println("Анимация запущена " + NAME);
    }

    @Override
    public String getName() {
        return super.getName() + " " + NAME;
    }

}
