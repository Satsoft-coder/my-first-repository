package Auto;

import java.util.Arrays;

public abstract class Car implements Openable,Startable,Moveble {
    private final int PIN_CODE;
    private boolean open;
    private boolean engineStart;

    Engine engine;
    Wheels[] wheels;
    License license;

    public Car(int PIN_CODE, Engine engine,License license) {
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

    public boolean checkLicense(Driver driver) {
        boolean result = false;
        if (driver.getLicenses() != null) {

            for (int i = 0; i < driver.getLicenses().length; i++) {
                boolean isLicenseValid = driver.getLicenses()[i] == license;

                if (isLicenseValid) return isLicenseValid;
            }
            return result;
        }
        else {
            System.out.println("У человека вообще нет прав");
            return result;
        }
    }

        public int getPIN_CODE () {
            return PIN_CODE;
        }

        public Engine getEngine () {
            return engine;
        }

        public Wheels[] getWheels () {
            return wheels;
        }

    public boolean isOpen() {
        return open;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isEngineStart() {
        return engineStart;
    }

    public void setEngineStart(boolean engineStart) {
        this.engineStart = engineStart;
    }

    public abstract void start(Driver driver);

    public abstract void open(Driver driver);

    public abstract void move(Driver driver);

    @Override
    public String toString() {
        return "Car{" +
                ", engineStart=" + engineStart +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", license=" + license +
                '}';
    }
}
