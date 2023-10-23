package AdapterPattern;

public class SmartphoneCharger {

    private boolean charging = false;

    public void plugIn() {
        System.out.println("Smartphone Charger is plugged in.");
        charging = true;
    }

    public boolean isCharging() {
        return charging;
    }

    public void chargePhone() {
        if (isCharging()) {
            System.out.println("Smartphone is already charging.");
            System.out.println();
        } else {
            plugIn();
            System.out.println("Smartphone is now charging!");
            System.out.println();
        }
    }
}
