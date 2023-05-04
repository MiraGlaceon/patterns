package mira.space.factory.factories;

import mira.space.factory.transports.Ship;
import mira.space.factory.transports.Transport;

public class ShipFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Ship();
    }
}
