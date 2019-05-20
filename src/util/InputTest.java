package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.err.println(input.getString("What's name"));


        System.err.println(input.getInt(1, 10));

        System.err.println(input.getDouble(1, 10));

        System.err.println(input.yesNo());
    }
}
