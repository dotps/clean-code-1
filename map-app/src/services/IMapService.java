package services;

import shapes.IPoint;
import transport.ITransport;

import java.util.List;

public interface IMapService extends IService {

    void buildAndDisplayPath(List<IPoint> points, List<ITransport> transports);
}
