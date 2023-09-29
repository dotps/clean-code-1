package services;

import data.AppData;
import data.IShapeData;
import data.PointData;
import shapes.*;
import utils.debug;

public class InputService implements IInputService {
    private final AppData appData;
    private final IMapService mapService;

    public InputService(AppData appData, IMapService mapService) {
        this.appData = appData;
        this.mapService = mapService;
    }

    @Override
    public void inputPointsHandler() {

//        appData.addPoint(new Point(0,0));
//        appData.addPoint(new Point(20,10));
//        appData.addPoint(new Point(50,30));

        IShape pointStart = new Point(0,0);
//        IShape pointFinish = new Point(10,10);

        pointStart.draw();
        pointStart.getData();
//        IShapeData data = pointStart.getData();
//        debug.log(data.);
//        pointFinish.draw();

//        IShape line = new Line(pointStart, pointFinish);
//        line.draw();
    }

}
