package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.strategies.DrawEllipse;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Shape {

    public Ellipse(Point centerPoint, Point radius) {

        List<PointData> pointDataList = new ArrayList<>();
        pointDataList.add(centerPoint.getFirstPointData());
        pointDataList.add(radius.getFirstPointData());

        setData(new ShapeData(pointDataList, Shapes.Ellipse));
        injectDrawStrategy();
    }

    public Ellipse() {
        injectDrawStrategy();
    }

    private void injectDrawStrategy() {
        setDrawStrategy(new DrawEllipse());
    }
}
