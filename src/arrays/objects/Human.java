package arrays.objects;

public class Human {
    int age;
    int hight;

    public Human(int age, int hight) {
        this.age = age;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", hight=" + hight +
                '}';
    }
}
