package geovideveloperoop.car;

public class ElectricCar extends Auto {
    private int battaryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int battaryVolume, int passengersNumber) {
        super(producer, model, new Engine());
        this.battaryVolume = battaryVolume;
        this.passengersNumber = passengersNumber;
        System.out.println("Клас Электрокар был иницилизирован");
    }

    private void charge() {
        System.out.println("Батарея заряжается");
    }

    public int getBattaryVolume() {
        return battaryVolume;
    }

    public void setBattaryVolume(int battaryVolume) {
        this.battaryVolume = battaryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public void energize() {
        charge();
    }
}
