package services;

import data.AppData;
import shapes.FinishPoint;
import shapes.IMyPoint;
import shapes.Point;
import shapes.StartPoint;
import transport.Bus;
import transport.Legs;

public class InputService implements IInputService {
    private final AppData appData;
    private final IMapService mapService;

    public InputService(AppData appData, IMapService mapService) {
        this.appData = appData;
        this.mapService = mapService;
    }

    @Override
    public void inputPointsHandler() {

        /*
        IPoint point = new Point2D(0,0);
//        IPoint point = new Point3D(0,0,0);

        for (int i = 0; i < 3; i++) {
            IPoint newPoint = point.getRandomPoint();
            appData.addPoint(newPoint);
        }
         */

        IMyPoint point = new Point();
        IMyPoint startPoint = new StartPoint(point);
        IMyPoint finishPoint = new FinishPoint(point);

        System.out.println(point.getName());
        System.out.println(startPoint.getName());

    }

    @Override
    public void inputTransportHandler() {
        appData.addTransport(new Legs());
        appData.addTransport(new Bus());
    }

    @Override
    public void buildPathHandler() {
        mapService.buildPath(appData.currentPoints, appData.currentTransport);
    }


}
