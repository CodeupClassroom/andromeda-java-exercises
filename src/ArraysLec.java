import java.util.Arrays;

public class ArraysLec {
    // Today, we'll be talking about arrays in Java and how they work a
    // bit different from arrays in JavaScript.

    // First, it's important to know how to instantiate an array.
    public static String[] makeArrayBigger(String[] array, int newLength) {
        String [] newArray = new String[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
        // or just...
//        return Arrays.copyOf(array, newLength);
    }
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Sophie";
        names[1] = "Fernando";
        names[2] = "Justin";
        names[3] = "Ryan";
//        names[4] = "David";








        // if I want to make an array bigger, I have to make a new one.

        names = makeArrayBigger(names, 5);
//        System.out.println(names[0]);









//        names[0] = "Sophie";
//        names[1] = "Fernando";
//        names[2] = "Justin";
//        names[3] = "Ryan";
//        names[4] = "David";
//        System.out.println(names[3]);

        // We can also set the length of an array with a variable.

        final int btsMembers = 7;

        String[] bts = new String[btsMembers];
        bts[0] = "RM";
        bts[1] = "Jin";
        bts[6] = "J-Hope";
        bts[3] = "Jimin";
        bts[2] = "Suga";
        bts[4] = "V";
        bts[5] = "Jungkook";

//        System.out.println(bts.length);

        // We can also create an array with the elements already filled
        // in.

        int[] favoriteNums = {17,42,34,22};







        // Note what is printed to the console:
//        System.out.println(favoriteNums);







        // To read the array, we'll need to iterate through it.

//        for (int i = 0; i < favoriteNums.length; i++) {
//            System.out.println(favoriteNums[i]);
//        }








        // We also have access to an enhanced for loop.
//        for (int num : favoriteNums) {
//            System.out.println(num);
//        }










        // We also have an Arrays class with methods we can use:

        int[] oneTwelveTimes = new int[12];
        Arrays.fill(oneTwelveTimes, 1);

//        for (int one : oneTwelveTimes) {
//            System.out.println(one);
//        }

//        System.out.println(Arrays.equals(favoriteNums, oneTwelveTimes));

        int[] moreFavoriteNums = Arrays.copyOf(favoriteNums, 4);
//        System.out.println(favoriteNums);
//        System.out.println(Arrays.equals(favoriteNums, moreFavoriteNums));
        moreFavoriteNums = Arrays.copyOf(favoriteNums, 5);
//                System.out.println(Arrays.equals(favoriteNums, moreFavoriteNums));
        favoriteNums = moreFavoriteNums;
        favoriteNums[4] = 101;
        Arrays.sort(favoriteNums);
//        System.out.println(Arrays.toString(favoriteNums));

        // We can also make an array of arrays, making a two dimensional array.

        char[][] matrix = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

//        for (char[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (char n : row) {
//                System.out.print(n + " | ");
//            }
//
//            System.out.println();
//        }

        System.out.println("+---+---+---+");

    }
}
