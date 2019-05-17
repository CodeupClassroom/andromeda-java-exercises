import java.util.Scanner;

public class MethodsExercises {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("addition(5,7) = " + addition(5,7));
//        System.out.println("subtraction(5,7) = " + subtraction(5,7));
//        System.out.println("multiplication(5,7) = " + multiplication(5,7));
//        System.out.println("division(5,7) = " + division(5,7));
//        System.out.println("division by 0 = " + division(5,0));
//        System.out.println("modulus(5,7) = " + modulus(5,7));
//
//
//        System.out.println("getInteger(1,10) = " + getInteger(1,10));

//        factorial();

        String answer = "Y";

        while(answer.equals("Y")){
            dice();
            System.out.println("Do you want to continue? Y/N");
            answer = scan.nextLine().toUpperCase();
        }

    }

    public static int addition(int num, int num2){
        return num + num2;
    }

    public static int subtraction(int num, int num2){
        return num - num2;
    }

    public static int multiplication(int num, int num2){
        return num * num2;
    }

    public static double division(double num, double num2){
        return num / num2;
    }
    public static int modulus(int num, int num2){
        return num % num2;
    }

    public static int getInteger(int min, int max){
        System.out.println("Give me a number: ");
        int input = Integer.parseInt(scan.nextLine());

        if(input >= min && input <= max){
            return input;
        } else {
            System.out.println("Number out of range");
            return getInteger(min, max);
        }
    }

    public static void factorial(){
        int number = getInteger(1,10);
        String output = "";
        int total = 1;

        for (int i = 1; i <= number; i++){
            total *= i;
            output += i+"! = ... = "+ (total) +"\n";
        }

        System.out.println(output);

    }

    public static void dice(){
        int sides = getInteger(1, 100);

        int rnd = (int) (Math.random() * sides ) + 1;
        int rnd2 = (int) (Math.random() * sides ) + 1;

        System.out.println("rnd = " + rnd);
        System.out.println("rnd2 = " + rnd2);

    }


}
