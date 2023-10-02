package services.draw;

import data.PointData;
import shapes.IShape;
import shapes.Point;
import utils.debug;

public class DrawPoint implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Point))
            return;

        Point point = (Point) shape;
        debug.log("DRAW " + point.getClass().getName());

        PointData pointData = (PointData) point.getData();
        debug.log("X " + pointData.x + ", Y " + pointData.y);
    }
}
