package shapes;

import data.PointData;
import services.draw.DrawPoint;

public class Point extends Shape {

    public Point(double x, double y) {
        setData(new PointData(x, y));
        setDrawStrategy(new DrawPoint());
    }

}
