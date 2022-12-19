package geovideveloperoop.car;

public class InhneritanceMain {
    public static void main(String[] args) {
//        Engine truckEngine = new Engine(6.0, EngineType.DISEEL, 900);
//        Truck truck = new Truck("Камаз", "36-2589", truckEngine, 300,500, 10000 );
//        truck.start();
//        truck.accelerate(40);
//        truck.stop();
//        truck.fuelUp(50);
//        truck.load();
//        truck.unload();
//
//        System.out.println("\n");
//        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100500);
//        electricCar.start();
//        electricCar.stop();
//        electricCar.charge();
//
//        System.out.println("\n");
//
//        Engine busEngine = new Engine(4.0, EngineType.DISEEL, 350);
//        Bus bus = new Bus("ЛИАЗ", "36-558", busEngine, 30, 100, 25);
//        bus.start();
//        bus.accelerate(10);
//        bus.fuelUp();
//        bus.pickUpPassengers(5);
//        bus.stop();
//        bus.releasePassengers(10);
//
//        Engine engine = bus.getEngine();
//        System.out.println(engine.getEngineType());
//        List<Piston> pistons = engine.getPistons();
//        System.out.println(pistons);
        Engine truckEngine = new Engine(6.0, EngineType.DISEEL, 900);
        Engine busEngine = new Engine(4.0, EngineType.DISEEL, 350);
        Auto bus = new Bus("ЛИАЗ", "36-558", busEngine, 30, 100, 25);
        Auto truck = new Truck("Камаз", "36-2589", truckEngine, 300, 500, 10000);
        Auto car = new ElectricCar("Tesla", "Model S", 4, 100500);

        runCar(bus);
        runCar(truck);
        runCar(car);

    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }


}
