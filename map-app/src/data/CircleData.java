package data;

import shapes.IShape;
import shapes.Point;

public class CircleData implements IShapeData {
    public Point centerPoint;
    public float radius;

    public CircleData(Point centerPoint, float radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }
}
