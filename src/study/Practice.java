package study;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
//        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
        System.out.println(subtractTen(20));
        System.out.println(average(numbers));
        System.out.println(multiplyAll(7, new ArrayList<>(List.of(2, 4, 6, 8))));

    }
    public static int subtractTen(int num){
        return num - 10;

    }

//     3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.

    static int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        public static double average(int[] arr){
            int sum = 0;
            for(int i = 0; i < arr.length; i++)
                sum = sum + arr[i];

            double average = sum / arr.length;
            return  average;
        }

//            12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument. (I need help in 12)

//    public static ArrayList<Integer> multiplyAll(int numbers, ArrayList<Integer>integers){
//            ArrayList<Integer> multipliedNumbers = new ArrayList<>();
//           for (){
//                multipliedNumbers.add(num * numbers);
//            }
//
//        return multipliedNumbers;
//    }



    public static ArrayList<Integer> multiplyAll(int number, ArrayList<Integer> numbers){
        ArrayList<Integer> multipliedNumbers = new ArrayList<>();
        for(int num : numbers){
            multipliedNumbers.add(num * number);
        }
        return multipliedNumbers;
    }





}
