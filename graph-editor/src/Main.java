import interactor.services.draw.DrawService;
import interactor.services.draw.IDrawService;
import interactor.services.factory.IShapeFactory;
import interactor.services.factory.ShapeFactory;
import interactor.services.input.IInputService;
import interactor.services.input.InputService;
import interactor.services.saveload.ISaveLoadService;
import interactor.services.saveload.SaveLoadService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        IDrawService drawService = new DrawService();
        IShapeFactory shapeFactory = new ShapeFactory();
        ISaveLoadService saveLoadService = new SaveLoadService(shapeFactory);
        IInputService inputService = new InputService(drawService, saveLoadService, shapeFactory);

        inputService.inputShapesHandler();
    }
}