package services;

import shapes.Circle;
import shapes.IShape;
import shapes.Line;
import shapes.Point;
import utils.debug;

public class DrawFactory implements IService {

    public void create(IShape shape) {

        if (shape instanceof Point) {
            createPoint((Point) shape);
        }
        else if (shape instanceof Line) {
            createLine((Line) shape);
        }
        else if (shape instanceof Circle) {
            createCircle((Circle) shape);
        }
    }

    private void createCircle(Circle shape) {
        debug.log("Create Circle");
    }

    private void createPoint(Point point) {
        debug.log("Create Point " + point.data.x + "," + point.data.y);
    }

    private void createLine(Line line) {
        debug.log("Create Line");
        line.data.points.forEach(point -> {
            createPoint((Point) point);
        });
    }

}


