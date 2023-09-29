package shapes;

import data.IShapeData;
import data.PointData;
import utils.debug;
public class Point implements IShape {
//    private final float x;
//    private final float y;

    private IShapeData data;

    public Point(float x, float y) {
        data = new PointData(x, y);
    }

    public void draw() {
        debug.log(this.getClass().getName());
//        debug.log(data.getData());
        IShapeData d = data.getData();
//        debug.log(data.x);
//        data.x
//        debug.log(y);
//        debug.log(thickness);
//        debug.log(color);
    }

    @Override
    public IShapeData getData() {
        return null;
    }

}
