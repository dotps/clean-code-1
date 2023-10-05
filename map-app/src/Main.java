import services.draw.DrawService;
import services.factory.ShapeFactory;
import services.input.IInputService;
import services.input.InputService;
import services.saveload.SaveLoadService;
import shapes.IShape;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DrawService drawService = new DrawService();
        ShapeFactory shapeFactory = new ShapeFactory();
        SaveLoadService saveLoadService = new SaveLoadService(shapeFactory);
        IInputService inputService = new InputService(drawService, saveLoadService);

        inputService.inputShapesHandler();

    }
}