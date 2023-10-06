package services.draw;

import shapes.IShape;

public class DrawService implements IDrawService {

    public void draw(IShape shape) {
        IDrawStrategy drawStrategy = shape.getDrawStrategy();
        drawStrategy.draw(shape);
    }

}
