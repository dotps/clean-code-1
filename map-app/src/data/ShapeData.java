package data;

import shapes.Point;

import java.io.Serializable;
import java.util.List;

public class ShapeData implements Serializable {
    public List<PointData> points;
    public ShapeData(List<PointData> points) {
        this.points = points;
    }
}
