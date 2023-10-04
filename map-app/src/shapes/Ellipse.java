package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.strategies.DrawEllipse;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Shape {

    public Ellipse(Point centerPoint, double radius) {

        List<PointData> pointDataList = new ArrayList<>();
        pointDataList.add(centerPoint.getFirstPointData());
        pointDataList.add(new PointData(radius, radius));

        setData(new ShapeData(pointDataList));
        setDrawStrategy(new DrawEllipse());
    }
}
