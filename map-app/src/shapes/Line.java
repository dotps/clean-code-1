package shapes;

import data.IShapeData;
import data.LineData;
import data.PointData;
import utils.debug;

import java.util.ArrayList;
import java.util.List;

public class Line implements IShape {

    public LineData data;

    public Line(Point pointStart, Point pointFinish) {
        List<Point> pointsOfLine = new ArrayList<>();
        pointsOfLine.add(pointStart);
        pointsOfLine.add(pointFinish);
        data = new LineData(pointsOfLine);
    }

    @Override
    public void draw() {
        debug.log("==");
        debug.log(this.getClass().getName());
        data.points.forEach(point -> {
            point.draw();
        });
        debug.log("==");
    }

//    @Override
//    public IShapeData getData() {
//        return null;
//    }
}
