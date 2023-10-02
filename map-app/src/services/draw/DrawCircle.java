package services.draw;

import shapes.Circle;
import shapes.IShape;
import utils.debug;

public class DrawCircle implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Circle))
            return;

        Circle circle = (Circle) shape;
        debug.log("DRAW " + circle.getClass().getName());
    }
}
