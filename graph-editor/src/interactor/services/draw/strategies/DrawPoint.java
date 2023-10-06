package interactor.services.draw.strategies;

import data.PointData;
import interactor.services.draw.IDrawStrategy;
import interactor.shapes.IShape;
import utils.debug;

public class DrawPoint implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {
        PointData pointData = shape.getFirstPointData();
        debug.log("DRAW " + shape.getClass().getName());
        debug.log("X " + pointData.x + ", Y " + pointData.y);
    }
}
