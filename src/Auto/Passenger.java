package Auto;

public class Passenger extends Car {
    int numberOfSeats;

    public Passenger(int PIN_CODE, Engine engine, License license, int numberOfSeats) {
        super(PIN_CODE, engine, license);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void move() {
    }

    @Override
    public void start(Driver driver) {

        if (checkKey(driver) & isOpen() & !isEngineStart()) {
            setEngineStart(true);
            System.out.println("Авто заведен");
        }
        else {
            setEngineStart(false);
            System.out.println("Авто заглушен");
        }
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

    @Override
    public void move(Driver driver) {
        if (isOpen() & isEngineStart() & checkLicense(driver)) {
            System.out.println("Авто поехал (тормозов нет, если что :)");

        }
        else {
            System.out.println("Авто не может ехать (закрыт, не заведен или нет прав на управление)");
        }
    }

    @Override
    public void start() {

    }
}
