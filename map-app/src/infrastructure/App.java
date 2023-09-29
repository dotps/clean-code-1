package infrastructure;

import data.AppData;
import services.*;

public class App {

    public App() {
        start();
    }

    private void start() {

        AppData appData = AppData.getInstance();
        DrawFactory drawFactory = new DrawFactory();
        IInputService inputService = new InputService(appData, drawFactory);

        inputService.inputShapesHandler();

    }
}
