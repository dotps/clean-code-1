package services;

import points.IPoint;
import java.util.List;

public interface IMapService extends IService {
    void buildPath(List<IPoint> points);
}
