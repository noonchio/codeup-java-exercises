import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons;

        persons = new Person[3];

        persons[0] = new Person("Alfredo");
        persons[1] = new Person("Carlito");
        persons[2] = new Person("Guti");

                for(Person person: persons ) {
                    System.out.println(person.getName());
                }

                Person[] newPersonsArray = ArrayExercises.addPerson(new Person("Gonzalo"), persons );
                for (Person person: newPersonsArray){
                    System.out.println(person.getName());
                }
//                persons = addPerson(persons)
//        System.out.println("New Version: ");
//        for(Person person: persons ) {
//            System.out.println(person.getName());
//        }
    }
//    public static Person[] addPerson(Person[] persons){
//// make a new array with the size I want
//        Person[] addpersons = new Person[persons.length + 1];
//
//        // copy the contents of the old array
//        for (int i = 0; i < persons.length; i++) {
//            addpersons[i] = persons[i];
//        }
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("New Person: ");
//        addpersons[addpersons.length - 1] = in.()
//
//
//        return addpersons;
//    }

    public static Person[] addPerson(Person newPerson, Person[] persons){
        Person[] newPersonArray;
        newPersonArray = new Person[persons.length + 1];

        for (int i = 0; i < persons.length; i++){
            newPersonArray[i] = persons[i];
        }
        newPersonArray[newPersonArray.length -1] = newPerson;
        return newPersonArray;
    }

}
