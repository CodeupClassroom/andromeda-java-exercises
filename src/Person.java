import java.util.List;

public class Person {

//     Create a property that belong to everybody
    public static String species = "HUMAN";

    private String firstName;
    private String lastName;
    private String fullName;

    public Person(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public Person(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fName){
        this.fullName = fName;
    }

    public void sayHello() {
        String out =  String.format("Hello I'm a " +species+" and my name is %s!", this.getFullName());

        System.out.println(out);
    }


    public static void main(String[] args) {
        Person fer = new Person("Fer", "Mendoza");
        fer.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getFullName().equals(person2.getFullName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

        person1.setFullName("Jane");
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

    }
}