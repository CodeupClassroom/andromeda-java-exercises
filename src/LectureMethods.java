public class LectureMethods {

    public static void sayHello(){
        System.out.println("\"Hello!\" = " + "Hello!");
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Fer", 29);
        sayHello( 29, "fer");

        int x = 10;
        int y = 20;

        prettyPrint(getTotal(x, y), "US");
        prettyPrint(getTotal(2,6), "DE");
        prettyPrint(getTotal(2,5));

        count(5);

    }

    public static void count(int n){
        if(n <= 0) {
            System.out.println("All done");
            return;
        }
        System.out.println(n);
        count(n -1);
    }

    public static double getTotal(int a, int b){
        int total;
        total = a + b;
        return total * 1.08;
    }

    public static void prettyPrint(double total){
        System.out.println("$"+ Math.round(total));
    }

    public static void prettyPrint(double total, String country){
        String coin = (country.equals("US")) ? "$" : "€";
        System.out.println(coin+ Math.round(total));
    }


    public static void sayHello(String name, int age){
        System.out.println("\"sayHello()!\" = " + "Hello, "+name+"!" + " age: " + age);
    }

    public static void sayHello(int age, String name){
        System.out.println("\"sayHello()!\" = " + "Hello, "+name+"!" + " age: " + age);
    }
}
