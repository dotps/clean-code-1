package services.draw;

import data.LineData;
import shapes.*;
import utils.debug;

import java.util.List;

public class DrawRectangle implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {

        if (!(shape instanceof Rectangle))
            return;

        Rectangle rect = (Rectangle) shape;
        debug.log("DRAW " + rect.getClass().getName());

        LineData rectData = (LineData) rect.getData();

        List<Line> lines = RectangleCalc.getLines(rectData.points);

        lines.forEach(line -> {
            IDrawStrategy drawStrategy = line.getDrawStrategy();
            drawStrategy.draw(line);
        });
    }
}
