package shapes;

import data.LineData;
import data.PointData;

import java.util.ArrayList;
import java.util.List;

public class RectangleCalc {

    public static List<Point> getRectangleVertexPoints(List<Point> pointsRange) {

        List<Point> points = new ArrayList<>();

        Point startCornerPoint = pointsRange.get(0);
        PointData startCornerPointData = (PointData) startCornerPoint.getData();

        Point finishCornerPoint = pointsRange.get(1);
        PointData finishCornerPointData = (PointData) finishCornerPoint.getData();

        points.set(0, startCornerPoint);
        points.set(1, new Point(finishCornerPointData.x, startCornerPointData.y));
        points.set(2, new Point(startCornerPointData.x, finishCornerPointData.y));
        points.set(3, finishCornerPoint);

        return points;
    }

}
