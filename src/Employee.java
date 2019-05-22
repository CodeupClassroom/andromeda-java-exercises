abstract class Employee {
    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public abstract String work();

    public static void main(String[] args) {
        Employee employee1 = new Accountant("Bob", "Accounting");
        Developer employee2 = new Developer("Susan", "IT", "Java");
        Employee employee3 = new Manager("Lafonda", "IT");

        Employee[] workers = {employee1, employee2, employee3};
        for (Employee emp : workers) {
            System.out.println(emp.work());
        }

        Printable[] printables = {employee2};
        for (Printable thing : printables)
            thing.print();
    }
}