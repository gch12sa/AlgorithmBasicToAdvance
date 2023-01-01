package solid_principles.liskov_substitution;

public class Motorcycle implements Bike{
    private boolean isEngineOn;
    private int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;

    }
}
