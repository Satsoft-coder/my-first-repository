package Auto;

public class Driver {
License licenses;
int keys;
    int drivingExperience;

//    public Driver(DriverLicense[] driverLicense, DriverKey[] driverKeys, int drivingExperience) {
//        this.licenses = driverLicense;
//        this.keys = driverKeys;
//        this.drivingExperience = drivingExperience;
//    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public License getLicenses() {
        return licenses;
    }

    public void setLicenses(License licenses) {
        this.licenses = licenses;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
