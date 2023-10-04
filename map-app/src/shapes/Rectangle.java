package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.strategies.DrawLine;
import java.util.List;

public class Rectangle extends Shape {
    public Rectangle(Point pointStart, Point pointFinish) {

        List<PointData> pointDataList = RectangleCalc.getVertexPoints(pointStart.getFirstPointData(), pointFinish.getFirstPointData());

        setData(new ShapeData(pointDataList));
        setDrawStrategy(new DrawLine());
    }
}
