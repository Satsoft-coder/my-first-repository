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
    public void open(Driver driver) {
        if (checkKey(driver)) {
            System.out.println("Водитель"+driver+ " открыл грузовой авто ключем "+super.getPIN_CODE());
        }
        else {
            System.out.println("Водитель"+driver+ " не смог открыть авто");
        }
    }

//    private boolean checkKey(Driver driver) {
//        int driverKey[]=driver.getDriverKey();
//        boolean result = false;
//
//        for (int i = 0; i < driverKey.length; i++) {
//            boolean isKeyPinCodeValid = driverKey[i] == Truck.super.getPIN_CODE();
//            /*
//            key.getPIN_CODE() == PIN_CODE;
//            CTRL + ALT + V
//            boolean b = key.getPIN_CODE() == PIN_CODE;
//            */
//            if (isKeyPinCodeValid) return isKeyPinCodeValid;
//        }
//        return result;
//    }


    @Override
    public void start() {

    }

    @Override
    public void open() {

    }
}
