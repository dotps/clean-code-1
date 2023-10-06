package interactor.services.draw;

import interactor.services.IService;
import interactor.shapes.IShape;

public interface IDrawService extends IService {
    void draw(IShape shape);
}
