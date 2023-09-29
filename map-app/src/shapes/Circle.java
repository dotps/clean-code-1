package shapes;

import data.CircleData;
import data.IShapeData;
import data.LineData;
import utils.debug;

public class Circle implements IShape {

    public CircleData data;

    public Circle(Point centerPoint, float radius) {
        data = new CircleData(centerPoint, radius);
    }

    @Override
    public void draw() {
        debug.log("--");
        debug.log(this.getClass().getName());

        debug.log("--");
    }

//    @Override
//    public IShapeData getData() {
//        return null;
//    }
}
