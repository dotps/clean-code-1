package shapes;

import data.PointData;
import services.draw.IDrawStrategy;

import java.util.List;

public interface IShape {
    IDrawStrategy getDrawStrategy();
    PointData getFirstPointData();
    List<PointData> getAllPointsData();
}
