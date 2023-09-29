package infrastructure;

import data.AppData;
import services.IInputService;
import services.IMapService;
import services.InputService;
import services.GoogleMapService;

public class App {

    public App() {
        start();
    }

    private void start() {

        AppData appData = AppData.getInstance();
        IMapService mapService = new GoogleMapService();
        IInputService inputService = new InputService(appData, mapService);

        inputService.inputPointsHandler();

    }
}
