import java.util.Scanner;

public class ControlLecture {
    public static void main(String[] args) {
        // When we talk about control statements and loops, the syntax is going to
        // be very similar to JavaScript.

        // In JavaScript, we covered the concept of boolean expression. Java also
        // uses this structure, but a little differently...

        // == : Equality
        int number1 = 17;
        int number2 = 17;
//        System.out.println(number1 == number2);

        short number3 = 17;
//        System.out.println(number1 == number3);

        String singleLetter = "B";
        char singleCharacter = 'B';

//        System.out.println(singleLetter == singleCharacter);

        // != : Inequality

//        System.out.println(number1 != number3);
//        System.out.println(singleLetter != singleCharacter);

        // > : Greater Than
        // < : Less Than

//        System.out.println(number1 > 9);
//        System.out.println(number3 < 99);

        // >= : Greater Than or Equal To
        // <= : Less Than or Equal To

//        System.out.println(number1 >= number2);
//        System.out.println(++number2 <= number3);

        // Logical operators

        // && : And (Only evaluates the right side if necessary)
        number2 = 17;
        int number4 = 44;
//        System.out.println(number4 < number1 && (number2+=7) == 24);
//        System.out.println(number2);

        // & : And (Both sides evaluated)
//        System.out.println(number4 < number1 & (number2+=7) == 24);
//        System.out.println(number2);

        // || : Or (Only evaluates the right side if necessary)
        number2 = 17;
//        System.out.println(number4 > number1 || (number2+=7) == 24);
//        System.out.println(number2);

        // | : Or (Both sides evaluated)
//        System.out.println(number4 > number1 | (number2+=7) == 0);
//        System.out.println(number2);

        // String comparison: Strings can't be compared like other values, like we
        // were seeing earlier. But why? Remember: Strings are a reference type in
        // Java, meaning?

        // As such, we must use a method in order to compare the values of Strings.

//        System.out.println(singleLetter.equals("B"));

        // Please not that this is NOT true of chars...
        //  This won't work:
//        System.out.println(singleCharacter.equals('B'));

        // But this will!
//        System.out.println(singleCharacter == 'B');

        // Control Structures:
        // Much of this is going to feel like review: In Java we are able to make
        // use of Selection Statements (Conditionals) and Loops.

        // If Statements:
        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your favorite color?");
//        String favoriteColor = sc.nextLine();

//        if (favoriteColor.equalsIgnoreCase("blue")) {
//            System.out.println("I have a blue house with a blue window.\n" +
//                    "Blue is the color of all that I wear.\n" +
//                    "Blue are the streets and all the trees are too.\n" +
//                    "I have a girlfriend and she is so blue.");
//        }

        // Much like before, we can also use else to add other conditions to our
        // code.
//
//        if (favoriteColor.equalsIgnoreCase("blue")) {
//            System.out.println("I have a blue house with a blue window.\n" +
//                    "Blue is the color of all that I wear.\n" +
//                    "Blue are the streets and all the trees are too.\n" +
//                    "I have a girlfriend and she is so blue.");
//        } else if (favoriteColor.equalsIgnoreCase("yellow")) {
//            System.out.println("Look at the stars.\n" +
//                    "Look how they shine for you.\n" +
//                    "And everything you do.\n" +
//                    "Yeah, they were all yellow.");
//        } else if (favoriteColor.equalsIgnoreCase("purple")) {
//            System.out.println("I only wanted to see you\n" +
//                    "Laughing in the purple rain.\n" +
//                    "Purple rain, purple rain.\n" +
//                    "Purple rain, purple rain.");
//        } else {
//            System.out.format("Look, I can only find so many songs about colors... %s wasn't one of them...", favoriteColor);
//        }

        // We also have access to switch statements.

//        switch (favoriteColor.toLowerCase()){
//            case ("blue"):
//                System.out.println("I have a blue house with a blue window.\n" +
//                        "Blue is the color of all that I wear.\n" +
//                        "Blue are the streets and all the trees are too.\n" +
//                        "I have a girlfriend and she is so blue.");
//                break;
//            case ("yellow"):
//                System.out.println("Look at the stars.\n" +
//                        "Look how they shine for you.\n" +
//                        "And everything you do.\n" +
//                        "Yeah, they were all yellow.");
//                break;
//            case ("purple"):
//                System.out.println("I only wanted to see you\n" +
//                        "Laughing in the purple rain.\n" +
//                        "Purple rain, purple rain.\n" +
//                        "Purple rain, purple rain.");
//                break;
//            default:
//                System.out.format("Look, I can only find so many songs about colors... %s wasn't one of them...", favoriteColor);
//                break;
//        }

        // While loops

//        System.out.println("This is the song that never ends\n" +
//                "It just goes on and on my friends\n" +
//                "some people started singing it not knowing what it was\n" +
//                "and we continue singing it forever just because");
//        String response = sc.nextLine();
//        while (response.equalsIgnoreCase("This is the song that never ends")) {
//            System.out.println("It just goes on and on my friends\n" +
//                    "some people started singing it not knowing what it was\n" +
//                    "and we continue singing it forever just because");
//            response = sc.nextLine();
//
//        }

        // Do - While Loops
//        String response;
//        do {
//            System.out.println("This is the song that never ends\n" +
//                    "It just goes on and on my friends\n" +
//                    "some people started singing it not knowing what it was\n" +
//                    "and we continue singing it forever just because");
//            response = sc.nextLine();
//        } while (!response.equalsIgnoreCase("stop"));


        // For Loops
//        for (int i = 99; i >= 0; i--) {
////            if (i == 88) {
////                System.out.println("Alright kids, let's play the quiet game. Mom's got a headache.");
////                break;
////            }
////            if (i % 7 == 0) {
////                System.out.println("Slug bug!");
////                continue;
////            }
//            if (i == 1) {
//                System.out.format("%d bottle of juice on the wall, " +
//                        "%d bottle of juice! " +
//                        "You take it down, pass it around: " +
//                        "%d bottles of juice on the wall!%n", i, i, i - 1);
//            } else if (i == 0) {
//                System.out.format("%d bottles of juice on the wall, " +
//                        "%d bottles of juice! " +
//                        "You fall down, we'll pass you around: " +
//                        "%d bottles of juice on the wall!%n ", i, i, i);
//            } else {
//                System.out.format("%d bottles of juice on the wall, " +
//                        "%d bottles of juice! " +
//                        "You take one down, pass it around: " +
//                        "%d bottles of juice on the wall!%n", i, i, i - 1);
//            }
//        }

    }
}
