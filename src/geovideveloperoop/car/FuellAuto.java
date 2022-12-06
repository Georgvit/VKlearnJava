package geovideveloperoop.car;

public class FuellAuto extends Auto {
    private int availablePetrol;
    private int tankValue;

    public FuellAuto(String producer, String model, EngineType engineType, int availablePetrol, int tankValue) {
        super(producer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankValue = tankValue;
    }

    public void fuelUp(int petrolVolume){
        availablePetrol += petrolVolume;
        System.out.println("Заправка топливом");
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankValue() {
        return tankValue;
    }

    public void setTankValue(int tankValue) {
        this.tankValue = tankValue;
    }
}
