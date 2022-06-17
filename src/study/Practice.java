package study;

public class Practice {
    public static void main(String[] args) {
//        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
        System.out.println(subtractTen(20));
        System.out.println(average(numbers));

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




}
