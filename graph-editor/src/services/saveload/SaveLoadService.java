package services.saveload;

import data.ShapeData;
import repository.FileSaveLoad;
import repository.ISaveLoad;
import services.factory.IShapeFactory;
import utils.debug;
import shapes.*;

public class SaveLoadService implements ISaveLoadService {
    private final IShapeFactory shapeFactory;
    private final ISaveLoad saveLoad = new FileSaveLoad();

    public SaveLoadService(IShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void saveShape(ShapeData data) {
        if (saveLoad.saveShapeData(data))
            debug.log("SAVED " + data);
    }

    public IShape loadShape() {

        ShapeData shapeData = saveLoad.loadShapeData();
        IShape shape = shapeFactory.createShape(shapeData);
        debug.log("LOADED");

        return shape;
    }


}
