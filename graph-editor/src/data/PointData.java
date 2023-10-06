package data;

import shapes.Point;

import java.io.Serializable;
import java.util.List;

public class PointData implements Serializable {
    public double x;
    public double y;

    public PointData(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
