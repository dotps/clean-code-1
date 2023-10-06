package services.factory;

import shapes.*;
import data.*;

public interface IShapeFactory {
    IShape createShape(ShapeData shapeData);
    Point createPoint(double x, double y);
    Line createLine(Point pointStart, Point pointFinish);
    Rectangle createRect(Point pointStart, Point pointFinish);
    Ellipse createEllipse(Point centerPoint, Point radius);
}
