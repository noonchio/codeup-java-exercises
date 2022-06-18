package study;

public class PetDog extends Pet implements Companion{
    //            7. In PetDog, create a boolean instance variable, trained.

    public boolean trained;

    //8. Write a constructor for PetDog that sets its name,

    PetDog(String name){
        this.setName(name);
    }

    //9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.

    public boolean isTrained(){
        return trained;
    }


    @Override
    public String snuggle() {

        return getName() + " wants to snuggle";
    }
}
