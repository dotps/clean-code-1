package interactor.services.saveload;

import data.ShapeData;
import interactor.services.IService;
import interactor.shapes.IShape;

public interface ISaveLoadService extends IService {
    void saveShape(ShapeData data);
    IShape loadShape();
}
