package shapes;

import data.PointData;
import services.draw.DrawPoint;

public class Point extends Shape {

    public Point(float x, float y) {
        setData(new PointData(x, y));
        setDrawStrategy(new DrawPoint());
    }

}
