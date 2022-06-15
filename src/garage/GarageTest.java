package garage;

import vic.BeemerM3;
import vic.Moped;
import vic.Truck;
import vic.Vehicle;

public class GarageTest {


    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Truck();
        vehicles[0].setName("Tacoma");
        vehicles[1] = new Moped();
        vehicles[1].setName("Rocky");
        vehicles[2] = new BeemerM3();
        vehicles[2].setName("BMW");

        Garage myGarage = new Garage();
        myGarage.setVehicles(vehicles);
        Vehicle vehicle1 = myGarage.findVehicle("Rocky", myGarage.getVehicles());
        myGarage.retrieveVehicles();



    }
}
