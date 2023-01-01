package solid_principles.liskov_substitution;

public class Bicycle implements Bike{
    private int speed;

    @Override
    public void turnOnEngine() {
        throw new RuntimeException("Cycle doesn't have any engine");
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
