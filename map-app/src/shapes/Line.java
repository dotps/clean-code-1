package shapes;

import data.LineData;
import services.draw.DrawLine;

import java.util.ArrayList;
import java.util.List;

public class Line extends Shape {
    public Line(Point pointStart, Point pointFinish) {

        List<Point> pointsOfLine = new ArrayList<>();
        pointsOfLine.add(pointStart);
        pointsOfLine.add(pointFinish);

        setData(new LineData(pointsOfLine));
        setDrawStrategy(new DrawLine());
    }
}
