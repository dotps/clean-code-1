package points;

import java.util.Random;

public class Point3D implements IPoint {
    float x;
    float y;
    float z;

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public IPoint getRandomPoint() {

        int x = new Random().nextInt(100) + 1;
        int y = new Random().nextInt(100) + 1;
        int z = new Random().nextInt(100) + 1;

        return new Point3D(x, y, z);
    }

    @Override
    public void draw() {

    }

    public String toString() {
        return "x=" + x + ", y=" + y + ", z=" + z;
    }
}
