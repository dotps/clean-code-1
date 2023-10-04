package services.draw.strategies;

import data.PointData;
import services.draw.IDrawStrategy;
import shapes.IShape;
import utils.debug;

public class DrawPoint implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {
        PointData pointData = shape.getFirstPointData();
        debug.log("DRAW " + shape.getClass().getName());
        debug.log("X " + pointData.x + ", Y " + pointData.y);
    }
}
