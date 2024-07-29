package Auto;

public abstract class Car {
    private final int PIN_CODE;
    Engine engine;
    Wheels wheels;
    int numberOfSeats;
    DriversLicense driversLicense;

    public Car(int PIN_CODE, Engine engine, Wheels wheels, int numberOfSeats, DriversLicense driversLicense) {
        this.PIN_CODE = PIN_CODE;
        this.engine = engine;
        this.wheels = wheels;
        this.numberOfSeats = numberOfSeats;
        this.driversLicense = driversLicense;
    }

    public int getPIN_CODE() {
        return PIN_CODE;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public DriversLicense getDriversLicense() {
        return driversLicense;
    }

}
