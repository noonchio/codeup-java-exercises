package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Eneter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Yes or No");
        String userInput = scanner.nextLine();
//        System.out.println(userInput);
        return userInput.equalsIgnoreCase("Y") ||
                userInput.equalsIgnoreCase("Yes");

    }

    public int getInt(int min, int max) {

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int num = Integer.parseInt(scanner.next());
        if (num > min && num < max) {
            return num;
        }
        System.out.println("Input out of range");
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Enter a number");
        int userInput = Integer.parseInt(scanner.next());
        return userInput;
    }

/*
    public boolean yN(String input){
        System.out.println("y/n");
        String inputUser = scanner.next();
        return input.equalsIgnoreCase("Y");

    }
*/

    public double getDouble() {
        System.out.println("Enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(double min, double max) {
        String prompt = "Enter an integer between"
                + min + "and" + max;
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }




}
