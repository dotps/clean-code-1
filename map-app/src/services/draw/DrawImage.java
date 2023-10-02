package services.draw;

import shapes.IShape;
import shapes.Image;
import utils.debug;

public class DrawImage implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Image))
            return;

        Image image = (Image) shape;
        debug.log("DRAW");
        debug.log(image.getClass().getName());
    }
}
