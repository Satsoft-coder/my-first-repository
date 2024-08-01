package Auto;

public class Truck extends Car {
    int loadCapacity;

    public Truck(int PIN_CODE, Engine engine, License license, int loadCapacity) {
        super(PIN_CODE, engine, license);
        this.loadCapacity = loadCapacity;
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
    public void open(Driver driver) {

        String status;
        if (checkKey(driver)) {

            if (isOpen()) {
                setOpen(false);
                status = "закрыт";
            } else {
                setOpen(true);
                status = "открыт";
            }
            ;

            System.out.println("Водитель" + driver +
                    " воспользовался ключем " + super.getPIN_CODE() + " на грузовой авто, " +
                    "теперь он " + status);
        }
            else{
                System.out.println("Водитель" + driver + " не смог открыть грузовой авто");
            }
        }

    @Override
    public void move(Driver driver) {

            if (isOpen() & isEngineStart() & checkLicense(driver)) {
                System.out.println("Грузовик поехал (тормозов нет, если что :)");

            }
            else {
                System.out.println("Грузовик не может ехать (закрыт, не заведен или нет прав на управление");
            }
    }

    @Override
    public void start() {

    }

    @Override
    public void open() {

    }
}

