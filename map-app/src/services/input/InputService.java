package services.input;

import services.draw.DrawService;
import services.draw.IDrawService;
import services.factory.IShapeFactory;
import services.factory.ShapeFactory;
import services.saveload.ISaveLoadService;
import services.saveload.SaveLoadService;
import shapes.*;
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
    public void inputShapesHandler() throws IOException, ClassNotFoundException {

        Point point = new Point(0,0);
        Line line = new Line(new Point(5,5), new Point(15,15));
        Rectangle rect = new Rectangle(new Point(10,10), new Point(50,50));
        Ellipse ellipse = new Ellipse(new Point(10,10), 100);
//        Star star = new Star(new Point(5,5), new Point(15,15));

        drawService.draw(point);
        debug.log("=====");
        drawService.draw(line);
        debug.log("=====");
        drawService.draw(rect);
        debug.log("=====");
        drawService.draw(ellipse);
        debug.log("=====");
//        drawService.draw(star);

        saveLoadService.saveShape(ellipse.getData());
        IShape loadedShape = saveLoadService.loadShape();

        drawService.draw(loadedShape);

    }

}
