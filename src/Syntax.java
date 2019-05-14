public class Syntax {
    public static void main(String[] args) {
        // This code will print "Bill" to the console.
        {
            System.out.println("Bill");
        }
        /*
        ToDo: Explain how to write Java.
         */

        int practiceInt = 128000;
        long practiceNumber = practiceInt;
        short practiceShort = (short) practiceInt;
        practiceNumber += 99;
//        System.out.println(practiceNumber);
//        System.out.println(practiceShort);

        float practiceFloat = 3.94F;
//        System.out.println(practiceFloat);
        int floatCast = (int) practiceFloat;
//        System.out.println(floatCast);
        float intCast = floatCast;
//        System.out.println(intCast);

        final int playableInt;
        playableInt = 7;

        char favoriteLetter = 'Z';
//        favoriteLetter++;
//        System.out.println(favoriteLetter);
    }
}
