package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
        System.out.println(getString());
//        System.out.println(yesNo());
//        System.out.println(getInt());

    }


    public String getString(){
        System.out.println("Eneter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

//    public boolean yesNo(){
//        System.out.println("Yes or No");
//        boolean userInput = Boolean.parseBoolean(scanner.nextLine());
//        return userInput;
//
//    }

//    public int getInt(){
//        System.out.println("Enter a minimum number: ");
////        System.out.println("Enter a maximum number: ");
//        int userInput = Integer.parseInt(scanner.nextLine());
////        int userInput2 = Integer.parseInt(scanner.nextLine());
//        return 0;
//
//    }





}
