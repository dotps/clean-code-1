package services;

import data.AppData;
import shapes.*;

public class InputService implements IInputService {
    private final AppData appData;
    private final DrawFactory drawFactory;

    public InputService(AppData appData, DrawFactory drawFactory) {
        this.appData = appData;
        this.drawFactory = drawFactory;
    }

    @Override
    public void inputShapesHandler() {

        IShape pointStart = new Point(0,0);
        IShape pointFinish = new Point(10,10);

        IShape line = new Line(new Point(5,5), new Point(15,15));

        drawFactory.create(pointStart);
        drawFactory.create(pointFinish);
        drawFactory.create(line);

        pointStart.draw();

    }

}
