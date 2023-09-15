package infrastructure;

import data.AppData;
import services.IInputService;
import services.IMapService;
import services.InputService;
import services.GoogleMapService;

public class App {

    public App() {
        startApp();
    }

    private void startApp() {

        AppData appData = AppData.getInstance();
        IInputService inputService = new InputService(appData);
        IMapService mapService = new GoogleMapService();

        inputService.init();

    }
}
