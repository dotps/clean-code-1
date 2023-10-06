package data;

import interactor.shapes.Shapes;

import java.io.Serializable;
import java.util.List;

public class ShapeData implements Serializable {
    public List<PointData> points;
    public final Shapes shapeType;
    public ShapeData(List<PointData> points, Shapes shapeType) {
        this.points = points;
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return "ShapeData{" +
                "points=" + points +
                ", shapeType=" + shapeType +
                '}';
    }
}
