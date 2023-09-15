package services;

import java.awt.*;
import java.util.ArrayList;

public interface IMapService extends IService {
    String buildPath(ArrayList<Point> points);
}
