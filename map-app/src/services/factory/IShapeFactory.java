package services.factory;

import shapes.*;
import data.*;

public interface IShapeFactory {
    IShape createShape(ShapeData shapeData);
}
