package infrastructure;

import services.*;
import services.draw.DrawService;

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
