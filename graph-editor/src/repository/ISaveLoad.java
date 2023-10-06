package repository;

import data.ShapeData;

public interface ISaveLoad {
    boolean saveShapeData(ShapeData data);
    ShapeData loadShapeData();
}
