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
    public boolean checkKey(Driver driver){
        int driverKey[]=driver.getDriverKey();
        boolean result = false;

        for (int i = 0; i < driverKey.length; i++) {
            boolean isKeyPinCodeValid = driverKey[i] == PIN_CODE;
            /*
            key.getPIN_CODE() == PIN_CODE;
            CTRL + ALT + V
            boolean b = key.getPIN_CODE() == PIN_CODE;
            */
            if (isKeyPinCodeValid) return isKeyPinCodeValid;
        }
        return result;
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

    public abstract void open(Driver driver);
}
