package data;

import shapes.IShape;

import java.util.ArrayList;
import java.util.List;

public class LineData {
    public List<IShape> points = new ArrayList<>();

    public LineData(List<IShape> points) {
        this.points = points;
    }
}
