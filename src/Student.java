public class Student {

    public String name;
    public String cohort;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }

    public void code(){
        System.out.println("coding... <>{}");
    }

}
