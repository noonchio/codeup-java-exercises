package study;

public class Assessment {
    //        1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
    public static void main(String[] args) {
        System.out.println(half(10));
        System.out.println(shout("Boso"));
    }


    public static int half(int num){
        return num / 2;
    }

    //1. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.

    public static String shout(String word){
        return word.toUpperCase() + "!!!";
    }

//            1. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.



}
