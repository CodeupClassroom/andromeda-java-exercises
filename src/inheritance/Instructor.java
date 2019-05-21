package inheritance;

public class Instructor extends Employee {
    public Instructor(String name) {
        super(name);
        super.setInsured(false);
    }

    @Override
    public void doWork(){
        System.out.println(super.name+ " is ");
        super.doWork();
        System.out.println(" and Live coding...");
    }

}
