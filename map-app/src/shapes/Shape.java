package shapes;

import data.IShapeData;
import services.draw.IDrawStrategy;

public abstract class Shape implements IShape {

    private IShapeData data;

    private IDrawStrategy drawStrategy;

    @Override
    public IDrawStrategy getDrawStrategy() {
        return drawStrategy;
    }

    public void setDrawStrategy(IDrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    public IShapeData getData() {
        return data;
    }

    public void setData(IShapeData data) {
        this.data = data;
    }
}
