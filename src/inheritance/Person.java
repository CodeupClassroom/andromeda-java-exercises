package inheritance;

public class Person {
    private String name;
    private boolean insured;
    protected String dob;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.name + "!");
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public String getName() {
        return this.name;
    }
}
