package geovideveloperoop.car;

public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, Engine engineType) {
        this.producer = producer;
        this.model = model;
        this.engine = engineType;
        System.out.println("Клас Ауто был иницилизирован");
    }

    public abstract void energize();
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

    public Engine getEngine() {
        return engine;
    }
}

