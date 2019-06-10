package studyhall;

import java.util.Arrays;
import java.util.List;

public class StudyHall {

    public static void main(String[] args) {

        // method overloading is an example of static (compile-time) polymorphism

//            Bus b = new Bus(55);
//            b.honkHorn();
//            b.honkHorn(3);

        // method overriding is an example of dynamic (runtime) polymorphism

//            Vehicle v = new Bus(55);
//            v.turnOn();
//            v = new Yacht(23);
//            v.turnOn();


        // can use parent types in other methods...

            Vehicle v1 = makeVehicle("bus", 90);
            Vehicle v2 = makeVehicle("jet", 690);
            Vehicle v3 = makeVehicle("yacht", 35);
//
//            addOccupant(v1);
//
//            numOfOccupantsMessage(v1);



        // ...and also interface types in other methods


//            List<Securable> vehicles = Arrays.asList(v1, v2, v3);
//
//            secureVehicles(vehicles);



        // methods specific to an instance and not parent are not accessible without casting

            Vehicle bus = new Bus(55);
//            bus.honkHorn();
//            ((Bus) bus).honkHorn();



    }

    // method that returns any of the Vehicle subclass objects or the Vehicle class object
    public static Vehicle makeVehicle(String type, int maxSpeed) {
        Vehicle obj = null;
        switch (type) {
            case "jet":
                obj = new Jet(maxSpeed);
                break;
            case "yacht":
                obj = new Yacht(maxSpeed);
                break;
            case "bus":
                obj = new Bus(maxSpeed);
                break;
        }
        return obj;
    }

    public static void secureVehicles(List<Securable> vehicleList) {
        for (Securable v : vehicleList) {
            v.secure();
        }
    }

    // methods which take in any of the vehicle subclasses
    public static void numOfOccupantsMessage(Vehicle obj) {
        System.out.println("This vehicle is holding " + obj.getNumberOfOccupants() + " occupant(s)");
    }

    public static void addOccupant(Vehicle obj) {
        obj.setNumberOfOccupants(obj.getNumberOfOccupants() + 1);
    }

}
