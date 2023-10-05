package shapes;

import data.PointData;
import data.ShapeData;
import services.draw.IDrawStrategy;

import java.util.Arrays;
import java.util.List;

public abstract class Shape implements IShape {

    private ShapeData data;

    private IDrawStrategy drawStrategy;



    @Override
    public IDrawStrategy getDrawStrategy() {
        return drawStrategy;
    }

    public void setDrawStrategy(IDrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    public List<PointData> getAllPointsData() {
        return data.points;
    }

    public PointData getFirstPointData() {
        return data.points.get(0);
    }

    public void setData(ShapeData data) {
        this.data = data;
    }

    public ShapeData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "data=" + data +
                '}';
    }
}
