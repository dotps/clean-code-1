package services.draw;

import shapes.IShape;
import shapes.Point;
import utils.debug;

public class DrawPoint implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Point))
            return;

        Point point = (Point) shape;
        debug.log("DRAW");
        debug.log(point.getClass().getName());
    }
}
