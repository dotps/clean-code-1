package data;

import shapes.IShape;
import shapes.Point;

import java.util.ArrayList;
import java.util.List;

public class LineData implements IShapeData {
    public List<Point> points;

    public LineData(List<Point> points) {
        this.points = points;
    }
}
