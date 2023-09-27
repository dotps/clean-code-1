package points;

import java.util.Random;

public class Point2D implements IPoint {
    float x;
    float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public IPoint getRandomPoint() {

        int x = new Random().nextInt(100) + 1;
        int y = new Random().nextInt(100) + 1;

        return new Point2D(x, y);
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
