package inheritance;

public class LectureTest {

    public static void main(String[] args) {

        Person ana = new Person("Ana");
        Employee fer = new Employee("Fer");
        Instructor david = new Instructor("David");

        ana.sayHello();
        david.sayHello();
        fer.sayHello();

        fer.doWork();
        david.doWork();

        fer.setSalary(5000000.34);

        System.out.println("$ "+fer.getSalary());

        fer.setSalary(5000000.35);
        System.out.println("$ "+fer.getSalary());


        System.out.println("fer.isInsured() = " + fer.isInsured());
        System.out.println("david.isInsured() = " + david.isInsured());



    }
}
