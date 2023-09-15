package services;

import data.AppData;

import java.awt.*;
import java.util.Scanner;

public class InputService implements IInputService {
    private final AppData appData;
    Scanner scanner;

    public InputService(AppData appData) {
        this.appData = appData;
        scanner = new Scanner(System.in);
    }

    @Override
    public void init() {
        Point point = getPoint();
        appData.addPoint(point);
    }

    @Override
    public Point getPoint() {

        System.out.print("Input point X: ");
        int x = scanner.nextInt();

        System.out.print("Input point Y: ");
        int y = scanner.nextInt();

        return new Point(x, y);
    }
}
