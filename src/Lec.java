import java.util.Arrays;

public class Lec {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];

//        numbers[0] =  78;
//        numbers[1] = 67;
//        numbers[2] = 42;
//        numbers[3] = -5;
//        numbers[4] = 12;

        System.out.println(numbers[1]);

        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);


        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny"};
        // Enhanced for loop
        for (String synonym: synonymsOfWeird){
            System.out.println(synonym);
        }

        // for loop

        for (int i = 0; i < synonymsOfWeird.length; i++){
            System.out.println("The word at index" + i + "is" + synonymsOfWeird[i]);
        }

    // Arrays of Objects


    }

}
