package data;

import transport.ITransport;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private static final AppData INSTANCE = new AppData();

    public List<Point> pointsList = new ArrayList<>();
    public List<ITransport> transportList = new ArrayList<>();;

    private AppData() {
    }

    public static AppData getInstance() {
        return INSTANCE;
    }

    public void addPoint(Point point) {
        pointsList.add(point);
    }
}
