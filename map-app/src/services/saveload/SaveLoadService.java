package services.saveload;

import data.ShapeData;
import services.IService;
import services.factory.IShapeFactory;
import services.factory.ShapeFactory;
import utils.debug;
import shapes.*;

import java.io.*;

public class SaveLoadService implements ISaveLoadService {

    public static final String SAVE_FILE = "D:\\save.txt";
    private final IShapeFactory shapeFactory;

    public SaveLoadService(IShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void saveShape(ShapeData data) throws IOException {

        debug.log("SAVED " + data);

        FileOutputStream fileOutputStream = new FileOutputStream(SAVE_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(data);
        objectOutputStream.close();
    }

    public IShape loadShape() throws IOException, ClassNotFoundException {

        ShapeData shapeData = loadShapeData();
        IShape shape = shapeFactory.createShape(shapeData);
        debug.log("LOADED");

        return shape;
    }

    public ShapeData loadShapeData() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(SAVE_FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ShapeData data = (ShapeData) objectInputStream.readObject();
        objectInputStream.close();

        return data;
    }
}
