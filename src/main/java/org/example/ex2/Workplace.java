package org.example.ex2;

public class Workplace extends Room{
    int totalPowerOfOfficeEquipment;
    boolean officeEquipmentOn;

    public Workplace(int numberOfLamps, int powerLamp,int totalPowerOfOfficeEquipment) {
        super(numberOfLamps, powerLamp);
        this.totalPowerOfOfficeEquipment=totalPowerOfOfficeEquipment;
    }

    @Override
    public String toString() {
        return "Workplace{" +
                "totalPowerOfOfficeEquipment=" + totalPowerOfOfficeEquipment +
                ", numberOfLamps=" + numberOfLamps +
                ", powerLamp=" + powerLamp +
                ", lampOn=" + lampOn +
                '}';
    }

    @Override
    public void startLamp(int energy) throws NotEnoughAllEnergy {
       // super.startLamp(energy);
        if (energy>powerLamp*numberOfLamps+totalPowerOfOfficeEquipment){
            lampOn=true;
            officeEquipmentOn=true;
        }else {
            throw new NotEnoughAllEnergy ("Мощности в "+energy+"Вт не хватает для включения ламп и офисного оборудования");
        }
    }
}
