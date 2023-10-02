package shapes;

import data.StarData;
import services.draw.DrawStar;

import java.util.ArrayList;
import java.util.List;

public class Star extends Shape {
    public Star(Point pointStartArea, Point pointFinishArea) {

        List<Point> points = StarCalc.getStarVertexPoints(pointStartArea, pointFinishArea);

        setData(new StarData(points));
        setDrawStrategy(new DrawStar());
    }


}
