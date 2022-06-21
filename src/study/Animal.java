package study;

public class Animal {
//    1. Create an `Animal` class. It should have private instance properties for strings `name` and `species`, and public getters and setters for both.

    private String name;

    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

//    Animal(){}

    Animal(String name, String species){
        this.name = name;
        this.species = species;
    }


    //1. Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.

    public String roar(){
        return "I am " + name + " here me roar!";
    }


}
