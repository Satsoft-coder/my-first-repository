package Auto;

public class Passenger extends Car {
    int numberOfSeats;

    public Passenger(int PIN_CODE, Engine engine, Wheels wheels, License license, int numberOfSeats) {
        super(PIN_CODE, engine, wheels, license);
        this.numberOfSeats = numberOfSeats;
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
}
