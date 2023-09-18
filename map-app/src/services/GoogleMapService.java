package services;

import points.IPoint;
import transport.ITransport;

import java.util.List;

public class GoogleMapService implements IMapService {

    @Override
    public void buildPath(List<IPoint> points, List<ITransport> transports) {

        System.out.println("Маршрут построен из " + points.size() + " точек");
        System.out.println("Способ перемещения:");
        transports.forEach(transport -> {
            System.out.println(transport.getName());
        });

//        String transportList = "";
//        for (ITransport transport : transports)
//            transportList += transport.getName() + " ";
//        System.out.println("Способ перемещения: " + transportList);
    }
}
