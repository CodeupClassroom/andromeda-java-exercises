package studyhall;

public abstract class Vehicle implements Securable {

    private int numberOfOccupants;

    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void turnOn() {
        System.out.println("Starting...");
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

}
