package services;

import data.AppData;
import shapes.*;
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
        appData.addPoint(new Point(0,0));
        appData.addPoint(new Point(20,10));
        appData.addPoint(new Point(50,30));
    }

    @Override
    public void inputTransportHandler() {
        appData.addTransport(new Legs());
        appData.addTransport(new Bus());
    }

    @Override
    public void buildPathHandler() {
        mapService.buildAndDisplayPath(appData.currentPoints, appData.currentTransport);
    }


}
