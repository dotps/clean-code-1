package services;

import data.AppData;

import java.awt.*;
import java.util.ArrayList;

public class GoogleMapService implements IMapService {

    public GoogleMapService() {

    }

    @Override
    public String buildPath(ArrayList<Point> points) {
        return "Маршрут построен";
    }
}
