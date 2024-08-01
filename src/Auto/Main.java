package Auto;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        //Create Engines
        Engine engine1=new Engine(1.6,"DOHC",Fuel.GASOLINT_95);
        Engine engine2=new Engine(1.7,"Isuzu",Fuel.DISEL);
        Engine engine3=new Engine(1.4,"TwinSpark",Fuel.GASOLINE_92);
        Engine engine4=new Engine(3.0,"TurboCompressor",Fuel.GASOLINT_95);

        //Create Wheels
        Wheels wheel1=new Wheels(17.0,"Dunlop",Season.WINTER);
        Wheels wheel2=new Wheels(13.2,"Belshina",Season.ALL_SEASONS);
        Wheels wheel3=new Wheels(20.5,"Pirelli",Season.SUMMER);

        //Create Drivers
        Driver driver1=new Driver(5);
        License[] lisenses1 = {License.A1, License.B};
        driver1.setLicenses (lisenses1);
        int key[]={45,44,43,42};
        driver1.setKeys(key);

        Driver driver2=new Driver(14);
        License[] lisenses2 = {License.C,License.DE};
        driver2.setLicenses (lisenses2);
        int key2[]={35,43};
        driver2.setKeys(key2);

        Driver driver3=new Driver(10);
        int key3[]={21,22,23,45,35};
        driver3.setKeys(key3);

        //Create Truck and PassengerCar
        Truck truck1=new Truck(35,engine4,wheel3,License.C,7000);
        Truck truck2=new Truck(22,engine4,wheel3,License.CE,8200);
        Passenger passenger1=new Passenger(43,engine1,wheel1,License.B,5);
        Passenger passenger2=new Passenger(22,engine2,wheel2,License.BE,10);
        Passenger passenger3=new Passenger(45,engine1,wheel1,License.A1,2);

        //действия
        passenger2.open(driver1);
        passenger1.open(driver1);

        truck1.open(driver1);
        truck1.open(driver2);
        truck1.open(driver3);
    }
}
