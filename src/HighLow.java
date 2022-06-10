public class HighLow {

    public static void init() {
        System.out.println("Welcome to the High / Low Game!");
        int randomNum = MethodsExercises.getRandomInt(1, 100);

        System.out.println("Guess a number between 1 and 100");
        int guess = MethodsExercises.getInteger(1, 100);
        if (guess == randomNum) {
            System.out.println("GOOD GUESS!");
        } else if (guess < randomNum) {
            System.out.println("HIGHER");
        }else {
            System.out.println("LOWER");
        }
        System.out.println(randomNum);
        }



    public static void main(String[] args) {
       init();
    }

}
