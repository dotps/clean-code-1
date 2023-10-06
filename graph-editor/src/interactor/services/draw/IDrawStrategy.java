package interactor.services.draw;

import interactor.shapes.IShape;

public interface IDrawStrategy {
    void draw(IShape shape);
}
