package data;

import shapes.IShape;
import transport.ITransport;

import java.util.ArrayList;
import java.util.List;

public class AppData {
    private static final AppData INSTANCE = new AppData();

    public List<IShape> currentPoints = new ArrayList<>();
    public List<ITransport> currentTransport = new ArrayList<>();

    private AppData() {
    }

    public static AppData getInstance() {
        return INSTANCE;
    }

    public void addPoint(IShape point) {
        currentPoints.add(point);
//        System.out.println(point.toString());
    }

    public void addTransport(ITransport transport) {
        if (!currentTransport.contains(transport))
            currentTransport.add(transport);
    }
}
