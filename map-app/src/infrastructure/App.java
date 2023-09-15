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
        IInputService inputService = new InputService(appData);
        IMapService mapService = new GoogleMapService();

        inputService.inputPoints();
        inputService.inputTransport();

        mapService.buildPath(appData.currentPoints);

    }
}
