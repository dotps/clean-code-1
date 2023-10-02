package services.draw;

import services.draw.IDrawStrategy;
import shapes.Circle;
import shapes.IShape;
import shapes.Rectangle;
import utils.debug;

public class DrawRectangle implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Rectangle))
            return;

        Rectangle rect = (Rectangle) shape;
        debug.log("DRAW");
        debug.log(rect.getClass().getName());
        debug.log(rect.getData());

    }
}
