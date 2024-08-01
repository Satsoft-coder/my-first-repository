package Auto;

public class Passenger extends Car {
    int numberOfSeats;

    public Passenger(int PIN_CODE, Engine engine, Wheels wheels, License license, int numberOfSeats) {
        super(PIN_CODE, engine, wheels, license);
        this.numberOfSeats = numberOfSeats;
    }

//    public boolean checkKey(Driver driver){
//        int driverKey[]=driver.getDriverKey();
//            boolean result = false;
//
//        for (int i = 0; i < driverKey.length; i++) {
//            boolean isKeyPinCodeValid = driverKey[i] == Passenger.super.getPIN_CODE();
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
    public void move() {
    }

    @Override
    public void start() {
    }

    @Override
    public void open() {
    }

    @Override
    public void open(Driver driver) {
        String status;

        if (checkKey(driver)) {

            if (isOpen()) {
                setOpen(false);
                status="закрыт";
            }
            else{
                setOpen(true);
                status="открыт";
            };

            System.out.println("Водитель"+driver+
                    " воспользовался ключем "+super.getPIN_CODE()+" на пассажирский авто, " +
                    "теперь он "+status);
        }
        else {
            System.out.println("Водитель"+driver+ " не смог открыть пассажирский авто");
        }
    }
}
