import java.util.Scanner;

public class ExceptionsLecture {

    /*
        Throwing and Catching Exceptions
        Types of Exceptions
        Custom Exceptions
     */

    public static void main(String[] args) {

        // code that breaks because the programmer messed up (Runtime or "Unchecked" Exceptions)

//            String[] strings = new String[3];
//            System.out.println(strings[9]);

//            String[] strings = new String[-1];

//            Object x = new Integer(0);
//            System.out.println((String)x);

        // LOTS of these...
        // https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html


        // we can also throw different kinds of exceptions directly

//            throw new RuntimeException("AAAAAHHHHHH");
//            throw new ArrayIndexOutOfBoundsException("Oh NOOOO");

        // we can catch exceptions if they are thrown


//            try {
//                throw new ArrayIndexOutOfBoundsException();
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.err.println(e);
//            }
//
//            try {
//                throw new ArrayIndexOutOfBoundsException();
//            } catch(RuntimeException e) {
//                System.err.println(e);
//            }

//            try {
//                if (Math.random() < .5) {
//                    throw new ArrayIndexOutOfBoundsException("Whoops!");
//                } else {
//                    throw new RuntimeException("OH NO!!!");
//                }
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            } catch(RuntimeException e) {
//                System.err.println(e);
//            }


//            Scanner sc = new Scanner(System.in);
//            System.out.println("Choose an array size...");
//            int size = sc.nextInt();
//
//            String[] strings;
//            try {
//                strings = new String[size];
//            } catch(NegativeArraySizeException e) {
//                System.err.println(e);
//                System.out.println("Setting array to a size of 3...");
//                strings = new String[3];
//            }
//
//            System.out.println(strings);



    }

}
