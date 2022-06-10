import java.util.Scanner;
public class MethodsExercises {

    public static void main(String[] args) {
/*
        System.out.println(sayName("Alfredo"));

        System.out.println(add(2.5, 3.2));
        System.out.println(multiply(2, 2));
        System.out.println(subtraction(20, 4));
        System.out.println(division(10, 2));
        // Any number divided by zero gives the answer “equal to infinity.” Unfortunately, no data structure in the world of programming can store an infinite amount of data

        System.out.println(levelUpMultiply(6, 16));
        System.out.println(getInteger(1, 10));
        System.out.println(factorial(userInt));
        promptUserForFactorials();
*/


/*
        for (int i = 0; i < 10; i += 1) {
            System.out.println(getRandomInt(1, 5));
        }
*/

        diceRoll();

    }

    public static String sayName(String name, String last) {
        return String.format("Hi, %s, %s!", name, last);

    }

    public static String sayName(String name) {
        return String.format("Hi, %s!", name);

    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int subtraction(int g, int h) {
        int ans = g - h;
        return ans;
    }

    public static int division(int u, int w) {
        int result = u / w;
        return result;
    }

    public static int modulo(int q, int p) {
        int result = q % p;
        return result;
    }

    public static int levelUpMultiply(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + m;
        }
        return sum;
    }

    public static double add(double a, double b) {
        return a + b;
    }

//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int num = Integer.parseInt(scanner.next());
        if (num > min && num < max) {
            return num;
        }
        System.out.println("Input out of range");
        return getInteger(min, max);
    }


//    Calculate the factorial of a number.

    public static int factorial(int userInt) {

        Scanner scanner1;


        scanner1 = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 10 ");
        long userInput = Integer.parseInt(scanner1.next());

        int i, fact = 1;

        for (i = 1; i <= userInput; i++) {
            fact = fact * i;
        }
        return fact;


//            System.out.println("Would you like to continue:  (Yes/No)");
//            String ans = scanner1.next();
//            if (Objects.equals(ans, "Yes")){
//                return fact;
//            }
//
//
//        return factorial();
    }

    public static void promptUserForFactorials() {
        Scanner sc = new Scanner(System.in);
        String continueMessage;
        System.out.println("Welcome to the factorial calculator!!!");
        do {
            System.out.println("What number should we calculate?");
            int userInt = getInteger(1, 10);
            System.out.println("The factorial of " + userInt + " is " + factorial(userInt));

            System.out.println("Would you like to enter another number? (yes/no)");
            continueMessage = sc.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));


    }
                // Dice random number
        public static int getRandomInt(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }

        public static void diceRoll() {
            System.out.println("Welcome to Dice Roll!");
            System.out.println("Enter number of sides of the dice. (1-6)");
            int noOfSidesOfDice = getInteger(1, 6);
            System.out.printf("You have rolled %d and a %d",
                    getRandomInt(1, noOfSidesOfDice),
                    getRandomInt(1, noOfSidesOfDice));

        }



    }













