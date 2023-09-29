package shapes;

import data.IShapeData;
import utils.debug;

public class Circle implements IShape {
    private final IShape centerPoint;
    private final float radius;

    public Circle(IShape centerPoint, float radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    @Override
    public void draw() {
        debug.log("--");
        debug.log(this.getClass().getName());

        debug.log("--");
    }

    @Override
    public IShapeData getData() {
        return null;
    }
}
