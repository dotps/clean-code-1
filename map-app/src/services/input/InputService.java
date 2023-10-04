package services.input;

import services.draw.DrawService;
import shapes.*;
import utils.debug;

public class InputService implements IInputService {
    private final DrawService drawService;

    public InputService(DrawService drawService) {
        this.drawService = drawService;
    }

    @Override
    public void inputShapesHandler() {

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

    }

}
