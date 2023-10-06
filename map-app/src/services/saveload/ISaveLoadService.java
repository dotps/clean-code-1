package services.saveload;

import data.ShapeData;
import services.IService;
import shapes.IShape;

import java.io.IOException;

public interface ISaveLoadService extends IService {
    void saveShape(ShapeData data) throws IOException;
    IShape loadShape() throws IOException, ClassNotFoundException;
}
