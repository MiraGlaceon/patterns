package mira.space.factory.transports;

public class Car implements Transport{

    @Override
    public long getSpeed() {
        return 200;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getName() {
        return "KIA";
    }

    @Override
    public double getWeight() {
        return 1200;
    }
}
