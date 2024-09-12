package org.example.ex2;
//2. Написать свой класс котором будет:
//2.1 метод который принимает 1 параметр, его обрабатывает и выбрасывать checked эксепшн
//(который вы должны написать сами) при условиях заданных вами
//2.2 Класс который будет наследовать предыдущий класс и перекрывать написанный вами метод и
//добавлять туда свой чекед эксепшн (новый написанный также вами)
public class Main {
    public static void main(String[] args) throws NotEnoughEnergy {
        int energyAll=15;

        Room room =new Room(5,2);
        Room room1=new Room(5,5);

        try {
            room.startLamp(energyAll);
        }catch (NotEnoughEnergy | NotEnoughAllEnergy e){
            System.out.println(e);
        }

        try {
            room1.startLamp(energyAll);
        } catch (NotEnoughEnergy | NotEnoughAllEnergy e){
            System.out.println(e);
        }

        System.out.println(room);
        System.out.println(room1);

        Workplace workplace=new Workplace(5,2,10);

        try {
        workplace.startLamp(energyAll);
            System.out.println(workplace.toString());}
        catch (NotEnoughAllEnergy e){
            System.out.println(e);
        }

    }
}
