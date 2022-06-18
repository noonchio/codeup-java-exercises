package study;

import java.util.ArrayList;

public class PetDogTest extends Pet {
    //11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.

    public static void main(String[] args) {



        PetDog rocky = new PetDog("Rocky");

        ArrayList<PetDog> dog = new ArrayList<>();
        dog.add(new PetDog("Rocky"));
        dog.add(new PetDog("Ninja"));
        dog.add(new PetDog("Bubasauorprime"));

        for(PetDog name:dog) {
            System.out.println(name.getName());

        }
        System.out.println(rocky.snuggle());


        allSnuggle(dog);




    }



//    Create an ArrayList with at least three PetDog instances in the PetDogTest class
}
