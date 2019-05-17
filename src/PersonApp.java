public class PersonApp {

    public static void main(String[] args) {
        Person fer = new Person("Fernando", "Mendoza");
        System.out.println("fer.sayHello() = " + fer.sayHello());

        Person ana = new Person(null, null);
//        ana.lastName = "Mendez";
//        ana.firstName = "Ana";
        System.out.println("ana.sayHello() = " + ana.sayHello());


//        pipe no cohort yet
        Student jack = new Student("Jack M.");
        Student ali = new Student("Ali B.", "Andromeda");
        jack.code();
        ali.code();


    }

}
