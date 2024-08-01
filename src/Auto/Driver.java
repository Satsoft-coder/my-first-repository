package Auto;

import java.util.Arrays;

public class Driver {
private License[] licenses;
int driverKey[];
    int drivingExperience;

//    public Driver(DriverLicense[] driverLicense, DriverKey[] driverKeys, int drivingExperience) {
//        this.licenses = driverLicense;
//        this.keys = driverKeys;
//        this.drivingExperience = drivingExperience;
//    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public License[] getLicenses() {
        return licenses;
    }

    public void setLicenses(License[] licenses) {
    License licenses1 []=new License[licenses.length];
        for (int i = 0; i < licenses.length; i++) {
            licenses1[i] = licenses[i];
        }
    this.licenses=licenses1;
    }

    public void setKeys(int keys[]) {
        this.driverKey =keys;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public int[] getDriverKey() {
        return driverKey;
    }

    @Override
    public String toString() {
        return " с " + drivingExperience +"-им стажем, с правами "+
                Arrays.toString(licenses);
    }
}
