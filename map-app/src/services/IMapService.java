package services;

import points.IPoint;
import transport.ITransport;

import java.util.List;

public interface IMapService extends IService {

    void buildPath(List<IPoint> points, List<ITransport> transports);
}
