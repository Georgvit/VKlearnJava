package geovideveloperoop.car;

public class Bus extends FuellAuto {
    private int passengersNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankValue, int passengersNumber) {
        super(producer, model, engineType, availablePetrol, tankValue);
        this.passengersNumber = passengersNumber;
        System.out.println("Клас Автобус был иницилизирован");
    }

    public void fuelUp() {
        int volume = getTankValue() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if(volume > getTankValue()){
            setAvailablePetrol(getTankValue());
        }
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void pickUpPassengers(int passengersNumber) {
        this.passengersNumber += passengersNumber;
        System.out.println("Пассажиров в автобусе " + passengersNumber);
    }

    public void releasePassengers(int passengersNumber) {
        if (isRunning) {
            stop();
        }
        passengersNumber = 0;
        System.out.println("Пассажиров в автобусе " + passengersNumber);
    }
}
