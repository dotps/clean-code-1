package services;

import data.AppData;
import points.IPoint;
import points.Point2D;
import points.Point3D;
import transport.Bus;
import transport.Car;
import transport.Legs;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class InputService implements IInputService {
    private final AppData appData;

    public InputService(AppData appData) {
        this.appData = appData;
    }

    @Override
    public void inputPoints() {

        IPoint point = new Point2D(0,0);
//        IPoint point = new Point3D(0,0,0);

        for (int i = 0; i < 3; i++) {
            IPoint newPoint = point.getRandomPoint();
            appData.addPoint(newPoint);
        }
    }

    @Override
    public void inputTransport() {
        appData.addTransport(new Legs());
        appData.addTransport(new Bus());
    }


}
