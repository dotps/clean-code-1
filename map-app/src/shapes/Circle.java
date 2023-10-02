package shapes;

import data.CircleData;
import services.draw.DrawCircle;

public class Circle extends Shape {

    public Circle(Point centerPoint, float radius) {
        setData(new CircleData(centerPoint, radius));
        setDrawStrategy(new DrawCircle());
    }
}
