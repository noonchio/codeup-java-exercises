import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int userInput = Integer.parseInt(scanner.next());

        System.out.println("You entered: " + userInput);

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter 3 words: ");






    }
}
