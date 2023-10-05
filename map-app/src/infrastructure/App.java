package infrastructure;

import services.draw.DrawService;
import services.factory.ShapeFactory;
import services.input.IInputService;
import services.input.InputService;
import services.saveload.SaveLoadService;

import java.io.IOException;

public class App {

    public App() throws IOException, ClassNotFoundException {
        start();
    }

    private void start() throws IOException, ClassNotFoundException {

        DrawService drawService = new DrawService();
        ShapeFactory shapeFactory = new ShapeFactory();
        SaveLoadService saveLoadService = new SaveLoadService(shapeFactory);
        IInputService inputService = new InputService(drawService, saveLoadService);

        inputService.inputShapesHandler();

    }
}
