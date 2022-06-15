import java.util.Scanner;
import javax.swing.JOptionPane;

public class Code {
    public static void main(String[] args) {
/*
 Swap two variables
      String x = "water";
      String y = "Kool-Aid";
      String temp;

      temp= x;
      x=y;
      y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
*/

/*
  User Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like " + food);
*/
        /*
         expression = operands & operators
         operands = values, variables, numbers, quantity
         operators = + - * / %
                int friends = 10;

                friends--;

                System.out.println(friends);
        */
/*
 Graphical User Interface
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
*/

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Bob", highScorePosition);




    }
    public static void displayHighScorePosition(String playerName, int highScorePosition ){
        System.out.println(playerName + "managed to get into position " + highScorePosition + "on the highscore table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) {
            return 1;
        } else if(playerScore > 500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 200;
            return finalScore;
        }
        return -1;
    }
}
