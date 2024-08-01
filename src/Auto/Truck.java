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
    public void start() {

    }

    @Override
    public void open() {

    }
}

