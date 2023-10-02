package services.draw;

import shapes.IShape;
import shapes.Line;
import utils.debug;

public class DrawLine implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Line))
            return;

        Line line = (Line) shape;
        debug.log("DRAW");
        debug.log(line.getClass().getName());
    }
}
