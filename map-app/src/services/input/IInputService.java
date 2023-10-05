package services.input;

import services.IService;

import java.io.IOException;

public interface IInputService extends IService {
    void inputShapesHandler() throws IOException, ClassNotFoundException;
}
