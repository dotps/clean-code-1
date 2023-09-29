package shapes;

import data.IShapeData;
import utils.debug;

import java.util.ArrayList;
import java.util.List;

public class Line implements IShape {
    private final List<IShape> linePoints = new ArrayList<>();

    public Line(IShape pointStart, IShape pointFinish) {
        linePoints.add(pointStart);
        linePoints.add(pointFinish);
//        thickness = pointStart.th
    }

    @Override
    public void draw() {
        debug.log("==");
        debug.log(this.getClass().getName());
        linePoints.forEach(point -> {
            point.draw();
        });
        debug.log("==");
    }

    @Override
    public IShapeData getData() {
        return null;
    }
}
