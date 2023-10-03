package shapes;

import data.PointData;

import java.util.ArrayList;
import java.util.List;

public class RectangleCalc {

    public static List<Point> getVertexPoints(List<Point> pointsRange) {

        List<Point> points = new ArrayList<>();

        Point startCornerPoint = pointsRange.get(0);
        PointData startCornerPointData = (PointData) startCornerPoint.getData();

        Point finishCornerPoint = pointsRange.get(1);
        PointData finishCornerPointData = (PointData) finishCornerPoint.getData();

        points.add(startCornerPoint);
        points.add(new Point(finishCornerPointData.x, startCornerPointData.y));
        points.add(finishCornerPoint);
        points.add(new Point(startCornerPointData.x, finishCornerPointData.y));

        return points;
    }

    public static List<Line> getLines(List<Point> pointsRange) {

        List<Line> lines = new ArrayList<>();

        Point startCornerPoint = pointsRange.get(0);
        PointData startCornerPointData = (PointData) startCornerPoint.getData();

        Point finishCornerPoint = pointsRange.get(1);
        PointData finishCornerPointData = (PointData) finishCornerPoint.getData();

        lines.add(new Line(startCornerPoint, new Point(finishCornerPointData.x, startCornerPointData.y)));
        lines.add(new Line(new Point(finishCornerPointData.x, startCornerPointData.y), finishCornerPoint));
        lines.add(new Line(finishCornerPoint, new Point(startCornerPointData.x, finishCornerPointData.y)));
        lines.add(new Line(new Point(startCornerPointData.x, finishCornerPointData.y), startCornerPoint));

        return lines;
    }

}
