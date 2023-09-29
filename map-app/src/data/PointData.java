package data;

public class PointData implements IShapeData {
    public float x;
    public float y;

    public PointData(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public IShapeData getData() {
        return this;
    }
}
