package garage;

import vic.Vehicle;

public class Garage {


    private Vehicle[] vehicles;


    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Garage(){}

//    public Garage(String name){
//        this.name = name;
//    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles){
            if (vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        return new Vehicle();
    }

    public void retrieveVehicles() {
        for(int i = 0; i < this.getVehicles().length; i++){
            vehicles[i].makeNoise();
        }
    }




}
