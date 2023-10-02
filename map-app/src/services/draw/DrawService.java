package services.draw;

import services.IService;
import shapes.IShape;

public class DrawService implements IService {

    public void draw(IShape shape) {
        IDrawStrategy drawStrategy = shape.getDrawStrategy();
        drawStrategy.draw(shape);
    }

}
