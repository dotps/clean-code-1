package services.draw;

import data.IShapeData;
import data.PointData;
import data.StarData;
import shapes.IShape;
import shapes.Point;
import shapes.Star;
import utils.debug;

public class DrawStar implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Star))
            return;

        Star star = (Star) shape;
        StarData starData = (StarData) star.getData();

        debug.log("DRAW " + star.getClass().getName());

        starData.points.forEach(point -> {
            IDrawStrategy drawStrategy = point.getDrawStrategy();
            drawStrategy.draw(point);
        });
    }
}
