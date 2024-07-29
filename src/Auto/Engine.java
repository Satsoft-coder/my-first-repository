package Auto;

public class Engine {
    Double engineCapacity;
    String name;
    Fuel fuel;

    public Engine(Double engineCapacity, String name, Fuel fuel) {
        this.engineCapacity = engineCapacity;
        this.name = name;
        this.fuel = fuel;
    }
}
