package shapes;

import services.draw.IDrawStrategy;

public interface IShape {
    IDrawStrategy getDrawStrategy();
}
