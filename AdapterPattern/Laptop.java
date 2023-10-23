package AdapterPattern;

public class Laptop {

    private boolean charging = false;

    public void plugIn() {
        System.out.println("Laptop is plugged in.");
        charging = true;
    }

    public boolean isCharging() {
        return charging;
    }

    public void charge() {
        if (isCharging()) {
            System.out.println("Laptop is already charging.");
            System.out.println();
        } else {
            plugIn();
            System.out.println("Laptop is now charging!");
            System.out.println();
        }
    }
}
