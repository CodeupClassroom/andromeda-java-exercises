import java.util.List;

public class Person {

//     Create a property that belong to everybody
    public static String species = "HUMAN";

    private String firstName;
    private String lastName;

    public Person(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public String sayHello() {
        return String.format("Hello I'm a " +species+" and my name is %s %s!", this.firstName, this.lastName);
    }
}