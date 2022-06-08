import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
/*
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        long j = 2;
        do {
            System.out.println(j);
            j = j * j;
        } while  (j <= 1000000);
*/

        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        for (long j = 2; j <= 1000000; j *= j) {
            System.out.println(j);
        }
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

//        Write a program that prints the numbers from 1 to 100.

//        for (int a = 1; a <= 100; a++) {
//            System.out.println(a);
//        }
//        For multiples of three: print “Fizz” instead of the number.

        for (int a = 1; a <= 100; a++) {
            if (((a % 5) == 0) && ((a % 3) == 0)) {
                System.out.println("Fizz Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }

        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Display a table of powers.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = Integer.parseInt(scanner.next());
//        scanner.nextLine();

        System.out.println("Would you like to continue:  (Yes/No)");
        String ans = scanner.next();

        if (ans.equals("Yes")) {
            System.out.println("Here is your table: ");
            for (int x = 1; x <= userInput; x++) {
                System.out.println(x + "|" + x * x + "|" + x * x * x);
            }

        }


//        Convert given number grades into letter grades.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a numerical grade from 0 to 100.");
        int userGrade = Integer.parseInt(scanner1.next());

        System.out.println("Would you like to continue:  (Yes/No)");
        String ans1 = scanner.next();

        if (ans1.equals("Yes")) {
            System.out.println("Here is your grade:");
            if (userGrade < 101 && userGrade > 87 ) {
                System.out.println("A");
            } else if (userGrade <= 87 && userGrade > 79) {
                System.out.println("B");
            } else if (userGrade <= 79 && userGrade > 66) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
        }
















    }
}

//    Refactor the previous two exercises to use a for loop instead.





