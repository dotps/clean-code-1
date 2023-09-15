package services;

import points.IPoint;
import java.util.List;

public class GoogleMapService implements IMapService {

    public GoogleMapService() {

    }

    @Override
    public void buildPath(List<IPoint> points) {
        System.out.println("Маршрут построен из " + points.size() + " точек");
    }
}
