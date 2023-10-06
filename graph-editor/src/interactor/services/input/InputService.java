package interactor.services.input;

import interactor.services.draw.IDrawService;
import interactor.services.factory.IShapeFactory;
import interactor.services.saveload.ISaveLoadService;
import interactor.shapes.*;
import utils.debug;

import java.io.IOException;

public class InputService implements IInputService {
    private final IDrawService drawService;
    private final ISaveLoadService saveLoadService;
    private final IShapeFactory shapeFactory;

    public InputService(IDrawService drawService, ISaveLoadService saveLoadService, IShapeFactory shapeFactory) {
        this.drawService = drawService;
        this.saveLoadService = saveLoadService;
        this.shapeFactory = shapeFactory;
    }

    @Override
    public void inputShapesHandler() {

        Point point = shapeFactory.createPoint(0, 0);

        Line line = shapeFactory.createLine(
            shapeFactory.createPoint(5, 5),
            shapeFactory.createPoint(15,15)
        );

        Rectangle rect = shapeFactory.createRect(
            shapeFactory.createPoint(10,10),
            shapeFactory.createPoint(50,50)
        );

        Ellipse ellipse = shapeFactory.createEllipse(
            shapeFactory.createPoint(10,10),
            shapeFactory.createPoint(100,100)
        );

        drawService.draw(point);
        debug.log("=====");
        drawService.draw(line);
        debug.log("=====");
        drawService.draw(rect);
        debug.log("=====");
        drawService.draw(ellipse);
        debug.log("=====");
//        drawService.draw(star);

        saveLoadService.saveShape(rect.getData());
        IShape loadedShape = saveLoadService.loadShape();

        drawService.draw(loadedShape);

    }

}
