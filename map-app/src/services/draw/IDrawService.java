package services.draw;

import services.IService;
import shapes.IShape;

public interface IDrawService extends IService {
    void draw(IShape shape);
}
