package AdapterPattern;

public class Refrigerator {
    private boolean cooling = false;

    public void plugIn() {
        System.out.println("Refrigerator is plugged in.");
        cooling = true;
    }

    public boolean isCooling() {
        return cooling;
    }

    public void startCooling() {
        if (isCooling()) {
            System.out.println("Refrigerator is already cooling.");
            System.out.println();
        } else {
            plugIn();
            System.out.println("Refrigerator is now starting to cool!");
            System.out.println();
        }
    }
}
