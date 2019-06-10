package studyhall;

public class Yacht extends Vehicle {

     public boolean isDocked;

     // creating a new constructor
     public Yacht(int maxSpeed) {
         super(maxSpeed); // using old constructor
         this.isDocked = true;
     }

     // overriding from parent
    @Override
     public void turnOn() {
         System.out.println("...engaging propeller");
     }

    @Override
    public void secure() {
        System.out.println("Tying to dock...");
    }
}
