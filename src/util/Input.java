package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    // Catch cases when we run getString without params
    public String getString(){
        return getString("Write something: ");
    }

    public boolean yesNo(){
        return getString("Type yes/no: ").equals("yes");
    }

    public int getInt(int max, int min){
        int num = getInt();

        if(num < min || num > max){
            return getInt();
        }

        return num;
    }

    public int getInt(){
        return Integer.parseInt(getString("Give me a number: "));
    }

}
