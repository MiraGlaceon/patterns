package mira.space.factory.factories;

import mira.space.factory.transports.Car;
import mira.space.factory.transports.Transport;

public class CarFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Car();
    }
}
