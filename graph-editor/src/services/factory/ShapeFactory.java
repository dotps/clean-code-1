package services.factory;

import data.ShapeData;
import shapes.*;
import utils.debug;

public class ShapeFactory implements IShapeFactory {

    @Override
    public IShape createShape(ShapeData shapeData) {

        Shapes shapeType = shapeData.shapeType;

        switch (shapeType) {
            case Point:
                return createPoint(shapeData);
            case Line:
                return createLine(shapeData);
            case Rectangle:
                return createRect(shapeData);
            case Ellipse:
                return createEllipse(shapeData);
            case Star:
                return null;
            default:
                return null;
        }
    }

    private static Line createLine(ShapeData shapeData) {
        Line shape = new Line();
        shape.setData(shapeData);
        return shape;
    }

    private static Rectangle createRect(ShapeData shapeData) {
        Rectangle shape = new Rectangle();
        shape.setData(shapeData);
        return shape;
    }

    private static Point createPoint(ShapeData shapeData) {
        Point shape = new Point();
        shape.setData(shapeData);
        return shape;
    }

    private static Ellipse createEllipse(ShapeData shapeData) {
        Ellipse shape = new Ellipse();
        shape.setData(shapeData);
        return shape;
    }
}
