package inheritance;

public class Employee extends Person {

    private double salary;

    public Employee(String name) {
        super(name);
        super.setInsured(true);
    }

    public void doWork(){
        System.out.println("Working...");
    }

    public double getSalary() {
        char x = '2';
        int y = 2;
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
