package shapes;

import data.IShapeData;
import data.PointData;
import utils.debug;
public class Point implements IShape {
//    private final float x;
//    private final float y;

    private PointData data;

    public Point(float x, float y) {
        data = new PointData(x, y);
    }

    public void draw() {
        debug.log(this.getClass().getName());
        debug.log(data.x);
        debug.log(data.y);
    }



}
