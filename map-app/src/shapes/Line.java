package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.strategies.DrawLine;

import java.util.ArrayList;
import java.util.List;

public class Line extends Shape {
    public Line(Point pointStart, Point pointFinish) {

        List<PointData> pointDataList = new ArrayList<>();
        pointDataList.add(pointStart.getFirstPointData());
        pointDataList.add(pointFinish.getFirstPointData());

        setData(new ShapeData(pointDataList));
        setDrawStrategy(new DrawLine());
    }
}
