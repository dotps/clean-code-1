package services.draw;

import data.IShapeData;
import data.LineData;
import data.PointData;
import shapes.IShape;
import shapes.Line;
import utils.debug;

public class DrawLine implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Line))
            return;

        Line line = (Line) shape;
        debug.log("DRAW " + line.getClass().getName());

        LineData lineData = (LineData) line.getData();
        lineData.points.forEach(point -> {
            PointData pointData = (PointData) point.getData();
            debug.log("X " + pointData.x + ", Y " + pointData.y);
        });

    }
}
