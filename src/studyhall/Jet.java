package studyhall;

public class Jet extends Vehicle {

    public int altitude;

    // creating a new constructor
    public Jet(int maxSpeed) {
        super(maxSpeed); // using old constructor
        this.altitude = 0;
    }

    // overriding from parent
    @Override
    public void turnOn() {
        System.out.println("...igniting jets");
    }

    @Override
    public void secure() {
        System.out.println("Attaching hanger deck chains and sealing cockpit...");
    }
}
