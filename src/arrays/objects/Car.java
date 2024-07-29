package arrays.objects;

public class Car {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
