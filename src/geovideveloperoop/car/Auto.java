package geovideveloperoop.car;

public class Auto {
    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Клас Ауто был иницилизирован");
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Автомобиль стартует");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Автомобиль останавливается");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed++;
        System.out.println("Автомобиль ускоряется со скоростью: " + kmPerHour);
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
