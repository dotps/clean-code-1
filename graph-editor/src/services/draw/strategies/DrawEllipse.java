package services.draw.strategies;

import data.PointData;
import services.draw.IDrawStrategy;
import shapes.IShape;
import utils.debug;

import java.util.List;

public class DrawEllipse implements IDrawStrategy {

    static final int INDEX_POINT = 0;
    static final int INDEX_RADIUS = 1;
    static final int COUNT_POINT_FOR_ELLIPSE = 20;

    @Override
    public void draw(IShape shape) {

        List<PointData> pointDataList = shape.getAllPointsData();
        if (pointDataList.size() != COUNT_POINT_FOR_ELLIPSE) {
            debug.error("DRAW. Неверные данные. Фигура дожна содержать 2 точки.");
            return;
        }

        PointData center = pointDataList.get(INDEX_POINT);
        double radiusX = pointDataList.get(INDEX_RADIUS).x;
        double radiusY = pointDataList.get(INDEX_RADIUS).y;

        debug.log("DRAW " + shape.getClass().getName());
        debug.log("X " + center.x + ", Y " + center.y + ", RADIUS X " + radiusX + ", RADIUS Y " + radiusY);
    }
}