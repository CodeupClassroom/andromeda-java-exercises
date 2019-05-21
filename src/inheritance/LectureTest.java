package inheritance;

import java.util.ArrayList;
import java.util.List;

public class LectureTest {

    public static void main(String[] args) {


        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName());
        System.out.println(theManOfSteel.getSecretIdentity());

        Person ana = new Person("Ana");
        Employee fer = new Employee("Fer");
        Instructor david = new Instructor("David");
        Employee sophie = new Instructor("Sophie");

        ana.sayHello();
        david.sayHello();
        fer.sayHello();

        fer.doWork();
        david.doWork();
        sophie.doWork();

        System.out.println("sophie.getClass() = " + sophie.getClass());

        fer.setSalary(5000000.34);

        System.out.println("$ "+fer.getSalary());

        fer.setSalary(5000000.35);
        System.out.println("$ "+fer.getSalary());


        System.out.println("fer.isInsured() = " + fer.isInsured());
        System.out.println("david.isInsured() = " + david.isInsured());



    }
}
