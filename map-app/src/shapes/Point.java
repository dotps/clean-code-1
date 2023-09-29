package shapes;

import data.IShapeData;
import data.PointData;
import data.ShapeDataTest;
import utils.debug;
public class Point implements IShape {

    public PointData data;

    public Point(float x, float y) {
        data = new PointData(x, y);
    }

    public void draw() {
        debug.log(this.getClass().getName());
        debug.log(data.x);
        debug.log(data.y);
    }

//    @Override
//    public IShapeData getData() {
//        return data;
//    }


}
