package arrays.objects;

public class Main {
    public static void main(String[] args) {
        //Наполнить массивы объектами разных классов и распечатать информацию об этих
        //объектах в консоль

        Car car1=new Car("Tesla","Red");
        Car car2=new Car("BMW","Green");
        Human human1 = new Human(52,182);
        Human human2 = new Human(19,187);

        Object objectArray[]={car1,human1,car2,car2,human2};

        for (int i = 0; i < objectArray.length; i++) {
            System.out.println(objectArray[i]);
        }
    }

}
