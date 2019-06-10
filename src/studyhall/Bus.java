package studyhall;

public class Bus extends Vehicle {

    public boolean headlightOn;

    // creating a new constructor
    public Bus(int maxSpeed) {
        super(maxSpeed); // using old constructor
        this.headlightOn = false;
    }

    public void honkHorn() {
        System.out.println("Honk HONK!!");
    }


    public void honkHorn(int num) {
        for (int i = num; i > 0; i--) {
            System.out.print("Honk! ");

        }
    }

    // overriding from parent
    @Override
    public void turnOn() {
        System.out.println("...cranking engine");
    }

    @Override
    public void secure() {
        System.out.println("Locking doors...");
    }
}
