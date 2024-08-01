package Auto;

public class Truck extends Car {
    int loadCapacity;

    public Truck(int PIN_CODE, Engine engine, Wheels wheels, License license, int loadCapacity) {
        super(PIN_CODE, engine, wheels, license);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {

    }

    @Override
    public void open() {

    }

    @Override
    public void start() {

    }

    @Override
    public void open(Driver driver) {

    }
}
