package services;

import shapes.*;
import transport.ITransport;

import java.util.ArrayList;
import java.util.List;

public class GoogleMapService implements IMapService {

    @Override
    public void buildAndDisplayPath(List<IPoint> points, List<ITransport> transports) {

        List<IPoint> pathPoints = calculationPath(points, transports);

        System.out.println("\nМаршрут должен быть проложен через " + points.size() + " точки");

        System.out.println("\nСпособ перемещения:");
        transports.forEach(transport -> {
            System.out.println(transport.getName());
        });

        System.out.println("\nМаршрут построен из " + pathPoints.size() + " точек");

        pathPoints.forEach(point -> {
            System.out.println();
            System.out.println(point.getName() + " " + point.toString());
            point.draw();
        });

    }

    private List<IPoint> calculationPath(List<IPoint> points, List<ITransport> transports) {

        int startIndex = 0;
        int finishIndex = points.size() - 1;

        List<IPoint> pathPoints = new ArrayList<>();

        IPoint startPoint = new StartPoint(points.get(startIndex));
        IPoint finishPoint = new FinishPoint(points.get(finishIndex));

        pathPoints.add(startPoint);
        addIntermediatePoints(pathPoints);
        pathPoints.add(finishPoint);

        return pathPoints;
    }

    private void addIntermediatePoints(List<IPoint> pathPoints) {
        pathPoints.add(new Point(10,10));
        pathPoints.add(new Point(11,10));
        pathPoints.add(new TransferPoint(new Point(12,10)));
        pathPoints.add(new Point(13,11));
        pathPoints.add(new Point(15,15));
    }
}
