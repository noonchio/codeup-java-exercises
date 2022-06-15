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

    public void retrieveVehicles() {
        for(int i = 0; i < this.getVehicles().length; i++){
            vehicles[i].makeNoise();
        }
    }




}
