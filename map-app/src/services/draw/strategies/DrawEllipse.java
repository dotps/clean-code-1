package services.draw.strategies;

import data.PointData;
import services.draw.IDrawStrategy;
import shapes.IShape;
import utils.debug;

import java.util.List;

public class DrawEllipse implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {
        debug.log("DRAW " + shape.getClass().getName());

        List<PointData> pointDataList = shape.getAllPointsData();
        PointData center = pointDataList.get(0);
        double radiusX = pointDataList.get(1).x;
        double radiusY = pointDataList.get(1).y;

        debug.log("X " + center.x + ", Y " + center.y + ", RADIUS X " + radiusX + ", RADIUS Y " + radiusY);
    }
}
