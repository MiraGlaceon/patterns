package mira.space.factory;

import mira.space.factory.factories.CarFactory;
import mira.space.factory.factories.TransportFactory;
import mira.space.factory.transports.Transport;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        Transport car = factory.create();
        System.out.println(car.getName());
    }
}
