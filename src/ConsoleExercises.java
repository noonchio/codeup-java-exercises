import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n", pi);

//        Prompt a user to enter an integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int userInput = Integer.parseInt(scanner.next());

        System.out.println("You entered: " + userInput);

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter 3 words: ");
        String word1 = scanner1.next();
        String word2 = scanner1.next();
        String word3 = scanner1.next();

        System.out.println("You entered: " + word1 + " " + word2 + " " + word3);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String sentence = scanner2.nextLine();

        System.out.println("Your input: " + sentence);

//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter the length  of your room. ");

        int length = Integer.parseInt(scanner3.next());

        System.out.print("Enter the width of your room");

        int width = Integer.parseInt((scanner3.next()));

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.println("The area of your room is: "+ area);
        System.out.println("The perimeter of your room is: "+ perimeter);

//        Bonuses: In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.






    }
}
