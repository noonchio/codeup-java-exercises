package study;

import java.util.ArrayList;

public class Pet  {
    //            4. Create a class called Pet with two String instance variables, name and type.

    //            5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.

    //6. Create a PetDog class that inherits from Pet.



    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Pet(){}

    Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    //            12b. In your Pet class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.

    public static void allSnuggle(ArrayList<PetDog>arr){

        for(PetDog name:arr) {
            System.out.println(name.snuggle());

        }





    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }






}
