package shapes;

import services.draw.DrawRectangle;

public class Rectangle extends Line {
    public Rectangle(Point pointStart, Point pointFinish) {
        super(pointStart, pointFinish);
        setDrawStrategy(new DrawRectangle());
    }
}
