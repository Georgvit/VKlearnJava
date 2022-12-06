package geovideveloperoop.car;

public class InhneritanceMain {
    public static void main(String[] args) {
        Truck truck = new Truck("Камаз", "36-2589", EngineType.DISEEL, 300,500, 10000 );
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("\n");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100500);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println("\n");
        Bus bus = new Bus("ЛИАЗ", "36-558", EngineType.DISEEL, 30, 100, 25);
        bus.start();
        bus.accelerate(10);
        bus.fuelUp();
        bus.pickUpPassengers(5);
        bus.stop();
        bus.releasePassengers(10);
    }


}
