package vic;

public class VehicleTest {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setName("El Camino");
        System.out.print(truck.getName() + " goes ");
        truck.makeNoise();

        Moped moped = new Moped();
        moped.setName("yo");
        moped.breakingDownNoise();
    }
}
