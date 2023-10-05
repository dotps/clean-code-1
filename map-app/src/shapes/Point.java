package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.strategies.DrawPoint;

import java.util.ArrayList;
import java.util.List;

public class Point extends Shape {

    public Point(double x, double y) {

        List<PointData> pointDataList = new ArrayList<>();
        pointDataList.add(new PointData(x,y));

        setData(new ShapeData(pointDataList, Shapes.Point));
        injectDrawStrategy();
    }

    public Point() {
        injectDrawStrategy();
    }

    private void injectDrawStrategy() {
        setDrawStrategy(new DrawPoint());
    }

}
