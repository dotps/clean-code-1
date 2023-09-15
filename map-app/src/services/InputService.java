package services;

import data.AppData;
import points.IPoint;
import points.Point2D;
import points.Point3D;
import transport.Car;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class InputService implements IInputService {
    private final AppData appData;
    Scanner scanner;

    public InputService(AppData appData) {

        this.appData = appData;
        scanner = new Scanner(System.in);
    }

    @Override
    public void inputPoints() {

        IPoint point = new Point2D(0,0);
//        IPoint point = new Point3D(0,0,0);

        for (int i = 0; i < 3; i++) {
            IPoint newPoint = point.getRandomPoint();
            appData.addPoint(newPoint);
            System.out.println(newPoint.toString());
        }
    }

    @Override
    public void inputTransport() {
        appData.addTransport(new Car());
    }


}
