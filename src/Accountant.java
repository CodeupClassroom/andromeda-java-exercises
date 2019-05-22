class Accountant extends Employee {
    public String work() {
        return "crunching numbers";
    }

    public Accountant(String name, String department) {
        super(name, department);
    }
}
