package mira.space.factory.transports;

public class Ship implements Transport{
    @Override
    public long getSpeed() {
        return 100;
    }

    @Override
    public String getColor() {
        return "Grey";
    }

    @Override
    public String getName() {
        return "Titanic";
    }

    @Override
    public double getWeight() {
        return 100000;
    }
}
