package interactor.services.draw.strategies;

import data.PointData;
import interactor.services.draw.IDrawStrategy;
import interactor.shapes.IShape;
import utils.debug;

import java.util.List;

public class DrawLine implements IDrawStrategy {
    @Override
    public void draw(IShape shape) {
        debug.log("DRAW " + shape.getClass().getName());
        List<PointData> pointDataList = shape.getAllPointsData();
        pointDataList.forEach(pointData -> {
            debug.log("X " + pointData.x + ", Y " + pointData.y);
        });
    }
}
