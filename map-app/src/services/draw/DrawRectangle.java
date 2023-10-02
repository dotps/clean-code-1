package services.draw;

import data.IShapeData;
import data.LineData;
import services.draw.IDrawStrategy;
import shapes.*;
import utils.debug;

public class DrawRectangle implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Rectangle))
            return;

        Rectangle rect = (Rectangle) shape;
        debug.log("DRAW " + rect.getClass().getName());

        LineData rectData = (LineData) rect.getData();

        RectangleCalc.getRectangleVertexPoints(rectData.points);


    }
}
