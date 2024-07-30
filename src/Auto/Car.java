package Auto;

public abstract class Car implements Openable,Startable,Moveble {
    private final int PIN_CODE;
    Engine engine;
    Wheels wheels;

    License license;

    public Car(int PIN_CODE, Engine engine, Wheels wheels,
               License license) {
        this.PIN_CODE = PIN_CODE;
        this.engine = engine;
        this.wheels = wheels;
        this.license = license;
    }

        public int getPIN_CODE () {
            return PIN_CODE;
        }

        public Engine getEngine () {
            return engine;
        }

        public Wheels getWheels () {
            return wheels;
        }
}
