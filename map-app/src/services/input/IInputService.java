package services.input;

import services.IService;
import shapes.*;

import java.io.IOException;

public interface IInputService extends IService {
    void inputShapesHandler() throws IOException, ClassNotFoundException;
}
