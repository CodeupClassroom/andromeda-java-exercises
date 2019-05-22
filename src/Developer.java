
class Developer extends Employee implements Programmer, Printable {
    public String work() {
        return "writing code";
    }

    @Override
    public void print() {
        System.out.println( "Name: "+this.name + "\nLanguage:"+this.mainLanguage);
    }

    private String mainLanguage;

    public String code() {
        return "Hello World";
    }

    public Developer(String name, String department, String mainLanguage) {
        super(name, department);
        this.mainLanguage = mainLanguage;
    }
}