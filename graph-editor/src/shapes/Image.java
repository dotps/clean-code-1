package shapes;

import services.draw.strategies.DrawLine;

import java.util.ArrayList;
import java.util.List;

public class Image extends Shape {

    List<IShape> shapes = new ArrayList<>();

    public Image(List<IShape> shapes) {
        this.shapes = shapes;

//        data = new ImageData(shapes);
        setDrawStrategy(new DrawLine());
    }
}
