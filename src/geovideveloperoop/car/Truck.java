package geovideveloperoop.car;

public class Truck extends FuellAuto{
    private int cargoWoight;

    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankValue, int cargoWoight) {
        super(producer, model, engineType, availablePetrol, tankValue);
        this.cargoWoight = cargoWoight;
        System.out.println("Конструктор грузовика");
    }

    public int getCargoWoight() {
        return cargoWoight;
    }

    public void setCargoWoight(int cargoWoight) {
        this.cargoWoight = cargoWoight;
    }

    public void load(){
        System.out.println("Грузовик загружается");
    }
    public void unload(){
        System.out.println("Грузовик разгружается");
    }
}
