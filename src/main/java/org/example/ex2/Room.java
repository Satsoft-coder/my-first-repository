package org.example.ex2;

public class Room {
    int numberOfLamps;
    int powerLamp;
    boolean lampOn;

    public boolean isLampOn() {
        return lampOn;
    }

    public Room(int numberOfLamps, int powerLamp) {
        this.numberOfLamps = numberOfLamps;
        this.powerLamp = powerLamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfLamps=" + numberOfLamps +
                ", powerLamp=" + powerLamp +
                ", lampOn=" + lampOn +
                '}';
    }

    public void startLamp(int energy) throws NotEnoughEnergy, NotEnoughAllEnergy {
        if (energy>powerLamp*numberOfLamps){
            lampOn=true;
        }else {
            throw new NotEnoughEnergy("Мощности в "+energy+"Вт не хватает для включения ламп");
        }
    }
}
