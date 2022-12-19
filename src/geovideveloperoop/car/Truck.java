package geovideveloperoop.car;

public class Truck extends FuellAuto{
    private int cargoWoight;

    public Truck(String producer, String model, Engine engine, int availablePetrol, int tankValue, int cargoWoight) {
        super(producer, model, engine, availablePetrol, tankValue);
        this.cargoWoight = cargoWoight;
        System.out.println("Клас Автобус был иницилизирован");
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

    @Override
    public void energize() {
        fuelUp(getTankValue() - getAvailablePetrol());
    }
}
