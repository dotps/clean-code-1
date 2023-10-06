import services.draw.DrawService;
import services.draw.IDrawService;
import services.factory.IShapeFactory;
import services.factory.ShapeFactory;
import services.input.IInputService;
import services.input.InputService;
import services.saveload.ISaveLoadService;
import services.saveload.SaveLoadService;
import shapes.IShape;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        IDrawService drawService = new DrawService();
        IShapeFactory shapeFactory = new ShapeFactory();
        ISaveLoadService saveLoadService = new SaveLoadService(shapeFactory);
        IInputService inputService = new InputService(drawService, saveLoadService, shapeFactory);

        inputService.inputShapesHandler();

    }
}