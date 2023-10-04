package infrastructure;

import services.draw.DrawService;
import services.input.IInputService;
import services.input.InputService;

public class App {

    public App() {
        start();
    }

    private void start() {

        DrawService drawService = new DrawService();
        IInputService inputService = new InputService(drawService);

        inputService.inputShapesHandler();

    }
}
